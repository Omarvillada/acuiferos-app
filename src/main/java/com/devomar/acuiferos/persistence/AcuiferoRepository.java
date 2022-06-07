package com.devomar.acuiferos.persistence;

import com.devomar.acuiferos.domain.dto.Aquifer;
import com.devomar.acuiferos.domain.repository.AquiferRepository;
import com.devomar.acuiferos.persistence.crud.AcuiferoCrudRepository;
import com.devomar.acuiferos.persistence.entity.Acuifero;
import com.devomar.acuiferos.persistence.mapper.AquiferMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AcuiferoRepository implements AquiferRepository {


    @Autowired
    private AcuiferoCrudRepository acuiferoCrudRepository;

    @Autowired
    private AquiferMapper mapper;

    @Override
    public List<Aquifer> getAll() {
        List<Acuifero> acuiferos = (List<Acuifero>) acuiferoCrudRepository.findAll();
        return mapper.toAquifers(acuiferos);
    }

    @Override
    public Optional<List<Aquifer>> getByTypeWater(String typeWater) {
        return Optional.empty();
    }

    @Override
    public Aquifer save(Aquifer aquifer) {
        return null;
    }

    @Override
    public void delete(Long aquiferId) {

    }
}
