package com.heatalert.repository;

import com.heatalert.entity.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemperaturaRepository extends JpaRepository<Temperatura, Long> {
    List<Temperatura> findByCidade(String cidade);
}
