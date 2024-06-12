package com.dextris.SpringBootDTO.mapper;

import com.dextris.SpringBootDTO.dto.UserDto;
import com.dextris.SpringBootDTO.entity.User;
//import org.mapstruct.Mapper;
@Mapper
public interface AutoUserMapper {


    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
