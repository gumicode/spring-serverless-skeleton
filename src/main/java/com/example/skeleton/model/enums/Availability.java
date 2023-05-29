package com.example.skeleton.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Availability {

    OK("01"),
    INCIDENT("02"),
    MAINTENANCE("03"),
    OTHER("99");

    private final String code;
}