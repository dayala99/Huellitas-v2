package com.huellitas.service;

import com.huellitas.dtos.MascotaCreateDTO;
import com.huellitas.dtos.MascotaDTO;
import com.huellitas.dtos.MascotaUpdateDTO;
import com.huellitas.mappers.MascotaMapper;
import com.huellitas.model.Mascota;
import com.huellitas.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public List<MascotaDTO> listarMascotas() {
        return MascotaMapper.INSTANCIA.listaMascotaAListaMascotaDTO(mascotaRepository.findAll());
    }

    @Override
    public MascotaDTO obtenerMascotaPorID(long id) {
        Optional<Mascota> mascotaOptional = mascotaRepository.findById(id);
        MascotaDTO mascotaDTO;
        if (mascotaOptional.isPresent()){
            mascotaDTO = MascotaMapper.INSTANCIA.mascotaAMascotaDTO(mascotaOptional.get());
        }else{
            mascotaDTO = null;
        }
        return mascotaDTO;
    }

    @Override
    public MascotaDTO registrarMascota(MascotaCreateDTO mascotaCreateDTO) {
        Mascota mascota = MascotaMapper.INSTANCIA.mascotaCreateDTOAMascota(mascotaCreateDTO);
        Mascota respuestaEntity = mascotaRepository.save(mascota);
        return MascotaMapper.INSTANCIA.mascotaAMascotaDTO(respuestaEntity);
    }

    @Override
    public MascotaDTO actualizarMascota(MascotaUpdateDTO mascotaUpdateDTO) {
        Mascota mascota = MascotaMapper.INSTANCIA.mascotaUpdateDTOAMascota(mascotaUpdateDTO);
        Mascota respuestaEntity = mascotaRepository.save(mascota);
        return MascotaMapper.INSTANCIA.mascotaAMascotaDTO(respuestaEntity);
    }

    @Override
    public String eliminarMascota(long id) {
        Optional<Mascota> mascotaOptional = mascotaRepository.findById(id);
        String resultado;
        if (mascotaOptional.isPresent()){
            mascotaRepository.delete(mascotaOptional.get());
            resultado = "Registro eliminado";
        }else{
            resultado = "No se puede eliminar el registro";
        }
        return resultado;
    }
}
