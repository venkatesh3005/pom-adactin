package org.pom;

public class MainFlow extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	launchBrowser();
	PomAdactin p=new PomAdactin();
	type(p.getTypeUser(),"kishore27");
	type(p.getTypePass(),"selenium27");
	click(p.getLogin().get(0));
	AdactinSearchHotel n=new AdactinSearchHotel();
	dropDown(n.getLocation(),1);
	dropDown(n.getHotels(),1);
	dropDown(n.getRoom(),1);
	dropDown(n.getRoomNo(),1);
	type(n.getInDate(),"08/10/2019");
	type(n.getOutDate(),"09/10/2019");
	dropDown(n.getAdults(),1);
	click(n.getSubmit());
	Hotel h=new Hotel();
	click(h.getRadio());
	click(h.getHotelconfirm());
	PersonalDetails k=new PersonalDetails();
	type(k.getFname(),"venkat");
	type(k.getLname(),"sm");
	type(k.getUseraddress(),"ghhghsacdgsagf");
	type(k.getCardno(),"1234567891234567");
	dropDown(k.getType(),1);
	dropDown(k.getExmonth(),1);
	dropDown(k.getExyear(),11);
	type(k.getCvvno(),"343");
	click(k.getBookno());
	Thread.sleep(6000);
	OrderId id=new OrderId();
	attribute(id.getOrderid(),"value");
	
	
	
	
	
}
}
