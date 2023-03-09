package leoaldamas.dev.storemanagementsystem.model.users;

import leoaldamas.dev.storemanagementsystem.model.Store;
import leoaldamas.dev.storemanagementsystem.model.User;

import java.util.List;

public class WarehouseUser extends User {

    private String email;
    private List<Store> stores;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
