package Indian_Player_Record;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Player_Record {
	
	@Id
	@Column(name =" Matches")
	private int matches;
	@Column(name="Run")
	private int run;
	@Column(name="Century")
	private int Century;
	@Column(name ="Haly_Century")
	private int halfCentury;
	
	@OneToOne 
	private PlayerName playername;

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public int getCentury() {
		return Century;
	}

	public void setCentury(int century) {
		Century = century;
	}

	public int getHalfCentury() {
		return halfCentury;
	}

	public void setHalfCentury(int halfCentury) {
		this.halfCentury = halfCentury;
	}

	public PlayerName getPlayername() {
		return playername;
	}

	public void setPlayername(PlayerName playername) {
		this.playername = playername;
	}

	public Player_Record(int matches, int run, int century, int halfCentury, PlayerName playername) {
		super();
		this.matches = matches;
		this.run = run;
		Century = century;
		this.halfCentury = halfCentury;
		this.playername = playername;
	}

	public Player_Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
