package model;

import com.google.api.client.util.Key;

import java.util.Collections;
import java.util.List;

/**
 * Created by spragn01 on 26/08/2016.
 */
public class Transactions {
    @Key("transactions")
    private List<Transaction> transactions = Collections.EMPTY_LIST;

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
