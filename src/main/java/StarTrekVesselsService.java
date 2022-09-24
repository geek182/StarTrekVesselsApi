import jakarta.ws.rs.Path;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

public class StarTrekVesselsService {
    private static final String BASE_URL = "http://localhost:8081/" ;

    public static void main (String... args){
        final ResourceConfig resourceConfig = new ResourceConfig(Vessels.class); // Implement a controller?
        GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URL), resourceConfig);

    }
}

