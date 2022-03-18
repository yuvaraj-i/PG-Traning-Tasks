package assignments;

class Holiday {

	private String name;
	private int day;
	private String month;

	Holiday (String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public String getMonth () {
	    return this.month;
	}
	
	public int getDay () {
	    return this.day;
	}
	
	public boolean isSameMonth(Holiday other) {
	    
	    return this.month.equals(other.getMonth());
	}
	
	
}


public class HolidayProblem {

	public static void main(String[] args) {

		Holiday obj1 = new Holiday("Independence Day", 12, "march");
		Holiday obj2 = new Holiday("Republic Day", 22, "march");
		
		obj1.isSameMonth(obj2);


	}
	
	public static double avgDate(Holiday[] allObj) {
	    
	    int n = allObj.length;
	    int totalDate = 0;
	    
	    for (int i = 0; i < n; i++) {    
	        totalDate += allObj[i].getDay();
	    }
	    
	    return totalDate / n;
	}
}