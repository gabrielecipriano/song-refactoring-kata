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

        String song = "There was an old lady who swallowed a " + fly.name + ".\n" +
                fly.rhyme +
                "\n" +
                "There was an old lady who swallowed a " + spider.name + ";\n" +
                spider.rhyme +
                "She swallowed the " + spider.name + " to catch the " + fly.name + ";\n" +
                fly.rhyme +
                "\n" +
                "There was an old lady who swallowed a " + bird.name + ";\n" +
                bird.rhyme +
                "She swallowed the " + bird.name + " to catch the " + spider.name + ",\n" +
                "She swallowed the " + spider.name + " to catch the " + fly.name + ";\n" +
                fly.rhyme +
                "\n" +
                "There was an old lady who swallowed a " + cat.name + ";\n" +
                cat.rhyme +
                "She swallowed the " + cat.name + " to catch the " + bird.name + ",\n" +
                "She swallowed the " + bird.name + " to catch the " + spider.name + ",\n" +
                "She swallowed the " + spider.name + " to catch the " + fly.name + ";\n" +
                fly.rhyme +
                "\n" +
                "There was an old lady who swallowed a " + dog.name + ";\n" +
                dog.rhyme +
                "She swallowed the " + dog.name + " to catch the " + cat.name + ",\n" +
                "She swallowed the " + cat.name + " to catch the " + bird.name + ",\n" +
                "She swallowed the " + bird.name + " to catch the " + spider.name + ",\n" +
                "She swallowed the " + spider.name + " to catch the " + fly.name + ";\n" +
                fly.rhyme +
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

    private class Animal {

        private final String name;
        private final String rhyme;

        public Animal(String name, String rhyme) {
            this.name = name;
            this.rhyme = rhyme;
        }
    }
}
