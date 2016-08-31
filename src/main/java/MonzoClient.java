import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import model.*;

import java.io.IOException;
import java.util.List;

public class MonzoClient {
    private HttpTransport httpTransport;
    private JsonFactory jsonFactory;
    private String token;
    private String accountId;

    final static String APPLICATION_JSON = "application/json";

    public MonzoClient(String token, String account) {
        this.token = token;
        this.accountId = account;
        this.httpTransport = new NetHttpTransport();
        this.jsonFactory = new GsonFactory();
    }

    private String createAuthorization() {
        return "Bearer " + token;
    }

    private HttpHeaders createHeaders() {
        final HttpHeaders headers = new HttpHeaders();
        headers.setAuthorization(createAuthorization());
        headers.setContentType(APPLICATION_JSON);
        return headers;
    }

    private <T> T get(String url, Class<T> type) throws IOException {
        HttpRequest get = this.httpTransport
                .createRequestFactory(request -> request.setParser(new JsonObjectParser(jsonFactory)))
                .buildGetRequest(new GenericUrl(url));

        get.setHeaders(createHeaders());

        HttpResponse httpResponse = get.execute();
        if (httpResponse.isSuccessStatusCode()) {
            return httpResponse.parseAs(type);
        }

        // TODO: exception handling
        throw new IOException("Failed with : " + httpResponse.getStatusCode());
    }

    public void setTransport(HttpTransport transport) {
        this.httpTransport = transport;
    }

    public List<Account> getAccounts() throws IOException {
        Accounts content = get(UrlBuilder.ACCOUNTS, Accounts.class);
        return content.getAccounts();
    }

    public List<Transaction> getTransactions() throws IOException {
        Transactions transactions = get(UrlBuilder.transactions(accountId), Transactions.class);
        return transactions.getTransactions();
    }

    public Balance getBalance() throws IOException {
        return get(UrlBuilder.balance(accountId), Balance.class);
    }
}
