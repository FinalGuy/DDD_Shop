package com.breuninger.shop.common;

import java.io.Serializable;

public interface Entity<T extends Serializable> {

    T id();

}
