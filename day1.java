import java.nio.file.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class puzzle {

    private ArrayList<Integer> calsPerElf = new ArrayList<>();

    public puzzle(String filename) throws Exception {
        AtomicInteger singleElfCals = new AtomicInteger(0);
        Files.lines(Path.of(filename)).forEach(l -> {
            if (l.isBlank()) calsPerElf.add(singleElfCals.getAndSet(0));
            else singleElfCals.getAndAdd(Integer.valueOf(l.trim()));
        });
        Collections.sort(calsPerElf);
        Collections.reverse(calsPerElf);
    }

    public int part1() { return calsPerElf.get(0); }

    public int part2() { return calsPerElf.subList(0, 3).stream().reduce(0, Integer::sum); }

    public static void main(String[] args) throws Exception {
        var puzzle = new puzzle(args[0]);
        System.out.println("part1: " + puzzle.part1());
        System.out.println("part2: " + puzzle.part2());
    }
}