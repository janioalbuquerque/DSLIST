package com.janiocodesolution.dslist.services;

import com.janiocodesolution.dslist.dto.GameListDTO;
import com.janiocodesolution.dslist.entities.GameList;
import com.janiocodesolution.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(item -> new GameListDTO(item)).toList();
    }


}
