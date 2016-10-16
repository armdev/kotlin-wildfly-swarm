package org.wildfly.swarm.examples.kotlin

import javax.ws.rs.Path
import javax.ws.rs.GET


@Path("/")
class KotlinResource {

    //http://localhost:8080/
    @GET
    public fun get() : String {
        return "Aloha " + java.util.Date()
    }
    
    //http://localhost:8080/username
    @GET
    @Path("/username")
    public fun getUsername() : String {
        return "armdev";
    }

}
