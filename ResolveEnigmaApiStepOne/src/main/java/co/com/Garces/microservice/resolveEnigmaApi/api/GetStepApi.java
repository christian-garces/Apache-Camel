/**
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package co.com.Garces.microservice.resolveEnigmaApi.api;

import co.com.Garces.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.Garces.microservice.resolveEnigmaApi.model.JsonApiBodyResponseErrors;
import co.com.Garces.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-02-27T20:55:05.287811100-05:00[America/Bogota]")
@Api(value = "getStep", description = "the getStep API")
public interface GetStepApi {

	    @ApiOperation(
	        value = "Get one enigma step",
	        nickname = "getStep",
	        notes = "Get one enigma step",
	        response = JsonApiBodyResponseSuccess.class,
	        responseContainer = "List",
	        tags = {}
	    )
	    @ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Search results matching criteria", response = JsonApiBodyResponseSuccess.class, responseContainer = "List"),
	        @ApiResponse(code = 424, message = "Bad input parameter", response = JsonApiBodyResponseErrors.class, responseContainer = "List")
	    })
	    @RequestMapping(
	        value = "/step",
	        produces = "application/json",
	        consumes = "application/json",
	        method = RequestMethod.POST
	    )
	    ResponseEntity<?> getStep(
	        @ApiParam(value = "Request body to get enigma step", required = true)
	        @Valid @RequestBody JsonApiBodyRequest body
	    );

	    @ApiOperation(
	        value = "Get step one enigma step",
	        nickname = "getStepOne",
	        notes = "Get step one enigma step",
	        response = JsonApiBodyResponseSuccess.class,
	        responseContainer = "List",
	        tags = {}
	    )
	    @ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Search results matching criteria", response = JsonApiBodyResponseSuccess.class, responseContainer = "List"),
	        @ApiResponse(code = 424, message = "Bad input parameter", response = JsonApiBodyResponseErrors.class, responseContainer = "List")
	    })
	    @RequestMapping(
	        value = "/step/one",
	        produces = "application/json",
	        method = RequestMethod.GET
	    )
	    ResponseEntity<String> getStepOne();
	}
