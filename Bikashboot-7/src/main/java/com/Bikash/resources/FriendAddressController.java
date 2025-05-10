package com.Bikash.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendAddressController {

	@Autowired
	private Friend friend;
	
//	@Autowired
//	public FriendAddressController(Friend friend) {
//		this.friend = friend;
//	}


//	@Autowired
//	public void setFriend(Friend friend) {
//		this.friend = friend;
//	}
	

	@RequestMapping("/friend")
	public String getFriend() {
		return friend.getFriend();
	}
}
