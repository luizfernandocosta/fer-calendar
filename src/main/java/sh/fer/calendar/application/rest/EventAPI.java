package sh.fer.calendar.application.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import sh.fer.calendar.application.rest.dto.CreateEventRequestDTO;

public interface EventAPI {

    @PostMapping(value = "/event", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> createEvent(@RequestBody CreateEventRequestDTO event);

    @DeleteMapping(value = "/event", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> deleteEvent(@RequestBody CreateEventRequestDTO event);

}
