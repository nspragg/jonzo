import com.google.api.client.testing.http.MockHttpTransport;
import model.Account;
import model.Balance;
import model.Transaction;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MonzoClientTest {

    private final static String ACCOUNT_ID = System.getenv("ACCOUNT_ID");
    private final static String TOKEN = System.getenv("ACCESS_TOKEN");
    private MonzoClient client;

    @Before
    public void setUp() throws Exception {
        client = new MonzoClient(TOKEN, ACCOUNT_ID);
    }

    @Test
    public void accounts() throws IOException {
        MockHttpTransport transport = MockTransport.create(200, Fixtures.getContents("accounts.json"));
        client.setTransport(transport);
        List<Account> accounts = client.getAccounts();

        assertThat(accounts.size(), is(1));
    }

    @Test
    public void transactions() throws IOException {
        MockHttpTransport transport = MockTransport.create(200, Fixtures.getContents("transactions.json"));
        client.setTransport(transport);

//        List<Transaction> transactions = client.getTransactions()
//                .stream()
//                .filter(transaction -> transaction.getAccountBalance() > 10)
//                .collect(Collectors.toList());

        List<Transaction> transactions = client.getTransactions();
        assertThat(transactions.size(), is(40));
    }

    @Test
    public void balance() throws IOException {
        MockHttpTransport transport = MockTransport.create(200, Fixtures.getContents("balance.json"));
        client.setTransport(transport);

        Balance balance = client.getBalance();

        assertThat(balance.getBalance(), is(5833));
        assertThat(balance.getCurrency(), is("GBP"));
    }
}
