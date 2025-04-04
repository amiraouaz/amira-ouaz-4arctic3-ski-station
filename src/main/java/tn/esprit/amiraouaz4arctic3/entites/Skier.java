package tn.esprit.amiraouaz4arctic3.entites;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;

    @OneToMany(mappedBy = "skier")
    private List<Registration> registrations;

    @ManyToMany(mappedBy = "skiers")
    private Set<Piste> pistes;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Subscription subscription;

    public void setCourse(Course course) {
        // Logique pour associer un cours à un skieur, si nécessaire
    }
}
