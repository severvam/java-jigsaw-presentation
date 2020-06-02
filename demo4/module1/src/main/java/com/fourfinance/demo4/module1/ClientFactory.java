package com.fourfinance.demo4.module1;

import com.fourfinance.demo4.module1.secret.ClientImpl;

public class ClientFactory {

    public static ClientFactory getInstance() {
        return new ClientFactory();
    }

    public Client createClient(String name) {
        return new ClientImpl(name);
    }

}
