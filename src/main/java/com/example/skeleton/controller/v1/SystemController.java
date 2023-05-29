package com.example.skeleton.controller.v1;

import com.example.skeleton.model.enums.Availability;
import com.example.skeleton.model.enums.RspCode;
import com.example.skeleton.model.enums.RspMsg;
import com.example.skeleton.model.response.v1.SystemHealthResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/system")
public class SystemController {

    @GetMapping("/health")
    public SystemHealthResponse getHealth() {
        return SystemHealthResponse.builder()
                .rspCode(RspCode.OK.getCode())
                .rspMsg(RspMsg.OK.getCode())
                .availability(Availability.OK.getCode())
                .build();
    }
}
