package com.latam.flight.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-01T09:49:12.712351300-03:00[America/Santiago]")
@Controller
@RequestMapping("${openapi.flight.base-path:/api/v1}")
public class FlightsApiController implements FlightsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FlightsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
