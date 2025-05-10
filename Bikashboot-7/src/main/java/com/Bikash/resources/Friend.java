package com.Bikash.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

    @Component
    public class Friend {

    @Autowired
	private Address address;
    
	
//    @Autowired
//    public Friend(Address address) {
//		this.address = address;
//	}
	
//	@Autowired
//	public void setAddress(Address address) {
//		this.address=address;
//	}
	
	public String getFriend(){
		return "SATYA RANJAN NAYAK, Java Developer, 32000.00"
				+"----"+address.getAddress();
	}
}

