package tn.esprit.amiraouaz4arctic3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.amiraouaz4arctic3.entites.Subscription;
import tn.esprit.amiraouaz4arctic3.entites.typesubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


public interface ISubscriptionRepository extends JpaRepository<Subscription,Long> {
   // Set<Subscription> findBytypesubscriptionOrderByStartDateAsc(typesubscription type);

   // List<Subscription> findByStartDateBetween(LocalDate startDate, LocalDate endDate);
}
