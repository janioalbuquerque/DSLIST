package com.janiocodesolution.dslist.services;

import com.janiocodesolution.dslist.dto.GameDTO;
import com.janiocodesolution.dslist.dto.GameMinDTO;
import com.janiocodesolution.dslist.entities.Game;
import com.janiocodesolution.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(item -> new GameMinDTO(item)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        try {
            Game result = gameRepository.findById(id).get();
            return new GameDTO(result);
        }catch (Exception e){
            return new GameDTO();
        }

    }
}
