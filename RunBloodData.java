import java.util.Scanner;
public class RunBloodData{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1,input2;
		String data;
		BloodData Bd = new BloodData();
		System.out.print("Enter blood type of patient:");
		input1 = sc.nextLine();
		System.out.print("Enter the Rhesus factor (+ or -):");
		input2 = sc.nextLine();
		data = input1 + input2;
		if(data.isEmpty()){
			Bd.setBloodtype(input1);
			Bd.setRhFactor(input2);
			Bd.display();
		}
		else if (data.equals("A+")||data.equals("A-")||data.equals("B+")||data.equals("B-")||
				data.equals("AB+")||data.equals("AB-")||data.equals("O-")||data.equals("O+")){
					
					Bd = new BloodData(input1 , input2);
					Bd.display();
				}
				else{
					System.out.println("invalid Input!");
				}
				sc.close ();
				


				
	}
}