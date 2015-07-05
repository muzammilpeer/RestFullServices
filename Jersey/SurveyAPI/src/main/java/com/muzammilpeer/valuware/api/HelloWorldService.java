package com.muzammilpeer.valuware.api;

import com.muzammilpeer.valuware.api.com.muzammilpeer.valuware.models.TrackModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by muzammilpeer on 05/07/15.
 */
@Path("/hello")
public class HelloWorldService {
    @GET
    @Path("/{param}")
    public Response getMessage(@PathParam("param") String message) {
        String output = "Jersey says " + message;
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("getjson/")
    @Produces(MediaType.APPLICATION_JSON)
    public TrackModel getTrackInJSON() {

        TrackModel track = new TrackModel();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");

        return track;

    }

    @POST
    @Path("postjson/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TrackModel createTrackInJSON(TrackModel track) {
        track.setTitle(track.getTitle() + "-XYZ");
        return track;
    }

}