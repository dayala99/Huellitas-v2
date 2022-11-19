package com.huellitas.service;

import com.huellitas.dtos.ServicioCreateDTO;
import com.huellitas.dtos.ServicioDTO;
import com.huellitas.dtos.ServicioUpdateDTO;

import java.util.List;

public interface ServicioService {

    List<ServicioDTO> listarServicios();
    ServicioDTO obtenerServicioPorID(long id);
    ServicioDTO registrarServicio(ServicioCreateDTO servicioCreateDTO);
    ServicioDTO actualizarServicio(ServicioUpdateDTO servicioUpdateDTO);
    String eliminarServicio(long id);
}
