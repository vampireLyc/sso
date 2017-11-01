package com.sso.entity;

import java.io.Serializable;

/**
 * Created by Lyc on 2017/10/31.
 */
public class Product implements Serializable{

    private static final long serialVersionUID = -578053749624880526L;

    private long id;
    private String name;
    private long price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
