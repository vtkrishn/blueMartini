package com.resumely.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/resumely")
public class ResumeService {
    
    @GET
    @Path("/resume")
    @Produces(MediaType.APPLICATION_XML)
    public String getResume(){
        return "Resume";
    }
}
