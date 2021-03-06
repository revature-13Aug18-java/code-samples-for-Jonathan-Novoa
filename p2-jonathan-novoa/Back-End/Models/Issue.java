package com.revature.salutem.models;
import org.springframework.stereotype.Component;

@Component
public class Issue {
	
	private int id;
	private String name;
	private String profName;
	private float accuracy;
	private int ranking;
	private String redFlag;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getRedFlag() {
		return redFlag;
	}

	public void setRedFlag(String redFlag) {
		this.redFlag = redFlag;
	}

	public Issue(int id, String name, String profName, float accuracy, int ranking, String redFlag) {
		super();
		this.id = id;
		this.name = name;
		this.profName = profName;
		this.accuracy = accuracy;
		this.ranking = ranking;
		this.redFlag = redFlag;
	}

	public Issue() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(accuracy);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((profName == null) ? 0 : profName.hashCode());
		result = prime * result + ranking;
		result = prime * result + ((redFlag == null) ? 0 : redFlag.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Issue other = (Issue) obj;
		if (Float.floatToIntBits(accuracy) != Float.floatToIntBits(other.accuracy))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (profName == null) {
			if (other.profName != null)
				return false;
		} else if (!profName.equals(other.profName))
			return false;
		if (ranking != other.ranking)
			return false;
		if (redFlag == null) {
			if (other.redFlag != null)
				return false;
		} else if (!redFlag.equals(other.redFlag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Issue [id=" + id + ", name=" + name + ", profName=" + profName + ", accuracy=" + accuracy + ", ranking="
				+ ranking + ", redFlag=" + redFlag + "]";
	}
	
	
}
