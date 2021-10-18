package com.Back_BoringShop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Back_BoringShop.model.Ventas;

public interface VentasDAO extends JpaRepository <Ventas, Long>{

}