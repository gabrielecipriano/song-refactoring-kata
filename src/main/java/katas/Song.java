package katas;

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

        String song = exposition(fly, ".") +
                "\n" +
                secondVerse(fly, spider) +
                "\n" +
                thirdVerse(fly, spider, bird) +
                "\n" +
                fourthVerse(fly, spider, bird, cat) +
                "\n" +
                fifthVerse(fly, spider, bird, cat, dog) +
                "\n" +
                "There was an old lady who swallowed a " + cow.name + ";\n" +
                cow.rhyme +
                "She swallowed the " + cow.name + " to catch the " + dog.name + ",\n" +
                "She swallowed the " + dog.name + " to catch the " + cat.name + ",\n" +
                "She swallowed the " + cat.name + " to catch the " + bird.name + ",\n" +
                "She swallowed the " + bird.name + " to catch the " + spider.name + ",\n" +
                "She swallowed the " + spider.name + " to catch the " + fly.name + ";\n" +
                fly.rhyme +
                "\n" +
                "There was an old lady who swallowed a " + horse.name + "...\n" +
                horse.rhyme;

        System.out.println(song);
    }

    private String fifthVerse(Animal fly, Animal spider, Animal bird, Animal cat, Animal dog) {
        return exposition(dog, ";") +
                development(fly, spider, bird, cat, dog) +
                coda(fly);
    }

    private String development(Animal... animals) {
        StringBuilder sb = new StringBuilder();
        for (int i = animals.length - 1; i > 0; i--) {
            sb.append(development(animals[i], animals[i-1], i == 1 ? ";" : ","));
        }
        return sb.toString();
    }


    private String fourthVerse(Animal fly, Animal spider, Animal bird, Animal cat) {
        return exposition(cat, ";") +
                development(cat, bird, ",") +
                development(bird, spider, ",") +
                development(spider, fly, ";") +
                coda(fly);
    }

    private String thirdVerse(Animal fly, Animal spider, Animal bird) {
        return exposition(bird, ";") +
                development(bird, spider, ",") +
                development(spider, fly, ";") +
                coda(fly);
    }

    private String secondVerse(Animal fly, Animal spider) {
        return exposition(spider, ";") +
                development(spider,fly, ";") +
                coda(fly);
    }

    private String development(Animal firstAnimal, Animal secondAnimal, final String punctuation) {
        return "She swallowed the " + firstAnimal.name + " to catch the " + secondAnimal.name + punctuation + "\n";
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
