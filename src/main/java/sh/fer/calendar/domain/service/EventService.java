package sh.fer.calendar.domain.service;

import sh.fer.calendar.domain.EventDetails;

public interface EventService {

    long createEvent(EventDetails eventDetails);

    void deleteEvent(long id);

}
