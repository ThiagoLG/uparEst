import java.text.SimpleDateFormat;
import java.util.Calendar;

public class aaaa {

	public static void main(String[] args) {

		// JOptionPane.showMessageDialog(null, "oi");
		//
		// try {
		// Thread.sleep(1000);
		// } catch (InterruptedException ex) {
		// ex.printStackTrace();
		// }
		//
		// JOptionPane.showMessageDialog(null, "Tchau");

		// String dat = "01/03/2016";
		// String dat2 = "31/12/2016";
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// try {
		// Date d = sdf.parse(dat);
		// Date d2 = sdf.parse(dat2);
		//
		// System.out.println(d + " " + d2);
		//
		// if(d2.after(d)){
		// System.out.println("Data dois é maior entao vou trocar aqui");
		// d2 = d;
		//
		// System.out.println(sdf.format(d2));
		// System.out.println(sdf.format(d));
		//
		// }
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();

		try {
			data1.setTime(sdf.parse("01/01/2017"));
			data2.setTime(sdf.parse("01/06/2017"));
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		
				
		int dias = data2.get(Calendar.DAY_OF_YEAR) - data1.get(Calendar.DAY_OF_YEAR);
		System.out.println((String.valueOf(dias)));
		
		float sem = dias / 7;
		
		int hor = (int) (sem * 30);

		System.out.println(sem);
		System.out.println(hor);
		
	}

}
