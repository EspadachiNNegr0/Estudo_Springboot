package org.estudospring.estudo.Repository;

import org.estudospring.estudo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
