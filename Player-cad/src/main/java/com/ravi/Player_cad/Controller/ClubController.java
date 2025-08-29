package com.ravi.Player_cad.Controller;

import com.ravi.Player_cad.Entity.Club;
import com.ravi.Player_cad.Repository.ClubRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
public class ClubController {

    private final ClubRepository clubRepository;

    public ClubController(ClubRepository clubRepository){
        this.clubRepository = clubRepository;
    }


    @GetMapping
    public List<Club> getAll() {
        return clubRepository.findAll();
    }


    @GetMapping("/{id}")
    public Club getById(@PathVariable Long id) {
        return clubRepository.findById(id).orElseThrow();
    }


    @PostMapping
    public Club create(@RequestBody Club club) {
        return clubRepository.save(club);
    }


    @PutMapping("/{id}")
    public Club update(@PathVariable Long id, @RequestBody Club club) {
        Club existing = clubRepository.findById(id).orElseThrow();
        existing.setNameClub(club.getNameClub());
        existing.setDescriptionClub(club.getDescriptionClub());
        existing.setChampionshipClub(club.getChampionshipClub());
        return clubRepository.save(existing);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clubRepository.deleteById(id);
    }
}
