package leoaldamas.dev.storemanagementsystem.model;

import java.util.List;

public class Transaction {

    private int idOrder;
    private int idStore;
    private int idUser;
    private List<Catalog> products;
    private String status;

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdStore() {
        return idStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public List<Catalog> getProducts() {
        return products;
    }

    public void setProducts(List<Catalog> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
