package com.janiocodesolution.dslist.repositories;

import com.janiocodesolution.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
