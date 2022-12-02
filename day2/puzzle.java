import java.nio.file.*;
import java.util.*;

// https://adventofcode.com/2022/day/N
public class puzzle {

    private List<String> input;

    private static Map<String, Integer> part1Rules = Map.of(
            "A X", 1 + 3,
            "A Y", 2 + 6,
            "A Z", 3 + 0,
            "B X", 1 + 0,
            "B Y", 2 + 3,
            "B Z", 3 + 6,
            "C X", 1 + 6,
            "C Y", 2 + 0,
            "C Z", 3 + 3);

    private static Map<String, Integer> part2Rules = Map.of(
            "A X", 3 + 0,
            "A Y", 1 + 3,
            "A Z", 2 + 6,
            "B X", 1 + 0,
            "B Y", 2 + 3,
            "B Z", 3 + 6,
            "C X", 2 + 0,
            "C Y", 3 + 3,
            "C Z", 1 + 6);

    public puzzle(String filename) throws Exception {
        input = Files.readAllLines(Path.of(filename));
    }

    public int part1() {
        var score = 0;
        for (var game : input) {
            score += part1Rules.get(game);
        }
        return score;
    }

    public int part2() {
        var score = 0;
        for (var game : input) {
            score += part2Rules.get(game);
        }
        return score;
    }

    // should be able to template this stuff
    public static void main(String[] args) throws Exception {
        var puzzle = new puzzle(args[0]);
        System.out.println("part1: " + puzzle.part1());
        System.out.println("part2: " + puzzle.part2());
    }
}