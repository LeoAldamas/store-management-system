package leoaldamas.dev.storemanagementsystem.model.store;

import leoaldamas.dev.storemanagementsystem.model.Catalog;
import leoaldamas.dev.storemanagementsystem.model.Transaction;

import java.time.LocalDate;
import java.util.List;

public class Order extends Transaction {

    private LocalDate dateOrder;
    private float totalOrder;

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public float getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(float totalOrder) {
        this.totalOrder = totalOrder;
    }
}
