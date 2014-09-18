package com.tfojuth.shop._common.event;

import java.io.Serializable;
import java.util.Date;

public abstract class DomainEvent implements Serializable {

    private final Date occurredOn;

    protected DomainEvent() {
        this.occurredOn = new Date();
    }

    public Date occurredOn() {
        return occurredOn;
    }

}
