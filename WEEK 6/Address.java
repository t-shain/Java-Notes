public class Address
{
   // instance variables
   private String street;
   private String city;
   private String state;
   private String zip;
   /**
      Create an address with street, city, state and zip
   */
   public Address(String street, String city, String state, String zip)
   {
   
   
   }
   /** 
       @return street address
   */
   public String getStreet()
   {
      return street;
   }
   /** 
       @return city of address
   */
   public String getCity()
   {
      return city;
   }
   /** 
       @return state of address
   */
   public String getState()
   {
      return state;
   }
   /** 
       @return address zip code
   */  
   public String getZip()
   {
      return zip;
   }
   /**
      set the street address
      @param s the street address
   */
   public void setStreet(String s)
   {
      street = s;
   }
   /**
      set the city of address
      @param c the city
   */
   public void setCity(String c)
   {
      city = c;
   }
   /**
      set the state of address
      @param s the state
   */
   public void setState(String s)
   {
      state = s;
   }
   /**
      set the zip code of address
      @param z the zip
   */
   public void setZip(String z)
   {
      zip = z;
   }
   public String toString() {
   
   
   }
  
}
