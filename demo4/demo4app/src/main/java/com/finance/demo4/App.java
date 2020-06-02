package com.finance.demo4;

import com.fourfinance.demo4.module2.ClientService;

public class App {

    public static void main(String[] args) {
        var clientService = new ClientService();
        var clientsName = clientService.getClientsName();
        System.out.println("Name of client " + clientsName);
    }

}
