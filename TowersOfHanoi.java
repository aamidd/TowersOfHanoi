import java.math.BigInteger;
public class TowersOfHanoi{
	public static void main(String[] args) {
		int disks = Integer.parseInt(args[0]);
		BigInteger numberOfMoves = BigInteger.TWO.pow(disks).subtract(BigInteger.ONE);
		int sourcePeg = 1;
		int tmpPeg = 2;
		int destinationPeg = 3;
		solve(disks, sourcePeg, tmpPeg, destinationPeg);
		System.out.printf("number of moves: %d%n", numberOfMoves);
	}

	public static void solve(int disks, int srcPeg, int tmpPeg, int dstPeg) {
		if (disks == 1) {
			System.out.printf("%d --> %d%n", srcPeg, dstPeg);
			return;
		}

		solve(disks - 1, srcPeg, dstPeg, tmpPeg);
		System.out.printf("%d --> %d%n", srcPeg, dstPeg);
		solve(disks - 1, tmpPeg, srcPeg, dstPeg);
	}
}
