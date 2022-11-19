package com.huellitas.service;

import com.huellitas.dtos.MascotaCreateDTO;
import com.huellitas.dtos.MascotaDTO;
import com.huellitas.dtos.MascotaUpdateDTO;

import java.util.List;

public interface MascotaService {

    List<MascotaDTO> listarMascotas();
    MascotaDTO obtenerMascotaPorID(long id);
    MascotaDTO registrarMascota(MascotaCreateDTO mascotaCreateDTO);
    MascotaDTO actualizarMascota(MascotaUpdateDTO mascotaUpdateDTO);
    String eliminarMascota(long id);
}
