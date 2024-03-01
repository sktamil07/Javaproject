package Accord;

public interface Functions {
    int addproduct(int mobileid,int Brandid,String model,String processor,String ram,
    		String storage,int display_size,String camera,int battery);
    
	void Addmobiles(int id,String brand) ;

	void viewall();
	
	void view2table();
	
	void searchbybrand(int brandid);
	
	int updatebrand(int mobileid,int Brandid,String model,String processor,String ram,String storage,
			int display_size,String camera,int battery);
	
	int removebrand(int mobileid);
	
}



