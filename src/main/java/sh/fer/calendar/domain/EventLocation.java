package sh.fer.calendar.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EventLocation {

    @Column(name = "address")
    private String address;

    @Column(name = "zipcode")
    private String zipCode;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

}
