package com.cg.mobshop.ui;

import java.util.Scanner;

import com.cg.mobshop.dto.PurchaseDetails;
import com.cg.mobshop.service.PurchaseService;
import com.cg.mobshop.service.PurchaseServiceImpl;

public class Main {
	
	public static void main(String args[]){
		
		PurchaseService ps = new PurchaseServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer name:");
		String name = sc.next();
		System.out.println("Enter Phone No");
		String phoneno = sc.next();
		System.out.println("Enter mail id");
		String mailid = sc.next();
		System.out.println("Enter mobile id :");
		int mobileid = sc.nextInt();
		
		PurchaseDetails pd  = new PurchaseDetails();
		
		pd.setCustName(name);
		pd.setPhoneNo(phoneno);
		pd.setMailId(mailid);
		pd.setMobileid(mobileid);
		int pi= ps.addPurchaseDetails(pd);
		System.out.println("Purchase Details added successfully"+pi);
		
		
		
		
		
	}
}
