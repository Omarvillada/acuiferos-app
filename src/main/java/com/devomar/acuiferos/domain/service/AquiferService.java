package com.devomar.acuiferos.domain.service;

import com.devomar.acuiferos.domain.dto.Aquifer;
import com.devomar.acuiferos.domain.repository.AquiferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AquiferService {

    @Autowired
    private AquiferRepository aquiferRepository;

    public List<Aquifer> getAll(){
        return aquiferRepository.getAll();
    }
    public Optional<Aquifer> getAquifer(Long aquiferId){
        return aquiferRepository.getAquifer(aquiferId);
    }
    public Aquifer save(Aquifer aquifer){
        return aquiferRepository.save(aquifer);
    }
    public boolean delete(Long aquiferId){
        return getAquifer(aquiferId).map(aquifer -> {
            aquiferRepository.delete(aquiferId);
            return true;
        }).orElse(false);
    }
}
