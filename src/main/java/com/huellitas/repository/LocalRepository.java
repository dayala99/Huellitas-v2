package com.huellitas.repository;

import com.huellitas.model.Cliente;
import com.huellitas.model.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
}
