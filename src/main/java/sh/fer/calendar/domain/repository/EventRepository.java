package sh.fer.calendar.domain.repository;

import sh.fer.calendar.domain.Event;

public interface EventRepository {

    void save(Event event);

}
