package leoaldamas.dev.storemanagementsystem.model;

import java.io.Serializable;
import java.util.List;

public class Store {

    private int idStore;
    private String address;
    private String type;
    private List<Catalog> products;

    public int getIdStore() {
        return idStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Catalog> getProducts() {
        return products;
    }

    public void setProducts(List<Catalog> products) {
        this.products = products;
    }
}
