package com.example.sistemapetshop.service;

import com.example.sistemapetshop.entity.Client;
import com.example.sistemapetshop.repository.ClientRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientService {
    ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> list(){
        Sort sort = Sort.by("nome").ascending();
        return clientRepository.findAll(sort);
    }

    public List<Client> create(Client client){
        clientRepository.save(client);
        return list();
    }

    public List<Client> update(Client client){
        clientRepository.save(client);
        return list();
    }

    public List<Client> delete (Long id){
        clientRepository.deleteById(id);
        return list();
    }


}
