package leoaldamas.dev.storemanagementsystem.model.users;

import leoaldamas.dev.storemanagementsystem.model.User;

public class StoreUser extends User {

    private int idStore;
    private String email;

    public int getIdStore() {
        return idStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
