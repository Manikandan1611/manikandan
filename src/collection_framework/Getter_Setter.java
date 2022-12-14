package collection_framework;

public class Getter_Setter {
	 private int eId;  
	    private String eName;  
	    private String eDesignation;  
	    private String eCompany;  
	  
	    public int getEmpId()   
	    {  
	        return eId;  
	    }  
	    public void setEmpId(final int eId)   
	    {  
	        this.eId = eId;  
	    }  
	    public String getEmpName()   
	    {  
	        return eName;  
	    }  
	    public void setEmpName(final String eName)   
	    {  
	        // Validating the employee's name and   
	        // throwing an exception if the name is null or its length is less than or equal to 0.  
	        if(eName == null ||  eName.length() <= 0)   
	        {  
	            throw new IllegalArgumentException();  
	        }  
	        this.eName = eName;  
	    }  
	    public String getEmpDesignation()   
	    {  
	        return eDesignation;  
	    }  
	    public void setEmpDesignation(final String eDesignation)   
	    {  
	        this.eDesignation = eDesignation;  
	    }  
	    public String getEmpCompany()   
	    {  
	        return eCompany;  
	    }  
	      
	    public void setEmpCompany(final String eCompany)   
	    {  
	        this.eCompany = eCompany;  
	    }  
	    // for printing the values  
	    @Override  
	    public String toString()   
	    {  
	        String str = "Employee: [id = " + getEmpId() + ", name = " + getEmpName() + ", designation = " + getEmpDesignation() + ", company = " + getEmpCompany() + "]";  
	        return str;  
	    }  
	}  
	