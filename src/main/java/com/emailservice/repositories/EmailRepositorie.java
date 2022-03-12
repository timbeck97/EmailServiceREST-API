package com.emailservice.repositories;

import com.emailservice.entities.EmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepositorie extends JpaRepository<EmailEntity, UUID> {
}
