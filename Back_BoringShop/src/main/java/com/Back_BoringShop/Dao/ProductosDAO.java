package com.Back_BoringShop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Back_BoringShop.model.Productos;

public interface ProductosDAO extends JpaRepository <Productos, Long>{

}
