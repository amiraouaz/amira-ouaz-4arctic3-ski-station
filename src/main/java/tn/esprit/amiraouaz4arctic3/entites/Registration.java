package tn.esprit.amiraouaz4arctic3.entites;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRegistration;

    private Integer numWeek;
    @ManyToOne
    private Skier skier;

    @ManyToOne
    private Course course;

    public void setDateRegistration(LocalDate now) {
    }
}
