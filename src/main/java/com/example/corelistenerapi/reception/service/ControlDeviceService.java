package com.example.corelistenerapi.reception.service;

import com.example.corelistenerapi.middle.service.ControlDeviceDataService;
import com.example.corelistenerapi.reception.mapper.ControlDeviceMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ControlDeviceService {
    private final ControlDeviceDataService controlDeviceDataService;
    private final ControlDeviceMapper controlDeviceMapper;
    private final ControlDeviceJsonService controlDeviceJsonService;

    @SneakyThrows
    public void saveJson(String json) {
        log.debug("saveJson: {}", json);

        controlDeviceDataService.save(
                controlDeviceMapper.toControlDeviceDto(controlDeviceJsonService.getControlDevice(json))
        );
    }
}
