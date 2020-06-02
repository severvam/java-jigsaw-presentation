package com.fourfinance.demo5;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClientService {

    List<Client> clients() {
        return List.of(new Client(1L, "Бажен Негодяев"));
    }

}
