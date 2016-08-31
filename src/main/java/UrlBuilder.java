// stub urlbuilder

public class UrlBuilder {
    public final static String HOST = "https://api.getmondo.co.uk";
    public final static String ACCOUNTS = HOST + "/accounts";
    public static final String TRANSACTIONS = HOST + "/transactions";
    public static final String BALANCE = HOST + "/balance";


    public static String transactions(String accountId) {
        return TRANSACTIONS + "?account_id=" + accountId;
    }

    public static String balance(String accountId) {
        return BALANCE +  "?account_id=" + accountId;
    }
}
