package com.fourfinance.demo4.module2;

import com.fourfinance.demo4.module1.Client;
import com.fourfinance.demo4.module2.verysecretplace.FactoryService;

public class ClientService {

    Client client;

    public ClientService() {
        this.client = FactoryService.getClient();
    }

    public String getClientsName() {
        return client.getName();
    }

}
