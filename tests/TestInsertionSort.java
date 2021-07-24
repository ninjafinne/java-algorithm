import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestInsertionSort {
	@Test
	void testSort() {
		for (DataSet d : DataSet.dataSets) {
			int[] out = InsertionSort.sort(d.data);
			assertArrayEquals(d.sortInc, out);
		}
	}
}
