package leoaldamas.dev.storemanagementsystem.model.store;

import leoaldamas.dev.storemanagementsystem.model.Transaction;

import java.time.LocalDate;

public class Incidence extends Transaction {

    private LocalDate dateIncidence;
    private String solution;

    public LocalDate getDateIncidence() {
        return dateIncidence;
    }

    public void setDateIncidence(LocalDate dateIncidence) {
        this.dateIncidence = dateIncidence;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
