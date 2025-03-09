package tn.esprit.amiraouaz4arctic3.entites;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;

    private String firstName;
    private String lastName;
    private LocalDate dateOfHire;

    @OneToMany
    private Set<Course> courses;


}
