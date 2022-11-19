package com.huellitas.controller;

import com.huellitas.dtos.ServicioCreateDTO;
import com.huellitas.dtos.ServicioDTO;
import com.huellitas.dtos.ServicioUpdateDTO;
import com.huellitas.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping("servicios")
    public ResponseEntity<List<ServicioDTO>> listarServicio(){
        return new ResponseEntity<>(servicioService.listarServicios(), HttpStatus.OK);
    }

    @GetMapping("/servicios/{servicioId}")
    public ResponseEntity<ServicioDTO> obtenerServicioPorId(@PathVariable("servicioId") long servicioId){
        return new ResponseEntity<>(servicioService.obtenerServicioPorID(servicioId), HttpStatus.OK);
    }

    @PostMapping("servicios")
    public ResponseEntity<ServicioDTO> registrarServicio(@RequestBody ServicioCreateDTO servicioCreateDTO){
        return new ResponseEntity<>(servicioService.registrarServicio(servicioCreateDTO), HttpStatus.OK);
    }

    @PutMapping("servicios")
    public ResponseEntity<ServicioDTO> actualizarServicio(@RequestBody ServicioUpdateDTO servicioUpdateDTO){
        return new ResponseEntity<>(servicioService.actualizarServicio(servicioUpdateDTO), HttpStatus.OK);
    }

    @DeleteMapping("servicios/{servicioId}")
    public  ResponseEntity<String> eliminarServicio(@PathVariable("servicioId") long servicioId){
        return new ResponseEntity<>(servicioService.eliminarServicio(servicioId), HttpStatus.OK);
    }
}
