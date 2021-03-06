package ro.agilehub.javacourse.car.hire.user.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ro.agilehub.javacourse.car.hire.api.model.CountryDTO;
import ro.agilehub.javacourse.car.hire.user.service.userDomain.CountryDomain;

@Mapper(componentModel = "spring")
public interface CountryDTOMapper {

    @Mapping(source = "id", target = "id")
    CountryDTO toCountryDTO(CountryDomain countryDomain);

    @Mapping(source = "id", target = "id")
    CountryDomain countryDTOtoCountryDomain(CountryDTO countryDTO);
}
