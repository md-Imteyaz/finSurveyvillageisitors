package com.Villagevisitors.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activities")
public class Activities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String created_user;
	private String primary_activity;
	private String secondary_activity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreated_user() {
		return created_user;
	}

	public void setCreated_user(String created_user) {
		this.created_user = created_user;
	}

	public String getPrimary_activity() {
		return primary_activity;
	}

	public void setPrimary_activity(String primary_activity) {
		this.primary_activity = primary_activity;
	}

	public String getSecondary_activity() {
		return secondary_activity;
	}

	public void setSecondary_activity(String secondary_activity) {
		this.secondary_activity = secondary_activity;
	}

	public Activities(long id, String created_user, String primary_activity, String secondary_activity) {
		super();
		this.id = id;
		this.created_user = created_user;
		this.primary_activity = primary_activity;
		this.secondary_activity = secondary_activity;
	}

	public Activities() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Activities [id=" + id + ", created_user=" + created_user + ", primary_activity=" + primary_activity
				+ ", secondary_activity=" + secondary_activity + "]";
	}

}
