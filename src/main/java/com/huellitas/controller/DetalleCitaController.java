package com.huellitas.controller;

import com.huellitas.dtos.DetalleCitaCreateDTO;
import com.huellitas.dtos.DetalleCitaDTO;
import com.huellitas.dtos.DetalleCitaUpdateDTO;
import com.huellitas.service.DetalleCitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DetalleCitaController {

    @Autowired
    private DetalleCitaService detalleCitaService;

    @GetMapping("detalleCitas")
    public ResponseEntity<List<DetalleCitaDTO>> listarDetalleCita(){
        return new ResponseEntity<>(detalleCitaService.listarDetalleCitas(), HttpStatus.OK);
    }

    @GetMapping("/detalleCitas/{detalleCitaId}")
    public ResponseEntity<DetalleCitaDTO> obtenerDetalleCitaPorId(@PathVariable("detalleCitaId") long detalleCitaId){
        return new ResponseEntity<>(detalleCitaService.obtenerDetalleCitaPorID(detalleCitaId), HttpStatus.OK);
    }

    @PostMapping("detalleCitas")
    public ResponseEntity<DetalleCitaDTO> registrarDetalleCita(@RequestBody DetalleCitaCreateDTO detalleCitaCreateDTO){
        return new ResponseEntity<>(detalleCitaService.registrarDetalleCita(detalleCitaCreateDTO), HttpStatus.OK);
    }

    @PutMapping("detalleCitas")
    public ResponseEntity<DetalleCitaDTO> actualizarDetalleCita(@RequestBody DetalleCitaUpdateDTO detalleCitaUpdateDTO){
        return new ResponseEntity<>(detalleCitaService.actualizarDetalleCita(detalleCitaUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("detalleCitas/{detalleCitaId}")
    public  ResponseEntity<String> eliminarDetalleCita(@PathVariable("detalleCitaId") long detalleCitaId){
        return new ResponseEntity<>(detalleCitaService.eliminarDetalleCita(detalleCitaId), HttpStatus.OK);
    }
}
