package ie.kevmurf.oas.api;

import ie.kevmurf.oas.model.ProfessorApiSpec;

import java.util.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class to verify that GET endpoints on generated project are reached.
 */
public class ProfessorsApiControllerIT {

    @Test
    public void getProfessorByIdTest() throws Exception {
        final String requestURL = "http://localhost:8002//professors/56";
        final HttpClient client = HttpClientBuilder.create().build();
        final HttpResponse response = client.execute(new HttpGet(requestURL));
        assertEquals(response.getStatusLine().getStatusCode(), 501);
    }
    @Test
    public void getProfessorsTest() throws Exception {
        final String requestURL = "http://localhost:8002//professors";
        final HttpClient client = HttpClientBuilder.create().build();
        final HttpResponse response = client.execute(new HttpGet(requestURL));
        assertEquals(response.getStatusLine().getStatusCode(), 501);
    }
}
