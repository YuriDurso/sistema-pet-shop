package com.example.sistemapetshop.controller;

import com.example.sistemapetshop.entity.Client;
import com.example.sistemapetshop.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    List<Client> create(@RequestBody Client client) {
        return clientService.create(client);
    }

    @GetMapping
    List<Client> list() {
        return clientService.list();
    }

    @PutMapping
    List<Client> update(@RequestBody Client client){
        return clientService.update(client);
    }

    @DeleteMapping("{id}")
    List<Client> delete(@PathVariable Long id){
        return clientService.delete(id);
    }


}
