/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mibosante.servlet;

/**
 *
 * @author 
 */
import com.mibosante.models.User;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.File;

public class XmlFile {

	public static void main(String[] args) {
		
		try {
			
			User myUser = new User();
			
			myUser.setName("Mohamed");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			File file = new File("src\\main\\resources\\myUser.xml");
			
			marshaller.marshal(myUser, file);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}