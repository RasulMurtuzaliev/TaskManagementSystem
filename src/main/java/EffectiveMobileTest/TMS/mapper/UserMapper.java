package EffectiveMobileTest.TMS.mapper;

import EffectiveMobileTest.TMS.dto.UserDto;
import EffectiveMobileTest.TMS.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
