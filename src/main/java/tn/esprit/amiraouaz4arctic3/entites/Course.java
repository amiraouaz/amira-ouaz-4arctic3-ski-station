package tn.esprit.amiraouaz4arctic3.entites;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numCourse;

     Integer level;

    @Enumerated(EnumType.STRING)
     typeCourse typeCourse;

     Float price;
     Integer timeSlot;

    @Enumerated(EnumType.STRING)
    Support support;


    @OneToMany(mappedBy = "course")
    private List<Registration> registrations;



}