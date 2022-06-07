package com.devomar.acuiferos.domain.service;

import com.devomar.acuiferos.domain.dto.Aquifer;
import com.devomar.acuiferos.domain.repository.AquiferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AquiferService {

    @Autowired
    private AquiferRepository aquiferRepository;

    public List<Aquifer> getAll(){
        return aquiferRepository.getAll();
    }
}
