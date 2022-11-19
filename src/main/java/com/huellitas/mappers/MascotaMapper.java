package com.huellitas.mappers;

import com.huellitas.dtos.MascotaCreateDTO;
import com.huellitas.dtos.MascotaDTO;
import com.huellitas.dtos.MascotaUpdateDTO;
import com.huellitas.model.Mascota;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MascotaMapper {

    MascotaMapper INSTANCIA = Mappers.getMapper(MascotaMapper.class);

    MascotaDTO mascotaAMascotaDTO(Mascota mascota);
    Mascota    mascotaDTOAMascota(MascotaDTO mascotaDTO);
    Mascota    mascotaCreateDTOAMascota (MascotaCreateDTO mascotaCreateDTO);
    Mascota    mascotaUpdateDTOAMascota (MascotaUpdateDTO mascotaUpdateDTO);

    List<MascotaDTO> listaMascotaAListaMascotaDTO (List<Mascota> listaMascota);
}
