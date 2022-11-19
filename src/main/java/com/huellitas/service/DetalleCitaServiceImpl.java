package com.huellitas.service;

import com.huellitas.dtos.DetalleCitaCreateDTO;
import com.huellitas.dtos.DetalleCitaDTO;
import com.huellitas.dtos.DetalleCitaUpdateDTO;
import com.huellitas.mappers.DetalleCitaMapper;
import com.huellitas.model.DetalleCita;
import com.huellitas.repository.DetalleCitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleCitaServiceImpl implements DetalleCitaService {

    @Autowired
    private DetalleCitaRepository detalleCitaRepository;

    @Override
    public List<DetalleCitaDTO> listarDetalleCitas() {
        return DetalleCitaMapper.INSTANCIA.listaDetalleCitaAListaDetalleCitaDTO(detalleCitaRepository.findAll());
    }

    @Override
    public DetalleCitaDTO obtenerDetalleCitaPorID(long id) {
        Optional<DetalleCita> detalleCitaOptional = detalleCitaRepository.findById(id);
        DetalleCitaDTO detalleCitaDTO;
        if (detalleCitaOptional.isPresent()){
            detalleCitaDTO = DetalleCitaMapper.INSTANCIA.detalleCitaADetalleCitaDTO(detalleCitaOptional.get());
        }else{
            detalleCitaDTO = null;
        }
        return detalleCitaDTO;
    }

    @Override
    public DetalleCitaDTO registrarDetalleCita(DetalleCitaCreateDTO detalleCitaCreateDTO) {
        DetalleCita detalleCita = DetalleCitaMapper.INSTANCIA.detalleCitaCreateDTOADetalleCita(detalleCitaCreateDTO);
        DetalleCita respuestaEntity = detalleCitaRepository.save(detalleCita);
        return DetalleCitaMapper.INSTANCIA.detalleCitaADetalleCitaDTO(respuestaEntity);
    }

    @Override
    public DetalleCitaDTO actualizarDetalleCita(DetalleCitaUpdateDTO detalleCitaUpdateDTO) {
        DetalleCita detalleCita = DetalleCitaMapper.INSTANCIA.detalleCitaUpdateDTOADetalleCita(detalleCitaUpdateDTO);
        DetalleCita respuestaEntity = detalleCitaRepository.save(detalleCita);
        return DetalleCitaMapper.INSTANCIA.detalleCitaADetalleCitaDTO(respuestaEntity);
    }

    @Override
    public String eliminarDetalleCita(long id) {
        Optional<DetalleCita> detalleCitaOptional = detalleCitaRepository.findById(id);
        String resultado;
        if (detalleCitaOptional.isPresent()){
            detalleCitaRepository.delete(detalleCitaOptional.get());
            resultado = "Registro eliminado";
        }else{
            resultado = "No se puede eliminar el registro";
        }
        return resultado;
    }
}
