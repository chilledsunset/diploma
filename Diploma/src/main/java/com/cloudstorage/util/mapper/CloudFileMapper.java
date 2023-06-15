package com.cloudstorage.util.mapper;

import com.cloudstorage.entities.CloudFile;
import com.cloudstorage.dto.entity.CloudFileDto;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CloudFileMapper {

    ModelMapper modelMapper;

    @Autowired
    public CloudFileMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CloudFileDto fromCloudFileToDto(CloudFile file) {
        return this.modelMapper.map(file, CloudFileDto.class);
    }


}

