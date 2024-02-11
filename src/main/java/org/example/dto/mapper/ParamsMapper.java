package org.example.dto.mapper;

import com.example.test.mapper.DTO.ParamsDto;
import com.example.test.model.Params;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParamsMapper {
    ParamsDto paramsToParamsDTO(Params params);

    Params mapToParams(ParamsDto paramsDto);
}
