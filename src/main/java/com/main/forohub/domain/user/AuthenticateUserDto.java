package com.main.forohub.domain.user;

public record AuthenticateUserDto(
        String username,
        String password
) { }
