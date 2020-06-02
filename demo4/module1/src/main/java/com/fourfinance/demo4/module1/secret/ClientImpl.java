package com.fourfinance.demo4.module1.secret;

import com.fourfinance.demo4.module1.Client;

public class ClientImpl implements Client {

    private final String name;

    public ClientImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
