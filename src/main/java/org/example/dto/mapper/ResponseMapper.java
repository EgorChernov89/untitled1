package org.example.dto.mapper;

import com.example.test.mapper.DTO.ResponseDto;
import com.example.test.model.Response;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResponseMapper {
    ResponseDto ResponseToResponseDTO(Response response);

    Response mapToResponse(ResponseDto responseDto);
}
