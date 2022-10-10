package exam3;
import java.util.*;
class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String str){
        super(str);
    }
}
class Candidate {
	
	private String name;
	private String gender;
	private double expectedSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
}

public class regcandidate {
	 public static Candidate getCandidateDetails() throws InvalidSalaryException
	    {
	        System.out.println("Enter the candidate Details");
	        Scanner scn = new Scanner(System.in);
	        
	        
	        Candidate cand = new Candidate();

	        System.out.println("Name");
	        String name = scn.nextLine();
	        cand.setName(name);
	            
	        
	        System.out.println("Gender");
	        String gender = scn.nextLine();
	        cand.setGender(gender);
	        
	        
	        System.out.println("Expected Salary");
	        double sal = scn.nextDouble();
	        
	        if(sal<10000)
	        {
	            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
	        }
	        else
	        {
	            cand.setExpectedSalary(sal);
	            return cand;
	        }
	        }
	

	public static void main(String[] args) {
		regcandidate exp = new regcandidate();
        Candidate exp2;
        try
        {
            exp2 = exp.getCandidateDetails();
            System.out.println("Registration Successful");
        }
        catch(InvalidSalaryException e)
        {
            System.out.println(e.getMessage());
        }

		

	}

}
