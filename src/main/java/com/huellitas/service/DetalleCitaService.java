package com.huellitas.service;

import com.huellitas.dtos.DetalleCitaCreateDTO;
import com.huellitas.dtos.DetalleCitaDTO;
import com.huellitas.dtos.DetalleCitaUpdateDTO;

import java.util.List;

public interface DetalleCitaService {

    List<DetalleCitaDTO> listarDetalleCitas();
    DetalleCitaDTO obtenerDetalleCitaPorID(long id);
    DetalleCitaDTO registrarDetalleCita(DetalleCitaCreateDTO detalleCitaCreateDTO);
    DetalleCitaDTO actualizarDetalleCita(DetalleCitaUpdateDTO detalleCitaUpdateDTO);
    String eliminarDetalleCita(long id);
}
