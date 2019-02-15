package katas;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SuppressWarnings("ALL")
class SongTest {
    @Test
    void should_pass() throws Exception {
        PrintStream originalOut = System.out;

        try (ByteArrayOutputStream output = new ByteArrayOutputStream();
             PrintStream outputStream = new PrintStream(output)) {
            System.setOut(outputStream);

            new Song().execute();

            assertThat(output.toString(), is("There was an old lady who swallowed a fly.\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a spider;\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the spider to catch the fly;\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a bird;\n" +
                    "How absurd to swallow a bird.\n" +
                    "She swallowed the bird to catch the spider,\n" +
                    "She swallowed the spider to catch the fly;\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a cat;\n" +
                    "Fancy that to swallow a cat!\n" +
                    "She swallowed the cat to catch the bird,\n" +
                    "She swallowed the bird to catch the spider,\n" +
                    "She swallowed the spider to catch the fly;\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a dog;\n" +
                    "What a hog, to swallow a dog!\n" +
                    "She swallowed the dog to catch the cat,\n" +
                    "She swallowed the cat to catch the bird,\n" +
                    "She swallowed the bird to catch the spider,\n" +
                    "She swallowed the spider to catch the fly;\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a cow;\n" +
                    "I don't know how she swallowed a cow!\n" +
                    "She swallowed the cow to catch the dog,\n" +
                    "She swallowed the dog to catch the cat,\n" +
                    "She swallowed the cat to catch the bird,\n" +
                    "She swallowed the bird to catch the spider,\n" +
                    "She swallowed the spider to catch the fly;\n" +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                    "\n" +
                    "There was an old lady who swallowed a horse...\n" +
                    "...She's dead, of course!\n"));
        }

        System.setOut(originalOut);
    }
}
