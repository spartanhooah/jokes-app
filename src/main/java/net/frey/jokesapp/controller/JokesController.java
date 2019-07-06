package net.frey.jokesapp.controller;

import net.frey.jokesapp.service.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private ChuckNorrisJokeService chuckNorrisJokeService;

    public JokesController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("chucknorris", chuckNorrisJokeService.getJoke());

        return "chucknorris";
    }
}
