package com.resumely.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/resume")
@Produces(MediaType.APPLICATION_JSON)
public class ResumeService {
    
    @GET
    public String get(){
        return "Resume";
    }
}
