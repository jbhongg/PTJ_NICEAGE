package com.ssafy.niceage.Domain.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.ssafy.niceage.Controller.Request.UserRequest;
import com.ssafy.niceage.Domain.Board.Board;
import com.ssafy.niceage.Domain.Comment.Comment;
import com.ssafy.niceage.Domain.Enter.Enter;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "user_no", nullable = false)
	private int No;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval =true)
	List<Enter> enters = new ArrayList<Enter>();
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval =true)
	List<Board> boards = new ArrayList<Board>();
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval =true)
	List<Comment> comments = new ArrayList<Comment>();
	
	@Column (name = "user_id", nullable = false, length = 45)
	private String Id;
	
	@Column (name = "user_password", nullable = false, length = 45)
    private String Password;
	
	@Column (name = "user_name", nullable = false, length = 45)
    private String Name;
	
	@Column (name = "user_address", nullable = false, length = 200)
    private String Address;
	
	@Column (name = "user_gender", nullable = false, length = 1)
    private String Gender;
	
	@Column (name = "user_birth", nullable = false)
    private String Birth;
	
	@Column (name = "user_phone_number", nullable = false, length = 30)
    private String Phone;
	
	@Column (name = "user_emergency_number", nullable = true, length = 30)
    private String Emergency;
	
	public static User createUser(UserRequest request) {
		User userInput = new User();
		userInput.Id = request.getUserId();
        userInput.setId(request.getUserId());
        userInput.setPassword(request.getUserPassword());
        userInput.setName(request.getUserName());
        userInput.setAddress(request.getUserAddress());
        userInput.setGender(request.getUserGender());
        userInput.setBirth(request.getUserBirth());
        userInput.setPhone(request.getUserPhone());
        userInput.setEmergency(request.getUserEmergency());
        return userInput;
	}
}
