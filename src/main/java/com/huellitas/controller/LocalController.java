package com.huellitas.controller;

import com.huellitas.dtos.LocalCreateDTO;
import com.huellitas.dtos.LocalDTO;
import com.huellitas.dtos.LocalUpdateDTO;
import com.huellitas.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LocalController {

    @Autowired
    private LocalService localService;

    @GetMapping("locals")
    public ResponseEntity<List<LocalDTO>> listarLocal(){
        return new ResponseEntity<>(localService.listarLocals(), HttpStatus.OK);
    }

    @GetMapping("/locals/{localId}")
    public ResponseEntity<LocalDTO> obtenerLocalPorId(@PathVariable("localId") long localId){
        return new ResponseEntity<>(localService.obtenerLocalPorID(localId), HttpStatus.OK);
    }

    @PostMapping("locals")
    public ResponseEntity<LocalDTO> registrarLocal(@RequestBody LocalCreateDTO localCreateDTO){
        return new ResponseEntity<>(localService.registrarLocal(localCreateDTO), HttpStatus.OK);
    }

    @PutMapping("locals")
    public ResponseEntity<LocalDTO> actualizarLocal(@RequestBody LocalUpdateDTO localUpdateDTO){
        return new ResponseEntity<>(localService.actualizarLocal(localUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("locals/{localId}")
    public  ResponseEntity<String> eliminarLocal(@PathVariable("localId") long localId){
        return new ResponseEntity<>(localService.eliminarLocal(localId), HttpStatus.OK);
    }
}
