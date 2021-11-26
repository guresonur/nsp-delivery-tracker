package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Server;
import com.gures.nspdelivery.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @GetMapping(value = "/serverList", produces = "application/json")
    public List<Server> getServers()
    {
        return serverService.findAllServers();
    }

    @PostMapping(value = "/addServer", consumes = "application/json", produces = "application/json")
    public Server addServer(@RequestBody Server server) {
        return serverService.addServer(server);
    }

}
