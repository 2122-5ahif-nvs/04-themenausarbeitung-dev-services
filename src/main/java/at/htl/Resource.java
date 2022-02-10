package at.htl;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class Resource {

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/admin")
    public String admin() {
        return "Hello, you are an admin";
    }

    @GET
    @RolesAllowed({"admin", "user"})
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/user")
    public String adminOrUser() {
        return "Hello, you are an admin or user";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String anonymous() {
        return "Hello stranger :)";
    }
}
