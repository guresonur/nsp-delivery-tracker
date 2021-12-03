package com.gures.nspdelivery.controller;

import com.gures.nspdelivery.model.Project;
import com.gures.nspdelivery.model.Server;
import com.gures.nspdelivery.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value = "/serversProject/{id}", produces = "application/json")
    public ResponseEntity<List<Server>> getServersByCustomerId (@PathVariable int id) {
        List<Server> servers = serverService.findServersByProjectId(id);
        return new ResponseEntity<>(servers, HttpStatus.OK);
    }

}
