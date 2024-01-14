import java.math.BigInteger;
import java.util.Scanner;
public class TowersOfHanoi{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("> Number of disks: ");
		int numberOfDisks = input.nextInt();

		System.out.println();

		BigInteger numberOfMoves = BigInteger.TWO.pow(numberOfDisks).subtract(BigInteger.ONE);

		solve(numberOfDisks);
		System.out.printf("number of moves: %d%n", numberOfMoves);
	}

	public static void solve(int numberOfDisks, int srcPeg, int tmpPeg, int dstPeg) {
		if (numberOfDisks == 1) {
			System.out.printf("%d --> %d%n", srcPeg, dstPeg);
			return;
		}

		solve(numberOfDisks - 1, srcPeg, dstPeg, tmpPeg);
		System.out.printf("%d --> %d%n", srcPeg, dstPeg);
		solve(numberOfDisks - 1, tmpPeg, srcPeg, dstPeg);
	}
	private static void solve(int numberOfDisks) {
		solve(numberOfDisks, 1, 2, 3);
	}
}
