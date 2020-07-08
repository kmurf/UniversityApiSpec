package ie.kevmurf.oas.api;

import ie.kevmurf.oas.model.StudentApiSpec;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-08T15:58:41.274+01:00[Europe/London]")
@Controller
public class StudentsApiController implements StudentsApi {

    private static final Logger log = LoggerFactory.getLogger(StudentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<StudentApiSpec> createStudent(@ApiParam(value = ""  )  @Valid @RequestBody StudentApiSpec body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<StudentApiSpec>(objectMapper.readValue("{\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}", StudentApiSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StudentApiSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<StudentApiSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteStudent(@Min(1)@ApiParam(value = "The ID of the student to delete.",required=true, allowableValues="") @PathVariable("studentId") Integer studentId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<StudentApiSpec> getStudentById(@Min(1)@ApiParam(value = "The ID of the student to retrieve.",required=true, allowableValues="") @PathVariable("studentId") Integer studentId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<StudentApiSpec>(objectMapper.readValue("{\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}", StudentApiSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StudentApiSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<StudentApiSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<StudentApiSpec>> getStudents() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<StudentApiSpec>>(objectMapper.readValue("[ {\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}, {\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<StudentApiSpec>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<StudentApiSpec>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStudent(@Min(1)@ApiParam(value = "The ID of the student to update.",required=true, allowableValues="") @PathVariable("studentId") Integer studentId
,@ApiParam(value = ""  )  @Valid @RequestBody StudentApiSpec body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
