package w8;

	public enum Operator {

		AND {
			public String toString() {
				return "&";
			}
		},

		OR {
			public String toString() {
				return "|";
			}
		},

		IF {
			public String toString() {
				return "->";
			}
		},
		NOT {
			public String toString() {
				return "~";
			}
		}
	}

