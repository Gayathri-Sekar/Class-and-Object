package ClassObj4;

public class Team {
private String name;
private String city;
public String getTeamName()
{
	return this.name;
}
public String getCityRepresented()
{
	return this.city;
}
public void setTeamName(String s1)
{
	this.name=s1;
}
public void setCityRepresented(String s2)
{
	this.city=s2;
}
public void display()
{
	System.out.println("Team "+this.name);
	System.out.println("City "+this.city);
}
}
