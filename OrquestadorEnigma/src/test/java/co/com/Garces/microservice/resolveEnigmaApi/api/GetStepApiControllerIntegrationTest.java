package co.com.Garces.microservice.resolveEnigmaApi.api;

import co.com.Garces.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.Garces.microservice.resolveEnigmaApi.model.JsonApiBodyResponseErrors;
import co.com.Garces.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetStepApiControllerIntegrationTest {

    @Autowired
    private GetStepApi api;

    @Test
    public void getStepTest() throws Exception {
        JsonApiBodyRequest body = new JsonApiBodyRequest();
        List<JsonApiBodyResponseSuccess> responseEntity = (List<JsonApiBodyResponseSuccess>) api.getStepsPost( body );
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.get(0));
    }

}
