package net.frey.jokesapp.service

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import spock.lang.Specification

class JokeServiceTest extends Specification {
    def quoteGenerator = new ChuckNorrisQuotes()
    def jokeService = new JokeService(quoteGenerator)


    def "Gets a joke from the jar"() {
        when:
        def quote = jokeService.getJoke()

        then:
        quote != null
    }

    def "Doesn't always get the same joke"() {
        when:
        def firstQuote = jokeService.getJoke()
        def secondQuote = jokeService.getJoke()

        then:
        firstQuote != secondQuote
    }
}
