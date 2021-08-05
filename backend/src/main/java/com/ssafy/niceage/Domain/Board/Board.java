package com.ssafy.niceage.Domain.Board;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.ssafy.niceage.Domain.Comment.Comment;
import com.ssafy.niceage.Domain.User.User;

import lombok.Data;

@Entity
@Data
public class Board {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "board_id")
	private int Id;
	
	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval =true)
	List<Comment> comments = new ArrayList<Comment>();
	
	@Column (name = "board_title", nullable = false, length = 45)
    private String Title;
	
	@Column (name = "board_contents", nullable = false, length = 255)
    private String Contents;
	
	@Column (name = "board_date")
	private String Date;
	
	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn (name = "user_no")
    private User user;
}
