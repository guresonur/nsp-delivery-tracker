package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Server;
import com.gures.nspdelivery.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping(value = "/serverList", produces = "application/json")
    public List<Server> getServers()
    {
        return serverRepository.findAll();
    }

    @PostMapping(value = "/addServer", consumes = "application/json", produces = "application/json")
    public Server addServer(@RequestBody Server server) {
        return serverRepository.save(server);
    }

}
