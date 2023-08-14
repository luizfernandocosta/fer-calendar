package sh.fer.calendar.application.rest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sh.fer.calendar.application.rest.dto.CreateEventRequestDTO;
import sh.fer.calendar.domain.Event;
import sh.fer.calendar.domain.EventDetails;
import sh.fer.calendar.domain.service.EventService;
import sh.fer.calendar.infrastructure.configuration.snowflake.EventID;

@RestController
@RequestMapping("/events")
public class EventController implements EventAPI{

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public ResponseEntity<String> createEvent(CreateEventRequestDTO event) {

        ModelMapper modelMapper = new ModelMapper();

        eventService.createEvent(modelMapper.map(event, EventDetails.class));

        return ResponseEntity.ok("Criado com sucesso!");
    }

    @Override
    public ResponseEntity<String> deleteEvent(CreateEventRequestDTO event) {
        return null;
    }
}
