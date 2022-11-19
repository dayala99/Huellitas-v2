package com.huellitas.mappers;

import com.huellitas.dtos.LocalCreateDTO;
import com.huellitas.dtos.LocalDTO;
import com.huellitas.dtos.LocalUpdateDTO;
import com.huellitas.model.Local;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LocalMapper {

    LocalMapper INSTANCIA = Mappers.getMapper(LocalMapper.class);

    LocalDTO localALocalDTO(Local local);
    Local    localDTOALocal(LocalDTO localDTO);
    Local    localCreateDTOALocal (LocalCreateDTO localCreateDTO);
    Local    localUpdateDTOALocal (LocalUpdateDTO localUpdateDTO);

    List<LocalDTO> listaLocalAListaLocalDTO (List<Local> listaLocal);
}
