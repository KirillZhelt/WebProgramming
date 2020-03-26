package db.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "subject")
public class Subject implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @ManyToMany(mappedBy = "subjects")
    @JoinColumn(name = "faculties")
    private Set<Faculty> faculties;

    @OneToMany(mappedBy = "subject")
    private Set<Application> applications;

    public Subject() {

    }

    public Subject(String name, Set<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "Subject{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", faculties=" + faculties +
            '}';
    }
}
