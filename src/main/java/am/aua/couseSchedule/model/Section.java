package am.aua.couseSchedule.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sectionCode;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
}
