package Ressources;

import jakarta.inject.Singleton;


import jakarta.inject.Singleton;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.apache.commons.text.StringEscapeUtils;
@Singleton
@Path("test")
public class TestRessources {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        System.out.println("ok");
        return "Got it!";
    }

}
