package am.aua.couseSchedule.model;
import jakarta.persistence.*;
import jogamp.common.os.elf.Section;

import java.util.List;

@Entity

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    @Column(nullable = false, unique = true) // Course code must be unique
    private String code; // Example: "CS121"

    @Column(nullable = false)
    private String name; // Example: "Data Structures"

    @Column(nullable = false)
    private int credits;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Section> sections;

    // Constructors
    public Course() {}

    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public List<Section> getSections() { return sections; }
    public void setSections(List<Section> sections) { this.sections = sections; }

}
