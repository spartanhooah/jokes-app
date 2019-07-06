package net.frey.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {
    private final ChuckNorrisQuotes quoteGenerator;

    public ChuckNorrisJokeService() {
        this.quoteGenerator = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quoteGenerator.getRandomQuote();
    }
}
