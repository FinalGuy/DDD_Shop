package com.tfojuth.shop._common;

import java.io.Serializable;

public interface Entity<T extends Serializable> {

    T id();

}
