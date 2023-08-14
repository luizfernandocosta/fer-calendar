package sh.fer.calendar.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EventDetails {

    @Column(name = "event_name")
    private String eventName;

    @Enumerated(EnumType.STRING)
    @Column(name = "event_type")
    private EventType eventType;

    @Column(name = "event_description")
    private String eventDescription;

    @Embedded
    private EventLocation eventLocation;

}
