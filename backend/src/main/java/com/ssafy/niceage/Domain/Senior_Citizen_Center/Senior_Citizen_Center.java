package com.ssafy.niceage.Domain.Senior_Citizen_Center;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.ssafy.niceage.Domain.Enter.Enter;

import lombok.Data;

@Entity
@Data
public class Senior_Citizen_Center {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "senior_id")
	private int Id;
	
	@OneToMany(mappedBy = "senior")
	List<Enter> enters = new ArrayList<Enter>();

	@Column (name = "senior_name", nullable = false, length = 45)
    private String Name;
	
	@Column (name = "senior_address", nullable = false, length = 200)
    private String Address;
	
	public Senior_Citizen_Center(int id, String name, String address) {
		super();
		Id = id;
		Name = name;
		Address = address;
	}
	
}