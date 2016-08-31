package model;

import com.google.api.client.util.Key;

import java.util.Collections;
import java.util.List;

/**
 * Created by spragn01 on 26/08/2016.
 */
public class Accounts {
    @Key("accounts")
    private List<Account> accounts = Collections.emptyList();

    public List<Account> getAccounts() {
        return accounts;
    }
}
