package com.test.apache;

import com.test.apache.daos.BancoDao;
import com.test.apache.daos.IBancoDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/bancos")
@Produces("application/json")
public class BancoCtrl {

    private final IBancoDao iBancoDao;

    public BancoCtrl(IBancoDao iBancoDao) {
        this.iBancoDao = iBancoDao;
    }

    @GET
    @Path("/lista")
    public Response listBancos() {
        return Response.ok().entity(this.iBancoDao.listBancos()).build();
    }

    @GET
    @Path("/echo/{input}")
    @Produces("text/plain")
    public String ping(@PathParam("input") String input) {
        return input;
    }
}

