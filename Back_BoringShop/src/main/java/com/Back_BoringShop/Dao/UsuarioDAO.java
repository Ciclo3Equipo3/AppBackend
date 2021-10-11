package com.Back_BoringShop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Back_BoringShop.model.Usuarios;

public interface UsuarioDAO extends JpaRepository <Usuarios, Long>{

}
