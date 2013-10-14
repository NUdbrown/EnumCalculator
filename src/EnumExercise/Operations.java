package EnumExercise;
public enum Operations{
	
	ADD
	{
		public int calculate(int i, int j) {
			return i+j;
		}
	},
	SUBTRACT
	{
		public int calculate(int a, int b)
		{
			return a-b;
		}
	},
	DIVIDE
	{
		public int calculate(int c, int d)
		{
			return c/d;
		}
	},
	MULTIPLY
	{
		public int calculate(int e, int f)
		{
			return e*f;
		}
	};

	public int calculate(int i, int j) {
		return i+j;
	}


}

