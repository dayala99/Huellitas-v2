package com.huellitas.service;

import com.huellitas.dtos.LocalCreateDTO;
import com.huellitas.dtos.LocalDTO;
import com.huellitas.dtos.LocalUpdateDTO;

import java.util.List;

public interface LocalService {

    List<LocalDTO> listarLocals();
    LocalDTO obtenerLocalPorID(long id);
    LocalDTO registrarLocal(LocalCreateDTO localCreateDTO);
    LocalDTO actualizarLocal(LocalUpdateDTO localUpdateDTO);
    String eliminarLocal(long id);
}
