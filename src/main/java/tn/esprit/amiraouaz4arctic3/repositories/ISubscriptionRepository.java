package tn.esprit.amiraouaz4arctic3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.amiraouaz4arctic3.entites.Subscription;


public interface ISubscriptionRepository extends JpaRepository<Subscription,Long> {
}
