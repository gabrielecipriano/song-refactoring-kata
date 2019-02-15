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
        Animal fly = new Animal("fly", "I don't know why she swallowed a fly - perhaps she'll die!\n");
        Animal spider = new Animal("spider", "That wriggled and wiggled and tickled inside her.\n");
        Animal bird = new Animal("bird", "How absurd to swallow a bird.\n");
        Animal cat = new Animal("cat", "Fancy that to swallow a cat!\n");
        Animal dog = new Animal("dog", "What a hog, to swallow a dog!\n");
        Animal cow = new Animal("cow", "I don't know how she swallowed a cow!\n");
        Animal horse = new Animal("horse", "...She's dead, of course!");

        Animal[] animals = new Animal[] {
                fly, spider, bird, cat, dog, cow, horse
        };



        String song = exposition(fly, ".") +
                "\n" +
                verses(animals) +
                "\n" +
                exposition(horse, "...");

        System.out.println(song);
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
                development(animals)+
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
