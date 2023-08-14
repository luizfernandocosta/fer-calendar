package sh.fer.calendar.infrastructure.repository.postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sh.fer.calendar.domain.Event;
import sh.fer.calendar.domain.repository.EventRepository;

@Service
public class EventRepositoryImpl implements EventRepository {

    private final SpringDataEventRepository eventRepository;

    @Autowired
    public EventRepositoryImpl(final SpringDataEventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public void save(Event event) {
        eventRepository.save(event);
    }
}
