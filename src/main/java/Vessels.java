import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/getall")

public class Vessels {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String GetVessel(){
        return  "List of Star Ships" ;
    }
}
