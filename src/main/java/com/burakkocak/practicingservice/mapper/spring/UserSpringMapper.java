package com.burakkocak.practicingservice.mapper.spring;

import com.burakkocak.practicingservice.samplingentities.data.entity.User;
import com.burakkocak.practicingservice.samplingentities.service.dto.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserSpringMapper {

    List<UserResponse> map(List<User> userList);

    //@Mapping(source = "nameInUser", target = "nameInUserResponse", expression = "java(myMethod(myInput))")
    //@Mapping(source = "nameInUser", target = "nameInUserResponse", qualifiedByName = "specialMappingMethod")
    UserResponse map(User user);

    @Named("specialMappingMethod")
    default String returnMyNameAndSurname(String name) {
        return name + " KOCAK";
    }

}
