package CDLevytFINAL.NalleFyrqvist.CDLevyt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CDLevyt")
public class cdlevyt {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Levy_id;
	private String Artisti;
	private String Albumi;
	private String BiisiLkm;
	private String Julkaisuvuosi;
	private String Tyylilaji;
	
	public cdlevyt() {}
	
	public cdlevyt(String Artisti, String Albumi, String BiisiLkm, String Julkaisuvuosi, String Tyylilaji) {
		super();
		this.Artisti = Artisti;
		this.Albumi = Albumi;
		this.BiisiLkm = BiisiLkm;
		this.Julkaisuvuosi = Julkaisuvuosi;
		this.Tyylilaji = Tyylilaji;
	}



	public long getLevy_id() {
		return Levy_id;
	}



	public void setLevy_id(long Levy_id) {
		this.Levy_id = Levy_id;
	}



	public String getArtisti() {
		return Artisti;
	}



	public void setartisti(String Artisti) {
		this.Artisti = Artisti;
	}



	public String getAlbumi() {
		return Albumi;
	}



	public void setAlbumi(String Albumi) {
		this.Albumi = Albumi;
	}



	public String getBiisiLkm() {
		return BiisiLkm;
	}



	public void setBiisiLkm(String BiisiLkm) {
		this.BiisiLkm = BiisiLkm;
	}



	public String getJulkaisuvuosi() {
		return Julkaisuvuosi;
	}



	public void setJulkaisuvuosi(String Julkaisuvuosi) {
		this.Julkaisuvuosi = Julkaisuvuosi;
	}



	public String getTyylilaji() {
		return Tyylilaji;
	}



	public void setTyylilaji(String Tyylilaji) {
		this.Tyylilaji = Tyylilaji;
	}



	@Override
	public String toString() {
		return "CDLevyt [Levy_id=" + Levy_id + ", Artisti=" + Artisti + ", Albumi=" + Albumi + ", BiisiLkm=" + BiisiLkm
				+ ", Julkaisuvuosi=" + Julkaisuvuosi + ", Tyylilaji=" + Tyylilaji + "]";
	}

}
	