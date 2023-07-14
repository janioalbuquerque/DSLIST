package com.janiocodesolution.dslist.controllers;

import com.janiocodesolution.dslist.dto.GameListDTO;
import com.janiocodesolution.dslist.dto.GameMinDTO;
import com.janiocodesolution.dslist.dto.ReplacementDTO;
import com.janiocodesolution.dslist.services.GameListService;
import com.janiocodesolution.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId, body.getSoucerIndex(), body.getDestinationIndex());
    }

}
