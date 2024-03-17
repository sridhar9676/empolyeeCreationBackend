package net.testProject.empolyecreationbackend.repository;

import net.testProject.empolyecreationbackend.entity.Empolyee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpolyeeRepository  extends JpaRepository<Empolyee, Long> {
}
