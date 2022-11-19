package com.huellitas.service;

import com.huellitas.dtos.LocalCreateDTO;
import com.huellitas.dtos.LocalDTO;
import com.huellitas.dtos.LocalUpdateDTO;
import com.huellitas.mappers.LocalMapper;
import com.huellitas.model.Local;
import com.huellitas.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalServiceImpl implements LocalService {

    @Autowired
    private LocalRepository localRepository;

    @Override
    public List<LocalDTO> listarLocals() {
        return LocalMapper.INSTANCIA.listaLocalAListaLocalDTO(localRepository.findAll());
    }

    @Override
    public LocalDTO obtenerLocalPorID(long id) {
        Optional<Local> localOptional = localRepository.findById(id);
        LocalDTO localDTO;
        if (localOptional.isPresent()){
            localDTO = LocalMapper.INSTANCIA.localALocalDTO(localOptional.get());
        }else{
            localDTO = null;
        }
        return localDTO;
    }

    @Override
    public LocalDTO registrarLocal(LocalCreateDTO localCreateDTO) {
        Local local = LocalMapper.INSTANCIA.localCreateDTOALocal(localCreateDTO);
        Local respuestaEntity = localRepository.save(local);
        return LocalMapper.INSTANCIA.localALocalDTO(respuestaEntity);
    }

    @Override
    public LocalDTO actualizarLocal(LocalUpdateDTO localUpdateDTO) {
        Local local = LocalMapper.INSTANCIA.localUpdateDTOALocal(localUpdateDTO);
        Local respuestaEntity = localRepository.save(local);
        return LocalMapper.INSTANCIA.localALocalDTO(respuestaEntity);
    }

    @Override
    public String eliminarLocal(long id) {
        Optional<Local> localOptional = localRepository.findById(id);
        String resultado;
        if (localOptional.isPresent()){
            localRepository.delete(localOptional.get());
            resultado = "Registro eliminado";
        }else{
            resultado = "No se puede eliminar el registro";
        }
        return resultado;
    }
}
