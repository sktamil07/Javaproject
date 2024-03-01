package Accord;
import java.util.Scanner;
public class Projectmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Code c=new Code();
		while(true)
		{
			try {
				System.out.println("---------------------------------");
				System.out.println("         Mobiles detailes        ");
				System.out.println("---------------------------------");
				System.out.println("         1. Insert detailes");
				System.out.println("         2. Insert detailes");
				System.out.println("         3. view Brand detailes");
				System.out.println("         4. view mobile detailes");
				System.out.println("         5. view spacific mobile detailes");
				System.out.println("         6. Change detailes");
				System.out.println("         7. Remove ");
				System.out.println("         0. Exit");
				System.out.println("         Enter the your choice :  ");
				int ch=sc.nextInt();
				sc.nextLine();
				if(ch==0) {
					System.out.println("Thank you");
					break;
				}
				switch(ch) {
				case 1:
					System.out.println("Enter the mobile Id");
					int mobileid=sc.nextInt();
					System.out.println("Enter the Brand Id");
					int Brandid=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the Model ");
					String model=sc.nextLine();
					System.out.println("Enter the processor ");
					String processor=sc.nextLine();
					System.out.println("Enter the Ram");
					String ram=sc.nextLine();
					System.out.println("Enter the Storage");
					String storage=sc.nextLine();
					System.out.println("Enter the displaysize");
					float display_size=sc.nextFloat();
					sc.nextLine();
					System.out.println("Enter the camera size");
					String camera=sc.nextLine();
					System.out.println("Enter the Battery");
					int battery=sc.nextInt();
					int count =c.addproduct(mobileid,Brandid,model,processor,ram,storage,display_size,camera,battery);
					if(count==1)
					{
						System.out.println("Saved");
					}
					else
					{
						System.out.println("Not saved");
					}
					break;
					
				case 2:	
					System.out.println("Enter the Id ");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the Model ");
					String brand=sc.nextLine();
					int count1 =c.Addmobiles(id, brand);
					if(count1==1) {
						System.out.println("Saved");
					}else {
						System.out.println(" Not Saved");

					}
				case 3:
					c.viewall();
					break;
				case 4:
					c.view2table();
					break;
				case 5:	
					System.out.println("Enter the Brand Id");
					int Brandid1=sc.nextInt();
					c.searchbybrand(Brandid1);
					break;
				case 6:
					
					/*System.out.println("Enter the Brand Id");
					int Brandid2=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the Model ");
					String model1=sc.nextLine();
					System.out.println("Enter the processor ");
					String processor1=sc.nextLine();*/
					System.out.println("Enter the Ram");
					String ram1=sc.nextLine();
					System.out.println("Enter the Storage");
					String storage1=sc.nextLine();
					System.out.println("Enter the mobile Id");
					int mobileid1=sc.nextInt();
					/*System.out.println("Enter the displaysize");
					float display_size1=sc.nextFloat();
					sc.nextLine();
					System.out.println("Enter the camera size");
					String camera1=sc.nextLine();
					System.out.println("Enter the Battery");
					int battery1=sc.nextInt();*/
				    c.updatebrand(mobileid1,  ram1, storage1);
				    break;
				case 7:
					System.out.println("Enter the Brand Id");
					int mobileid3=sc.nextInt();
				    c.removebrand(mobileid3);
				    break;
				   
				}
					
			}catch (Exception e) {
                e.printStackTrace();
		}
	}
	
	}
}


