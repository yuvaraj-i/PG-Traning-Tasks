package cls;

public class Validate {
	
	public boolean validateIpv4Address(String address) {
		String[] temp = address.split("\\.");
		
		if (temp.length != 4) {
			return false;
		}
		
		if (temp[3].equals("0") || temp[3].equals("255")) {
			return false;
		}
		
		for(int i = 0; i < temp.length; i++) {
			int ipValue = Integer.parseInt(temp[i]);
			
			if (ipValue > 255 || ipValue < 0) {
				return false;
			}
			
		}
		
		
		return true;
		
	}

}
