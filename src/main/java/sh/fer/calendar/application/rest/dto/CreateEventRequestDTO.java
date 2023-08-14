package sh.fer.calendar.application.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEventRequestDTO {

    @JsonProperty("event_details")
    private EventDetailsRequestDTO eventDetails;

}
