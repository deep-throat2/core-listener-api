package com.example.corelistenerapi.reception.mapper;

import com.example.corelistenerapi.middle.dto.DataLinkDto;
import com.example.corelistenerapi.reception.model.DataLink;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface DataLinkMapper {
    DataLinkDto toDataLinkDto(DataLink dataLink);
}
