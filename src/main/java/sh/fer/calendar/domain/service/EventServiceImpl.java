package sh.fer.calendar.domain.service;

import org.springframework.stereotype.Service;
import sh.fer.calendar.domain.Event;
import sh.fer.calendar.domain.EventDetails;
import sh.fer.calendar.domain.repository.EventRepository;
import sh.fer.calendar.infrastructure.configuration.snowflake.EventID;

@Service
public class EventServiceImpl implements EventService{

    private final EventRepository eventRepository;

    public EventServiceImpl(final EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
    @Override
    public long createEvent(EventDetails eventDetails) {

        eventRepository.save(new Event(EventID.getInstance().nextId(), "auth0", eventDetails));

        return 0;
    }

    @Override
    public void deleteEvent(long id) {

    }
}
