package com.test.apache.daos;

import com.test.apache.entities.Banco;

import java.util.List;

public interface IBancoDao {
    List<Banco> listBancos();
}
