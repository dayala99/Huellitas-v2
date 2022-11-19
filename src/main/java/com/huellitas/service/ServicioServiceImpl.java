package com.huellitas.service;

import com.huellitas.dtos.ServicioCreateDTO;
import com.huellitas.dtos.ServicioDTO;
import com.huellitas.dtos.ServicioUpdateDTO;
import com.huellitas.mappers.ServicioMapper;
import com.huellitas.model.Servicio;
import com.huellitas.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<ServicioDTO> listarServicios() {
        return ServicioMapper.INSTANCIA.listaServicioAListaServicioDTO(servicioRepository.findAll());
    }

    @Override
    public ServicioDTO obtenerServicioPorID(long id) {
        Optional<Servicio> servicioOptional = servicioRepository.findById(id);
        ServicioDTO servicioDTO;
        if (servicioOptional.isPresent()){
            servicioDTO = ServicioMapper.INSTANCIA.servicioAServicioDTO(servicioOptional.get());
        }else{
            servicioDTO = null;
        }
        return servicioDTO;
    }

    @Override
    public ServicioDTO registrarServicio(ServicioCreateDTO servicioCreateDTO) {
        Servicio servicio = ServicioMapper.INSTANCIA.servicioCreateDTOAServicio(servicioCreateDTO);
        Servicio respuestaEntity = servicioRepository.save(servicio);
        return ServicioMapper.INSTANCIA.servicioAServicioDTO(respuestaEntity);
    }

    @Override
    public ServicioDTO actualizarServicio(ServicioUpdateDTO servicioUpdateDTO) {
        Servicio servicio = ServicioMapper.INSTANCIA.servicioUpdateDTOAServicio(servicioUpdateDTO);
        Servicio respuestaEntity = servicioRepository.save(servicio);
        return ServicioMapper.INSTANCIA.servicioAServicioDTO(respuestaEntity);
    }

    @Override
    public String eliminarServicio(long id) {
        Optional<Servicio> servicioOptional = servicioRepository.findById(id);
        String resultado;
        if (servicioOptional.isPresent()){
            servicioRepository.delete(servicioOptional.get());
            resultado = "Registro eliminado";
        }else{
            resultado = "No se puede eliminar el registro";
        }
        return resultado;
    }
}
