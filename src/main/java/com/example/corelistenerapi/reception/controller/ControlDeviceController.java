package com.example.corelistenerapi.reception.controller;

import com.example.corelistenerapi.middle.service.ControlDeviceDataService;
import com.example.corelistenerapi.reception.mapper.ControlDeviceMapper;
import com.example.corelistenerapi.reception.model.ControlDevice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Vector;

////// это будет ws контроллер (или кафка линистр)
@RestController
@RequiredArgsConstructor
public class ControlDeviceController {
    private final ControlDeviceMapper controlDeviceMapper;
    private final ControlDeviceDataService controlDeviceDataService;

    @PostConstruct
    public void initWs(){
        Client client = new Client( 7777, new Vector<>());
        client.startClient();
    }

    ////// получаем откуда-то
    public void get(ControlDevice controlDevice) {
        controlDeviceDataService.save(controlDeviceMapper.toControlDeviceDto(controlDevice));
    }
}
