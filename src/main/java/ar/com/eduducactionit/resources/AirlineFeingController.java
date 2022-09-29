package ar.com.eduducactionit.resources;

import ar.com.eduducactionit.client.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/airlines")
@RequiredArgsConstructor
public class AirlineFeingController {

    private final ApiClient apiClient;
    @GetMapping
    public ResponseEntity readAirlineData (@RequestParam(required = false) String airlineId) {
        if (airlineId == null) {
            return ResponseEntity.ok(apiClient.readAirLines());
        }
        return ResponseEntity.ok(apiClient.readAirLineById(airlineId));
    }
}
