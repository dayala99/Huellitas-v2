package com.huellitas.mappers;

import com.huellitas.dtos.DetalleCitaCreateDTO;
import com.huellitas.dtos.DetalleCitaDTO;
import com.huellitas.dtos.DetalleCitaUpdateDTO;
import com.huellitas.model.DetalleCita;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DetalleCitaMapper {

    DetalleCitaMapper INSTANCIA = Mappers.getMapper(DetalleCitaMapper.class);

    DetalleCitaDTO detalleCitaADetalleCitaDTO(DetalleCita detalleCita);
    DetalleCita    detalleCitaDTOADetalleCita(DetalleCitaDTO detalleCitaDTO);
    DetalleCita    detalleCitaCreateDTOADetalleCita (DetalleCitaCreateDTO detalleCitaCreateDTO);
    DetalleCita    detalleCitaUpdateDTOADetalleCita (DetalleCitaUpdateDTO detalleCitaUpdateDTO);

    List<DetalleCitaDTO> listaDetalleCitaAListaDetalleCitaDTO (List<DetalleCita> listaDetalleCita);
}
