package com.huellitas.mappers;

import com.huellitas.dtos.ClienteCreateDTO;
import com.huellitas.dtos.ClienteDTO;
import com.huellitas.dtos.ClienteUpdateDTO;
import com.huellitas.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClienteMapper {

    ClienteMapper INSTANCIA = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO clienteAClienteDTO(Cliente cliente);
    Cliente    clienteDTOACliente(ClienteDTO clienteDTO);
    Cliente    clienteCreateDTOACliente (ClienteCreateDTO clienteCreateDTO);
    Cliente    clienteUpdateDTOACliente (ClienteUpdateDTO clienteUpdateDTO);

    List<ClienteDTO> listaClienteAListaClienteDTO (List<Cliente> listaCliente);
}
