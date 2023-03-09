package leoaldamas.dev.storemanagementsystem.model.store;

import leoaldamas.dev.storemanagementsystem.model.Transaction;

import java.time.LocalDate;

public class Refund extends Transaction {

    private LocalDate dateRefund;
    private float totalRefund;

    public LocalDate getDateRefund() {
        return dateRefund;
    }

    public void setDateRefund(LocalDate dateRefund) {
        this.dateRefund = dateRefund;
    }

    public float getTotalRefund() {
        return totalRefund;
    }

    public void setTotalRefund(float totalRefund) {
        this.totalRefund = totalRefund;
    }
}
