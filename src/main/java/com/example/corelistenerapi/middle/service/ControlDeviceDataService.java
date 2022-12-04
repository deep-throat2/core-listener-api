package com.example.corelistenerapi.middle.service;

import com.example.corelistenerapi.middle.dto.ControlDeviceDto;
import com.example.corelistenerapi.middle.repository.ControlDeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// сервисы этого проекта будут принимать данные от сервера и сохранять/обрабатывать их
@Service
@RequiredArgsConstructor
public class ControlDeviceDataService {
    private final ControlDeviceRepository controlDeviceRepository;
    public void save(ControlDeviceDto controlDeviceDto) {
        controlDeviceRepository.save(controlDeviceDto);
    }

    public ControlDeviceDto get(long id) {
        return controlDeviceRepository.findById(id);
    }
}
