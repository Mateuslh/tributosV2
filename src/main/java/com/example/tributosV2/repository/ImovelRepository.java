package com.example.tributosV2.repository;

import com.example.tributosV2.model.imovel.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
