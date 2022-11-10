import java.text.ParseException;  
import java.text.DateFormat;  
import java.util.Date; 
import java.text.SimpleDateFormat;
/*class Test{
	public static void main(String[]args){	
		String pattern = "HH:mm dd.MM.yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		try{
			String stringData = "09:00 21.09.2022";
			Date data = dateFormat.parse(stringData);
			System.out.println("Date is: "+data);
		}
		catch(ParseException e){e.printStackTrace();}
	}
}*/

class str{
	public static void main(String[]args){
		String x = "123";
		String t = "123";
		System.out.println(x==t);
	}	
}