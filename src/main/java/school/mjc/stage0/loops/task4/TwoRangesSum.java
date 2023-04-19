package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skip = 0;
        int sum = 0;
        for (int i = 0; i <= lastInRow; i++) {
            if (i % numberToSkip == 0) {
                skip += i;
                continue;
            } else {
                sum += i;
            }
            if (numberToSkip == lastInRow) {
                skip += i;
                sum = 0;
            }
            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bigger then the last");
                break;
            }
        }
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (lastInRow >= numberToSkip) {
            System.out.println("skipped sum is " + skip);
            System.out.println("counted sum is " + sum);
        }
    }
}
