package model;

import com.google.api.client.util.Key;

/**
 * Created by spragn01 on 26/08/2016.
 */
public class Account {
    @Key
    private String id;
    @Key
    private String created;
    @Key
    private String description;

    public String getId() {
        return id;
    }

    public String getCreated() {
        return created;
    }

    public String getDescription() {
        return description;
    }
}
