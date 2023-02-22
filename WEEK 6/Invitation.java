public class Invitation {
	private String invitee;
	private String event;
	private String date;
	private Address location; // using another object as an instance variable //
	private Address toInvitee;
	private boolean attending;
  
  // Blueprint constructor 
	public Invitation(String invitee, String event, String date, Address location, Address toInvitee, boolean attending) {
		this.invitee = invitee;
		this.event = event;
		this.date = date;
		this.location = location;
		this.toInvitee = toInvitee;
		this.attending = attending;
	}
  // constuctor with no boolean param defualts to true  
	public Invitation(String invitee, String event, String date, Address location, Address toInvitee) {
		this.invitee = invitee;
		this.event = event;
		this.date = date;
		this.location = location;
		this.toInvitee = toInvitee;
		this.attending = true;
	}
	
	public void positiveResponse() {
		setAttending(true);
	}
	
	public void setAttending(boolean b){
		attending = b;
	}
  
}
