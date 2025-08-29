package com.ravi.Player_cad.Controller;

import com.ravi.Player_cad.Entity.Club;
import com.ravi.Player_cad.Repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clubs")
public class ClubController {

    @Autowired
    private ClubRepository clubRepository;


    @GetMapping("/new")
    public String newClub(Model model) {
        model.addAttribute("club", new Club());
        return "club";
    }


    @GetMapping("/edit/{id}")
    public String editClub(@PathVariable Long id, Model model) {
        Club club = clubRepository.findById(id).orElseThrow();
        model.addAttribute("club", club);
        return "club";
    }


    @PostMapping("/save")
    public String saveClub(@ModelAttribute Club club) {
        clubRepository.save(club);
        return "redirect:/clubs/list";
    }


    @GetMapping("/list")
    public String listClubs(Model model) {
        model.addAttribute("clubs", clubRepository.findAll());
        return "clubList"; // clubList.html
    }


    @GetMapping("/delete/{id}")
    public String deleteClub(@PathVariable Long id) {
        clubRepository.deleteById(id);
        return "redirect:/clubs/list";
    }
}
