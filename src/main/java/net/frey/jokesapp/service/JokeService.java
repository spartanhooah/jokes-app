package net.frey.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    private ChuckNorrisQuotes quoteGenerator;

    public JokeService(ChuckNorrisQuotes quoteGenerator) {
        this.quoteGenerator = quoteGenerator;
    }

    public String getJoke() {
        return quoteGenerator.getRandomQuote();
    }
}
