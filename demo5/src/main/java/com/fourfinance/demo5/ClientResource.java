package com.fourfinance.demo5;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/clients", produces = APPLICATION_JSON_VALUE)
public class ClientResource {

    private final ClientService clientService;

    @GetMapping
    public List<Client> clients() {
        return clientService.clients();
    }

}
