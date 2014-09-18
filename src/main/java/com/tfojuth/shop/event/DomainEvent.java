package com.tfojuth.shop.event;

import java.io.Serializable;
import java.util.Date;

public abstract class DomainEvent implements Serializable {

    private final Date createOn;

    protected DomainEvent() {
        this.createOn = new Date();
    }

}
