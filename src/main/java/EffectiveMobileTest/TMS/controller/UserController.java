package EffectiveMobileTest.TMS.controller;

import EffectiveMobileTest.TMS.dto.UserDto;
import EffectiveMobileTest.TMS.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@Tag(name = "Users", description = "User management API")
public class UserController {

    private final UserService userService;

    @PostMapping("/")
    @Operation(summary = "Create user")
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
