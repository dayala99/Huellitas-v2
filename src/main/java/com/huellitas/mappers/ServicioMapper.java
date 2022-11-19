package com.huellitas.mappers;

import com.huellitas.dtos.ServicioCreateDTO;
import com.huellitas.dtos.ServicioDTO;
import com.huellitas.dtos.ServicioUpdateDTO;
import com.huellitas.model.Servicio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ServicioMapper {

    ServicioMapper INSTANCIA = Mappers.getMapper(ServicioMapper.class);

    ServicioDTO servicioAServicioDTO(Servicio servicio);
    Servicio    servicioDTOAServicio(ServicioDTO servicioDTO);
    Servicio    servicioCreateDTOAServicio (ServicioCreateDTO servicioCreateDTO);
    Servicio    servicioUpdateDTOAServicio (ServicioUpdateDTO servicioUpdateDTO);

    List<ServicioDTO> listaServicioAListaServicioDTO (List<Servicio> listaServicio);
}
