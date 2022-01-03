package com.burakkocak.practicingservice.samplingentities.service.mapper;

import com.burakkocak.practicingservice.samplingentities.data.entity.User;
import com.burakkocak.practicingservice.samplingentities.service.dto.UserResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserResponse, User> {

    @Override
    User toEntity(UserResponse userResponse);

    @Override
    UserResponse toDto(User user);

    @Override
    List<User> toEntity(List<UserResponse> dtoList);

    @Override
    List<UserResponse> toDto(List<User> entityList);
}
