package com.test.jax.controllers;

import com.test.jax.daos.BancoDao;
import com.test.jax.daos.IBancoDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/bancos")
@Produces("application/json")
public class BancoCtrl {

    @GET
    @Path("/lista")
    public Response listBancos() {
        BancoDao bancoDao = new BancoDao();
        return Response.ok().entity(bancoDao.listBancos()).build();
    }

    @GET
    @Path("/echo/{input}")
    @Produces("text/plain")
    public String ping(@PathParam("input") String input) {
        return input;
    }
}

