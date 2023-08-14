package sh.fer.calendar.application.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDetailsRequestDTO {

    @JsonProperty("event_name")
    private String eventName;

    @JsonProperty("event_type")
    private EventTypeRequestDTO eventType;

    @JsonProperty("event_description")
    private String eventDescription;

    @JsonProperty("event_location")
    private EventLocationRequestDTO eventLocation;

}
