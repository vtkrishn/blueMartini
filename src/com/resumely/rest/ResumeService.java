package com.resumely.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/resumely")
public class ResumeService {
    
    @GET
    @Path("/{param}")
    public Response getResume(@PathParam("param") String msg){
        String output = "Hi";
        return Response.status(200).entity(output).build();
    }
}
