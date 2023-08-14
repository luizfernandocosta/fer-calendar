package sh.fer.calendar.application.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventLocationRequestDTO {

    @JsonProperty("address")
    private String address;

    @JsonProperty("zipcode")
    private String zipCode;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

}
