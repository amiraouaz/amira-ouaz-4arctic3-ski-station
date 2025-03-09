package tn.esprit.amiraouaz4arctic3.entites;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long numPiste;
     String namePiste;
    @Enumerated(EnumType.STRING)
     Color color;
     int lenght;
     int slope;
    @ManyToMany
    Set<Skier> skiers;
}