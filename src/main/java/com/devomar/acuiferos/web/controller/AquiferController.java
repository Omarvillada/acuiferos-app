package com.devomar.acuiferos.web.controller;

import com.devomar.acuiferos.domain.dto.Aquifer;
import com.devomar.acuiferos.domain.service.AquiferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aquifers")
public class AquiferController {

    @Autowired
    private AquiferService aquiferService;

    @GetMapping("/all")
    public ResponseEntity<List<Aquifer>> getAll(){
        return new ResponseEntity<>(aquiferService.getAll(), HttpStatus.OK);
    }
}
