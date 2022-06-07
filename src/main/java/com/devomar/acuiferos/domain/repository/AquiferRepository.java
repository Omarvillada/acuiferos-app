package com.devomar.acuiferos.domain.repository;

import com.devomar.acuiferos.domain.dto.Aquifer;

import java.util.List;
import java.util.Optional;

public interface AquiferRepository {

    List<Aquifer> getAll();
    Optional<List<Aquifer>> getByTypeWater(String typeWater);
    Aquifer save(Aquifer aquifer);
    void delete(Long aquiferId);
}
