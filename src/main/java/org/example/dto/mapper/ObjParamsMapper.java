package org.example.dto.mapper;

import com.example.test.mapper.DTO.ObjParamsDto;
import com.example.test.model.ObjParams;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ObjParamsMapper {

    ObjParamsDto objParamsToObjParamsDTO(ObjParams objParams);

    ObjParams mapToObjParams(ObjParamsDto objParamsDto);
    }

