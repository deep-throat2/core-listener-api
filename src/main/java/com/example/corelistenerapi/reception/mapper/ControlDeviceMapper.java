package com.example.corelistenerapi.reception.mapper;

import com.example.corelistenerapi.middle.dto.ControlDeviceDto;
import com.example.corelistenerapi.reception.model.ControlDevice;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class, uses = DataLinkMapper.class)
public interface ControlDeviceMapper {
    ControlDeviceDto toControlDeviceDto(ControlDevice controlDevice);
}
