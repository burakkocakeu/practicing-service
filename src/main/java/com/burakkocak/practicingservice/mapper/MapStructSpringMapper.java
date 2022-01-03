package com.burakkocak.practicingservice.mapper;

import com.burakkocak.practicingservice.samplingentities.data.entity.User;
import com.burakkocak.practicingservice.samplingentities.service.dto.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface MapStructSpringMapper {

    //@Mapping(source = "nameInUser", target = "nameInUserResponse", expression = "java(myMethod(myInput))")
    //@Mapping(source = "nameInUser", target = "nameInUserResponse", qualifiedByName = "specialMappingMethod")
    UserResponse map(User user);

    @Named("specialMappingMethod")
    default String returnMyNameAndSurname(String name) {
        return name + " KOCAK";
    }

}
