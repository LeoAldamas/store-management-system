package leoaldamas.dev.storemanagementsystem.model.store;

import leoaldamas.dev.storemanagementsystem.model.Catalog;
import leoaldamas.dev.storemanagementsystem.model.Transaction;

import java.time.LocalDate;
import java.util.List;

public class Shipment extends Transaction {

    private LocalDate dateDeparture;
    private LocalDate dateDelivery;
    private float totalShipment;

    public LocalDate getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(LocalDate dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public LocalDate getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDate dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public float getTotalShipment() {
        return totalShipment;
    }

    public void setTotalShipment(float totalShipment) {
        this.totalShipment = totalShipment;
    }
}
