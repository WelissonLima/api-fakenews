package br.com.fakenews.controller;

import br.com.fakenews.model.entity.NewsEntity;
import br.com.fakenews.service.MapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/map")
public class MapController {
   private final MapService mapService;

    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping
    public Map<String,Integer>  getMap(){
        Map<String,Integer> list = mapService.getMap();
        return list;
    }
}
