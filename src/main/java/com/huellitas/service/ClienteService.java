package com.huellitas.service;

import com.huellitas.dtos.ClienteCreateDTO;
import com.huellitas.dtos.ClienteDTO;
import com.huellitas.dtos.ClienteUpdateDTO;

import java.util.List;

public interface ClienteService {

    List<ClienteDTO> listarClientes();
    ClienteDTO obtenerClientePorID(long id);
    ClienteDTO registrarCliente(ClienteCreateDTO clienteCreateDTO);
    ClienteDTO actualizarCliente(ClienteUpdateDTO clienteUpdateDTO);
    String eliminarCliente(long id);
}
