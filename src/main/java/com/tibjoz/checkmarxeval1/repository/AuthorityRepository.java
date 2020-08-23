package com.tibjoz.checkmarxeval1.repository;

import com.tibjoz.checkmarxeval1.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
