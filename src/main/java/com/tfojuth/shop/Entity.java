package com.tfojuth.shop;

import java.io.Serializable;

public interface Entity<T extends Serializable> {

    T id();

}
