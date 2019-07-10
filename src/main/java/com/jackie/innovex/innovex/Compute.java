package com.jackie.innovex.innovex;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
public class Compute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;
    private int month;
    private String initial;
    private String total;
    private String interest;
    private String generated;
    private String initialgenerated;

    public Compute( int month, String initial, String total, String interest, String generated, String initialgenerated) {
        this.month = month;
        this.initial = initial;
        this.total = total;
        this.interest = interest;
        this.generated = generated;
        this.initialgenerated = initialgenerated;
    }

    public Compute() {}

    public int getMonth() {
        return month;
    }

    public String getInitial() {
        return initial;
    }

    public String getTotal() {
        return total;
    }

    public String getInterest() {
        return interest;
    }

    public String getGenerated() {
        return generated;
    }

    public String getInitialgenerated() {
        return initialgenerated;
    }
}
