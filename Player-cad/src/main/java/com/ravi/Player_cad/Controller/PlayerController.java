package com.ravi.Player_cad.Controller;

import com.ravi.Player_cad.Entity.Player;
import com.ravi.Player_cad.Repository.PlayerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerRepository playerRepository;

    public PlayerController(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }


    @GetMapping
    public List<Player> getAll(){
        return playerRepository.findAll();
    }


    @GetMapping("/{id}")
    public Player getById(@PathVariable Long id){
        return playerRepository.findById(id).orElseThrow();
    }


    @PostMapping
    public Player create(@RequestBody Player player){
        return playerRepository.save(player);
    }


    @PutMapping("/{id}")
    public Player update(@PathVariable Long id, @RequestBody Player player){
        Player existing = playerRepository.findById(id).orElseThrow();
        existing.setNamePlayer(player.getNamePlayer());
        existing.setAgePlayer(player.getAgePlayer());
        existing.setSkillPlayer(player.getSkillPlayer());
        existing.setOverralPlayer(player.getOverralPlayer());
        existing.setClub(player.getClub());
        return playerRepository.save(existing);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        playerRepository.deleteById(id);
    }
}
