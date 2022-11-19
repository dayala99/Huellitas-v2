package com.huellitas.repository;

import com.huellitas.model.DetalleCita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleCitaRepository extends JpaRepository<DetalleCita, Long> {
}
