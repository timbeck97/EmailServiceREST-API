package com.emailservice.repositories;

import com.emailservice.entities.EmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepositorie extends JpaRepository<EmailEntity, Long> {
}
