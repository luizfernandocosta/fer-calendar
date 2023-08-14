package sh.fer.calendar.infrastructure.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sh.fer.calendar.domain.Event;

@Repository
public interface SpringDataEventRepository extends JpaRepository<Event, Long> {
}
