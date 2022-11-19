package com.huellitas.controller;

import com.huellitas.dtos.MascotaCreateDTO;
import com.huellitas.dtos.MascotaDTO;
import com.huellitas.dtos.MascotaUpdateDTO;
import com.huellitas.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @GetMapping("mascotas")
    public ResponseEntity<List<MascotaDTO>> listarMascota(){
        return new ResponseEntity<>(mascotaService.listarMascotas(), HttpStatus.OK);
    }

    @GetMapping("/mascotas/{mascotaId}")
    public ResponseEntity<MascotaDTO> obtenerMascotaPorId(@PathVariable("mascotaId") long mascotaId){
        return new ResponseEntity<>(mascotaService.obtenerMascotaPorID(mascotaId), HttpStatus.OK);
    }

    @PostMapping("mascotas")
    public ResponseEntity<MascotaDTO> registrarMascota(@RequestBody MascotaCreateDTO mascotaCreateDTO){
        return new ResponseEntity<>(mascotaService.registrarMascota(mascotaCreateDTO), HttpStatus.OK);
    }

    @PutMapping("mascotas")
    public ResponseEntity<MascotaDTO> actualizarMascota(@RequestBody MascotaUpdateDTO mascotaUpdateDTO){
        return new ResponseEntity<>(mascotaService.actualizarMascota(mascotaUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("mascotas/{mascotaId}")
    public  ResponseEntity<String> eliminarMascota(@PathVariable("mascotaId") long mascotaId){
        return new ResponseEntity<>(mascotaService.eliminarMascota(mascotaId), HttpStatus.OK);
    }
}
