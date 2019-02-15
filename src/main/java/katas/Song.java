package katas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.*;
import static java.util.Arrays.asList;

public class Song {
    public static void main(String[] args) {
        new Song().execute();
    }

    public void execute() {

        final List<Animal> animals = asList(
                new Animal("fly", "I don't know why she swallowed a fly - perhaps she'll die!"),
                new Animal("spider", "That wriggled and wiggled and tickled inside her."),
                new Animal("bird", "How absurd to swallow a bird."),
                new Animal("cat", "Fancy that to swallow a cat!"),
                new Animal("dog", "What a hog, to swallow a dog!"),
                new Animal("cow", "I don't know how she swallowed a cow!"),
                new Animal("horse", "...She's dead, of course!")
        );
        String song = composeSongWith(animals);

        System.out.print(song);
    }

    private String composeSongWith(List<Animal> animals) {
        return exposition(animals.get(0), ".") +
                "\n" +
                verses(animals) +
                "\n" +
                exposition(animals.get(animals.size() - 1), "...");
    }

    private String verses(List<Animal> animals) {
        return IntStream.range(2, animals.size())
                .mapToObj(i -> verse(animals.subList(0, i)))
                .collect(Collectors.joining("\n"));
    }

    private String verse(List<Animal> animals) {
        Animal last = animals.get(animals.size() - 1);
        Animal firstAnimal = animals.get(0);

        return exposition(last, ";") +
                development(animals) +
                coda(firstAnimal);
    }

    private String development(List<Animal> animals) {
        StringBuilder sb = new StringBuilder();
        for (int i = animals.size() - 1; i > 0; i--) {
            final String punctuation = i == 1 ? ";" : ",";
            sb.append(format("She swallowed the %s to catch the %s%s\n", animals.get(i).name, animals.get(i - 1).name, punctuation));
        }
        return sb.toString();
    }


    private String coda(Animal animal) {
        return animal.rhyme + "\n";
    }

    private String exposition(Animal animal, final String punctuation) {
        return "There was an old lady who swallowed a " + animal.name + punctuation + "\n" +
                animal.rhyme + "\n";
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
