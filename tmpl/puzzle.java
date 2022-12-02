import java.nio.file.*;
import java.util.*;

// https://adventofcode.com/2022/day/N
public class puzzle {

    private List<String> input;

    public puzzle(String filename) throws Exception {
        input = Files.readAllLines(Path.of(filename));
    }

    public int part1() { return 0; }

    public int part2() { return 0; }

    // should be able to template this stuff
    public static void main(String[] args) throws Exception {
        var puzzle = new puzzle(args[0]);
        System.out.println("part1: " + puzzle.part1());
        System.out.println("part2: " + puzzle.part2());
    }
}