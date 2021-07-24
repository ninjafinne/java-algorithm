public final class DataSet {
	public final int[] data;
	public final int[] sortInc;
	public final int[] sortDec;
	public final String msg;
	
	private DataSet(int[] _data, int[] _sortInc, int[] _sortDec, String _msg) {
		data = _data;
		sortInc = _sortInc;
		sortDec = _sortDec;
		msg = _msg;
	}
	
	private static class Builder {
		private int[] data;
		private int[] sortInc;
		private int[] sortDec;
		private String msg;
		
		public Builder withData(int[] in) {
			data = in;
			return this;
		}
		public Builder withSortInc(int[] in) {
			sortInc = in;
			return this;
		}
		public Builder withSortDec(int[] in) {
			sortDec = in;
			return this;
		}
		public Builder withMsg(String in) {
			msg = in;
			return this;
		}
		public DataSet build() {
			if (data == null)
				throw new IllegalStateException("Field data uninitialized");
			if (sortInc == null)
				throw new IllegalStateException("Field sortInc uninitialized");
			if (sortDec == null)
				throw new IllegalStateException("Field sortDec uninitialized");
			if (msg == null)
				throw new IllegalStateException("Field msg uninitialized");
			return new DataSet(data, sortInc, sortDec, msg);
		}
	}
	
	public final static DataSet[] dataSets = new DataSet[] {
		new DataSet.Builder()
			.withData(		new int[] {})
			.withSortInc(	new int[] {})
			.withSortDec(	new int[] {})
			.withMsg("Empty")
			.build(),
		new DataSet.Builder()
			.withData(		new int[] {5})
			.withSortInc(	new int[] {5})
			.withSortDec(	new int[] {5})
			.withMsg("Too Small")
			.build(),
		new DataSet.Builder()
			.withData(		new int[] {8, 1})
			.withSortInc(	new int[] {1, 8})
			.withSortDec(	new int[] {8, 1})
			.withMsg("sort0")
			.build(),
		new DataSet.Builder()
			.withData(		new int[] {1, 8})
			.withSortInc(	new int[] {1, 8})
			.withSortDec(	new int[] {8, 1})
			.withMsg("sort1")
			.build(),
		new DataSet.Builder()
			.withData(		new int[] {8, 1, 5})
			.withSortInc(	new int[] {1, 5, 8})
			.withSortDec(	new int[] {8, 5, 1})
			.withMsg("sort2")
			.build()
	};
}