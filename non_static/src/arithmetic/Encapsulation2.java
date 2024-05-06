package arithmetic;



class GPT
{   private String username="contact@grotechminds.com";
    private String password ="password@123";
	private int age =30;
	public int get_age()
	{
		return age;
	}
	public void set_age(int age)
	{
		this.age = age;
	}
	public String get_username()
	{
		return username;
	}
    public void set_username(String username)
	  {
		this.username = username;
	  }
	  public String get_password()
	  {
		return password;
	}
	public void set_password(String password)
	{
		this.password = password;
	}
}	
public class Encapsulation2 {

	public static void main(String[] args) {
		GPT g1=new GPT();
		 
	      g1.set_username("eeshanacharya@gmail.com");
	      System.out.println(g1.get_username());
		g1.set_age(24);
	       System.out.println(g1.get_age());

	}

}
