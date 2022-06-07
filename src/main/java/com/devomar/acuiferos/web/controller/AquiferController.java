package com.devomar.acuiferos.web.controller;

import com.devomar.acuiferos.domain.dto.Aquifer;
import com.devomar.acuiferos.domain.service.AquiferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    public ResponseEntity<Aquifer> getAquifer(@PathVariable("id") Long idAquifer){
        return aquiferService.getAquifer(idAquifer)
                .map(aquifer -> new ResponseEntity<>(aquifer, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<Aquifer> save(@RequestBody Aquifer aquifer){
        return new ResponseEntity<>(aquiferService.save(aquifer), HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity delete(@PathVariable("id") Long aquiferId){
        if (aquiferService.delete(aquiferId)){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
