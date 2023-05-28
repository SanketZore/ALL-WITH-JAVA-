import java.util.*;
class teacher{
    String college_name="VPPcoe";
    String location="sion";
    void Display(){
        System.out.println("College Name: "+college_name);
        System.out.println("Location: "+location);
    }
}
class professor extends teacher{
    String proff_name="Archana";
    String proff_subj="DSA";
    void Display_prof(){
        System.out.println("Professor Name: "+proff_name);
        System.out.println("Professor ID: "+proff_subj);
    }  
}

class assi_proff extends teacher{
	String assi_proff_name="Suchita";
	String assi_proff_subj="DBMS";
	void d1(){
		System.out.println("Name of Assistant Professor: "+assi_proff_name);
		System.out.println("Subject of Assistant Professor: "+assi_proff_subj);	
	}
}
class asso_proff extends teacher{
	String asso_proff_name="Neha";
	String asso_proff_subj="PCPF";
	void d2(){
		System.out.println("Name of Assistant Professor: "+asso_proff_name);
		System.out.println("Subject of Assistant Professor: "+asso_proff_subj);	
	}
}
class fac_info{
	public static void main(String[] args){
	teacher teach=new teacher();
	teach.Display();
	professor prof=new professor();
	prof. Display_prof();
	assi_proff asi=new assi_proff();
	asi.d1();
	asso_proff aso=new asso_proff();
	aso.d2();
		

	}
}
