package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Product;

@Controller
public class ExampleController {
	
	@GetMapping("/example") //url -> localhost:8080/example
	public String exampleController() 
	{
		System.out.println("Example kontrolieris nostradaja");
		return "example-page";//tiks paradita lapa example-page.html
	}
	
	// 1. kontrolieru funkcija, kas padod zinu no java html failam
	@GetMapping("/example1") //url -> localhost:8080/example
	public String getExample1Controller(Model model) 
	{
		//1.arguments - iekseja objekta nosaukums
		//2.arguments - ir iekseja objekta vertiba
		//String msg = "Data from SPRING JAVA side"
		//1.argument - msg
		//2.arguments - "Data form SPRING JAVA side" 
		model.addAttribute("msg", "Data form SPRING JAVA side");
		System.out.println("Example1 kontroleiris nostradaja");
		return "example1-page"; // tiks pparadita lapa example1-page.html
	}
	
	@GetMapping("/product/showOneProduct") //loaclhost:8080/product.shoeOneProduc
	public String getShowOneProduct(Model model) {
		Product prodObj = new Product("Gramata", 9.99f, "Zvaigzne", (short) 5);
		
		model.addAttribute("innerObj", prodObj);
		return "product-show-one-page";//tiks paradita lapa product-show-one-page.html
		
		
	}

}
