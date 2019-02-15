package katas;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.*;

public class Song {
    public static void main(String[] args) {
        new Song().execute();
    }

    public void execute() {

        String song = composeSongWith(new Animal[] {
                new Animal("fly", "I don't know why she swallowed a fly - perhaps she'll die!\n"),
                new Animal("spider", "That wriggled and wiggled and tickled inside her.\n"),
                new Animal("bird", "How absurd to swallow a bird.\n"),
                new Animal("cat", "Fancy that to swallow a cat!\n"),
                new Animal("dog", "What a hog, to swallow a dog!\n"),
                new Animal("cow", "I don't know how she swallowed a cow!\n"),
                new Animal("horse", "...She's dead, of course!")
        });

        System.out.println(song);
    }

    private String composeSongWith(Animal[] animals) {
        return exposition(animals[0], ".") +
                "\n" +
                verses(animals) +
                "\n" +
                exposition(animals[animals.length - 1], "...");
    }

    private String verses(Animal[] animals) {
        return IntStream.range(2, animals.length)
                .mapToObj(i -> verse(Arrays.copyOfRange(animals, 0, i)))
                .collect(Collectors.joining("\n"));
    }

    private String verse(Animal... animals) {
        Animal last = animals[animals.length - 1];
        Animal firstAnimal = animals[0];

        return exposition(last, ";") +
                development(animals) +
                coda(firstAnimal);
    }

    private String development(Animal... animals) {
        StringBuilder sb = new StringBuilder();
        for (int i = animals.length - 1; i > 0; i--) {
            final String punctuation = i == 1 ? ";" : ",";
            sb.append(format("She swallowed the %s to catch the %s%s\n", animals[i].name, animals[i - 1].name, punctuation));
        }
        return sb.toString();
    }


    private String coda(Animal fly) {
        return fly.rhyme;
    }

    private String exposition(Animal animal, final String punctuation) {
        return "There was an old lady who swallowed a " + animal.name + punctuation + "\n" +
                animal.rhyme;
    }

    private class Animal {

        private final String name;
        private final String rhyme;

        public Animal(String name, String rhyme) {
            this.name = name;
            this.rhyme = rhyme;
        }
    }
}
