package sh.fer.calendar.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sh.fer.calendar.domain.service.EventService;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event")
@Entity
public class Event {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "user_id")
    private String userID;

    @Embedded
    private EventDetails eventDetails;

    public Event(final EventDetails eventDetails){
        this.eventDetails = eventDetails;
    }


}
