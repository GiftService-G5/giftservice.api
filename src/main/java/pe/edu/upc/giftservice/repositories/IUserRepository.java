package pe.edu.upc.giftservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.giftservice.entities.Users;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
}
