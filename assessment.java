import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/assessment")
public class CalcREST {

    /*@GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String addPlainTextPost(@PathParam("a") double a, @PathParam("b") double b) {
        return (a + b) + "";
    }*/

    @POST
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String addPlainTextPost(@PathParam("a") double a, @PathParam("b") double b) {
        return addPlainText(a,b);
    }

    public String addPlainText(double a, double b) {
        return (a + b) + "";
    }
 }
