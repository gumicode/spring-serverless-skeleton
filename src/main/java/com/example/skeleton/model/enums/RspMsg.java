package com.example.skeleton.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RspMsg {

    OK("00000");

    private final String code;
}