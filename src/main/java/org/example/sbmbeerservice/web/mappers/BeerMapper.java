package org.example.sbmbeerservice.web.mappers;

import org.example.sbmbeerservice.domain.Beer;
import org.example.sbmbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto toDto(Beer beer);

    Beer toEntity(BeerDto beerDto);
}
