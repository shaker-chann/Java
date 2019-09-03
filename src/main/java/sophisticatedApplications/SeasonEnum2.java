package sophisticatedApplications;

public enum SeasonEnum2 {
	SPRING("春"),SUMMER("夏"),FALL("秋"),WINTER("冬");
	private  String name;
	SeasonEnum2(String name) {
		this.name=name;
	}
	public String toString() {
		return this.name;
	}
	
	public static void main(String[] args) {
		for(SeasonEnum2 s:SeasonEnum2.values())
			System.out.println(s);
		SeasonEnum2 seasonEnum2=SeasonEnum2.valueOf("SUMMER");
		System.out.println(seasonEnum2);
		
		SeasonEnum2 seasonEnum22=SeasonEnum2.WINTER;
		
	}

}
