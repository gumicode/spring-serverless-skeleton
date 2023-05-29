package com.example.skeleton.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RspCode {

    OK("200");

    private final String code;
}