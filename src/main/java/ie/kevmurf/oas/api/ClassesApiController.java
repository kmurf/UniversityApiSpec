package ie.kevmurf.oas.api;

import ie.kevmurf.oas.model.ClassApiSpec;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-08T11:50:04.475+01:00[Europe/London]")
@Controller
public class ClassesApiController implements ClassesApi {

    private static final Logger log = LoggerFactory.getLogger(ClassesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ClassesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ClassApiSpec> createClass(@ApiParam(value = ""  )  @Valid @RequestBody ClassApiSpec body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClassApiSpec>(objectMapper.readValue("{\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}", ClassApiSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClassApiSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClassApiSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteClass(@Min(1)@ApiParam(value = "The ID of the class to delete.",required=true, allowableValues="") @PathVariable("classId") Integer classId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClassApiSpec> getClassById(@Min(1)@ApiParam(value = "The ID of the class to retrieve.",required=true, allowableValues="") @PathVariable("classId") Integer classId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ClassApiSpec>(objectMapper.readValue("{\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}", ClassApiSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ClassApiSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ClassApiSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ClassApiSpec>> getClasses() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ClassApiSpec>>(objectMapper.readValue("[ {\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}, {\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ClassApiSpec>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ClassApiSpec>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateClass(@Min(1)@ApiParam(value = "The ID of the class to update.",required=true, allowableValues="") @PathVariable("classId") Integer classId
,@ApiParam(value = ""  )  @Valid @RequestBody ClassApiSpec body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
