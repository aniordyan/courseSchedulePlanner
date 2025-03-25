package am.aua.couseSchedule.repository;

import am.aua.couseSchedule.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Course, Long> {
}
