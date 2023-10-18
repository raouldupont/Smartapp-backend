package jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LIEFERANT database table.
 * 
 */
@Entity
@NamedQuery(name="Lieferant.findAll", query="SELECT l FROM Lieferant l")
public class Lieferant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long lnr;

	private String name;

	private String plz;

	public Lieferant() {
	}

	@Override
  public String toString() {
    return "Lieferant [lnr=" + lnr + ", name=" + name + ", plz=" + plz + "]";
  }

  public long getLnr() {
		return this.lnr;
	}

	public void setLnr(long lnr) {
		this.lnr = lnr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlz() {
		return this.plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

}