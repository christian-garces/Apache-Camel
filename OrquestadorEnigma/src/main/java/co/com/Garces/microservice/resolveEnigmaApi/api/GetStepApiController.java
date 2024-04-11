package co.com.Garces.microservice.resolveEnigmaApi.api;

import io.swagger.annotations.ApiParam;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import co.com.Garces.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@RestController
public class GetStepApiController implements GetStepApi {
	
	private static final Logger logger = LoggerFactory.getLogger( GetStepApiController.class);
		
	@EndpointInject(uri="direct:resolve-enigma")
	private FluentProducerTemplate producerTemplateEnigma;
	 

    @PostMapping("/getSteps")
    public ResponseEntity<?> getStepsPost(@ApiParam(value ="body", required = true ) @Valid @RequestBody JsonApiBodyRequest body ){
        try {
            Object response = producerTemplateEnigma.withBody(body).request();
            return new ResponseEntity<>( response, HttpStatus.OK);
            
        } catch (Exception e) {
            logger.error("Couldn't Serialize response for content type application/json", e);
            return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
