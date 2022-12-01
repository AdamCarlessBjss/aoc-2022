import java.nio.file.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// https://adventofcode.com/2022/day/1
public class puzzle {

    private ArrayList<Integer> calsPerElf = new ArrayList<>();

    public puzzle(String filename) throws Exception {
        // wrapper to avoid the "effectively final" issue for lambdas
        var singleElfCals = new AtomicInteger(0);

        // there's probably a neat collector for this
        Files.lines(Path.of(filename)).forEach(l -> {
            if (l.isBlank()) calsPerElf.add(singleElfCals.getAndSet(0));
            else             singleElfCals.getAndAdd(Integer.valueOf(l.trim()));
        });
        Collections.sort(calsPerElf);
        Collections.reverse(calsPerElf);
    }

    public int part1() { return calsPerElf.get(0); }

    public int part2() { return calsPerElf.subList(0, 3).stream().reduce(0, Integer::sum); }

    // should be able to template this stuff
    public static void main(String[] args) throws Exception {
        var puzzle = new puzzle(args[0]);
        System.out.println("part1: " + puzzle.part1());
        System.out.println("part2: " + puzzle.part2());
    }
}