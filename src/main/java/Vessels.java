import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/getall")

public class Vessels {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String GetVessel(){
        return  "List of Star Ships" ;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{CaptainName}")
    public String ByCaptian(@PathParam("CaptainName") String CaptainName){
        return "The Captain " + CaptainName + " has commanded the following vessels";
    }
}
