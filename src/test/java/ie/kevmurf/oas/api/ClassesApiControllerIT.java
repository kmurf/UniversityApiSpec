package ie.kevmurf.oas.api;

import ie.kevmurf.oas.model.ClassApiSpec;

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
public class ClassesApiControllerIT {

    @Test
    public void getClassByIdTest() throws Exception {
        final String requestURL = "http://localhost:8002//classes/56";
        final HttpClient client = HttpClientBuilder.create().build();
        final HttpResponse response = client.execute(new HttpGet(requestURL));
        assertEquals(response.getStatusLine().getStatusCode(), 501);
    }
    @Test
    public void getClassesTest() throws Exception {
        final String requestURL = "http://localhost:8002//classes";
        final HttpClient client = HttpClientBuilder.create().build();
        final HttpResponse response = client.execute(new HttpGet(requestURL));
        assertEquals(response.getStatusLine().getStatusCode(), 501);
    }
}
