/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.21-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ie.kevmurf.oas.api;

import ie.kevmurf.oas.model.ProfessorApiSpec;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-08T20:12:12.521+01:00[Europe/London]")
@Api(value = "professors", description = "the professors API")
public interface ProfessorsApi {

    @ApiOperation(value = "Creates a new professor.", nickname = "createProfessor", notes = "", response = ProfessorApiSpec.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ProfessorApiSpec.class) })
    @RequestMapping(value = "/professors",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ProfessorApiSpec> createProfessor(@ApiParam(value = ""  )  @Valid @RequestBody ProfessorApiSpec body
);


    @ApiOperation(value = "Delete a professor.", nickname = "deleteProfessor", notes = "", tags={  })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/professors/{professorId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProfessor(@Min(1)@ApiParam(value = "The ID of the professor to delete.",required=true, allowableValues="") @PathVariable("professorId") Integer professorId
);


    @ApiOperation(value = "Returns a professor by ID.", nickname = "getProfessorById", notes = "", response = ProfessorApiSpec.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfessorApiSpec.class),
        @ApiResponse(code = 400, message = "The specified professor ID is invalid (e.g. not a number)."),
        @ApiResponse(code = 404, message = "A professor with the specified ID was not found."),
        @ApiResponse(code = 200, message = "Unexpected error") })
    @RequestMapping(value = "/professors/{professorId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProfessorApiSpec> getProfessorById(@Min(1)@ApiParam(value = "The ID of the professor to retrieve.",required=true, allowableValues="") @PathVariable("professorId") Integer professorId
);


    @ApiOperation(value = "Returns a list of professors.", nickname = "getProfessors", notes = "", response = ProfessorApiSpec.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProfessorApiSpec.class, responseContainer = "List") })
    @RequestMapping(value = "/professors",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ProfessorApiSpec>> getProfessors();


    @ApiOperation(value = "Update / Replace a professor.", nickname = "updateProfessor", notes = "", tags={  })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/professors/{professorId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateProfessor(@Min(1)@ApiParam(value = "The ID of the professor to update.",required=true, allowableValues="") @PathVariable("professorId") Integer professorId
,@ApiParam(value = ""  )  @Valid @RequestBody ProfessorApiSpec body
);

}

