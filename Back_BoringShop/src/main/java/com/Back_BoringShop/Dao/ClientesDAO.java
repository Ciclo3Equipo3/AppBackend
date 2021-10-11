package com.Back_BoringShop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Back_BoringShop.model.Clientes;

public interface ClientesDAO extends JpaRepository <Clientes, Long>{

}