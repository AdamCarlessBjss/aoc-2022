import java.nio.file.*;
import java.util.*;

public class puzzle {

    private List<String> input;

    public puzzle(String filename) throws Exception {
        input = Files.readAllLines(Path.of(filename));
    }

    // init / globals go here

    public int part1() {
        // clever goes here
        return 0;
    }

    public int part2() {
        // more clever goes here
        return 0;
    }

    public static void main(String[] args) throws Exception {
        var puzzle = new puzzle(args[0]);
        System.out.println("part1: " + puzzle.part1());
        System.out.println("part2: " + puzzle.part2());
    }
}