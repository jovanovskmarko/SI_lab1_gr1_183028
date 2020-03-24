class Student {
	String index;
	String firstName;
	String lastName;
	int []labPoints=new int[100];

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int[] getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(int[] labPoints) {
		this.labPoints = labPoints;
	}

	public Student(String index, String firstName, String lastName) {
		
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public double getAverage(int []niza) {
		int zbir=0;
		int counter=0;
		double average;
		for(int i=1;i<=niza.length;i++) {
			zbir+=niza[i];
			counter++;
		}
		average=zbir/counter;
		return average;
		
	}

	public boolean hasSignature() {
		if(labPoints.length>=8)
			return true;
		else
			return false;
						
	}
}