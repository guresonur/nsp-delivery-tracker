package com.gures.nspdelivery.service;

import com.gures.nspdelivery.model.Server;
import com.gures.nspdelivery.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServerService {
    @Autowired
    private ServerRepository serverRepository;

    public Server addServer(Server Server) {
        return serverRepository.save(Server);
    }

    public List<Server> findAllServers() {
        return serverRepository.findAll();
    }

    public Optional<Server> getServerById(int id) {
        return serverRepository.findById(id);
    }

    public void removeServerById(int id) {
        serverRepository.deleteById(id);
    }
}
