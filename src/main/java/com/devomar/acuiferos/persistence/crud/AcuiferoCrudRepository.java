package com.devomar.acuiferos.persistence.crud;

import com.devomar.acuiferos.persistence.entity.Acuifero;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AcuiferoCrudRepository extends CrudRepository<Acuifero, Long> {


    //Query Methods
    List<Acuifero> findByTipoCuerpoAgua(String tipoCuerpoAgua);
    List<Acuifero> findByTipoAgua(String tipoAgua);
    List<Acuifero> findByDistribucionGeografica(String distribucion);
}
