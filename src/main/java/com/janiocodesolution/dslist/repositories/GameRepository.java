package com.janiocodesolution.dslist.repositories;

import com.janiocodesolution.dslist.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
}
