package ie.kevmurf.oas.api;

import ie.kevmurf.oas.model.ProfessorApiSpec;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-08T15:58:38.644+01:00[Europe/London]")
@Controller
public class ProfessorsApiController implements ProfessorsApi {

    private static final Logger log = LoggerFactory.getLogger(ProfessorsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProfessorsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ProfessorApiSpec> createProfessor(@ApiParam(value = ""  )  @Valid @RequestBody ProfessorApiSpec body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfessorApiSpec>(objectMapper.readValue("{\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}", ProfessorApiSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfessorApiSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfessorApiSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteProfessor(@Min(1)@ApiParam(value = "The ID of the professor to delete.",required=true, allowableValues="") @PathVariable("professorId") Integer professorId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProfessorApiSpec> getProfessorById(@Min(1)@ApiParam(value = "The ID of the professor to retrieve.",required=true, allowableValues="") @PathVariable("professorId") Integer professorId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProfessorApiSpec>(objectMapper.readValue("{\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}", ProfessorApiSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProfessorApiSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProfessorApiSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProfessorApiSpec>> getProfessors() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProfessorApiSpec>>(objectMapper.readValue("[ {\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n}, {\r\n  \"name\" : \"name\",\r\n  \"id\" : 0\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProfessorApiSpec>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProfessorApiSpec>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateProfessor(@Min(1)@ApiParam(value = "The ID of the professor to update.",required=true, allowableValues="") @PathVariable("professorId") Integer professorId
,@ApiParam(value = ""  )  @Valid @RequestBody ProfessorApiSpec body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
