package com.tfojuth.shop._common.event;

public class DomainEventPublisher {

    private static final DomainEventPublisher INSTANCE = new DomainEventPublisher(); // no lazy instantiation as we will _always_ need the event publisher

    public void publish(DomainEvent domainEvent) {
        // logic for event publishing here ...
    }

    /**
     * Static factory method necessary for accessing the DomainEventPublisher from the aggregates.
     *
     * @return The singleton instance of the DomainEventPublisher.
     */
    public static DomainEventPublisher getInstance() {
        return INSTANCE;
    }

}
