package com.janiocodesolution.dslist.controllers;

import com.janiocodesolution.dslist.dto.GameListDTO;
import com.janiocodesolution.dslist.dto.GameMinDTO;
import com.janiocodesolution.dslist.services.GameListService;
import com.janiocodesolution.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

}
