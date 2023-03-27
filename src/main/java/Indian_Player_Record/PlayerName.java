package Indian_Player_Record;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerName {
	
	@Id
	@Column(name="Played_Matches")
	private int match;
	private String name;
	
	
	
	public int getMatch() {
		return match;
	}
	public void setMatch(int match) {
		this.match = match;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PlayerName(int match, String name) {
		super();
		this.match = match;
		this.name = name;
	}
	public PlayerName() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
