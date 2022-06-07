package com.devomar.acuiferos.persistence.mapper;

import com.devomar.acuiferos.domain.dto.Aquifer;
import com.devomar.acuiferos.persistence.entity.Acuifero;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AquiferMapper {

    @Mappings({
        @Mapping(source = "id", target = "aquiferId"),
        @Mapping(source = "descrpcion", target = "description"),
        @Mapping(source = "tipoCuerpoAgua", target = "waterBodyType"),
        @Mapping(source = "tipoAgua", target = "typeWater"),
        @Mapping(source = "distribucionGeografica", target = "geoDistribution"),
    })
    Aquifer toAquifer(Acuifero acuifero);

    List<Aquifer> toAquifers(List<Acuifero> acuiferos);

    @InheritInverseConfiguration
    @Mapping(target = "extension", ignore = true)
    @Mapping(target = "estado", ignore = true)
    Acuifero toAcuifero(Aquifer aquifer);
}
