public class Invitation {
	private String invitee;
	private String event;
	private String date;
	private Address location; // using another object as an instance variable //
	private Address toInvitee;
	private boolean attending;
  
  // Blueprint constructor .
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
// Copy constructor for invitation
	public Invitation(Invitation other) {
		invitee = other.invitee;
		event = other.event;
		date = other.date;
		location = new Address(other.location);
		toInvitee = new Address(other.toInvitee);
		attending = other.attending;
	}
	
	public void positiveResponse() {
		setAttending(true);
	}
	
	public void setAttending(boolean b){
		attending = b;
	}
	@Override
	public String toString() {
		String s = String.format("%s\n %s\n %s\n %s\n", invitee, event, date, location);
		if(attending)
			s += "attending";
		else
			s += "not attending";
		return s;
	}
	@Override
	public boolean equals(Object other) {
		Invitation iOther = (Invitation)other;
		if(this.date.equals(iOther.date) && this.location.equals(iOther.location))
			return true;
		return false;
	}
  
}
