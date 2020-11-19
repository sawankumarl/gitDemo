package com.sumofdigit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sumofdigit.model.Num;
import com.sumofdigit.service.AddService;

//@RestController ------------------>GET
//public class sumofdigitController
//{
//	@RequestMapping(path="/{value1}/{value2}")
//	public int sumoftwodigit(@PathVariable("value1") int value1, @PathVariable("value2") int value2)
//	{
//		int add=value1+value1;
//		return add;
//	}
//}


@RestController   
@RequestMapping(value="/add")
public class sumofdigitController
{
	 @Autowired
	 private AddService myaddserive;
	 @RequestMapping(value="/hello",method = RequestMethod.POST, consumes="application/json", produces = "application/json")
	    public int getCount(@RequestBody Num request)
	 	{
	        return myaddserive.Addmyvalue(request.getNum1(),request.getNum2());
	    }
}



//@RestController   ----------->Not working ate
//@RequestMapping(value="/add")
//public class sumofdigitController
//{
//	 @Autowired
//	 private AddService myaddserive;
//	@PostMapping(value="/hello/{number1}/{number2}") 
//	public int sumoftwodigit(@PathVariable int num1, @PathVariable int num2)
//	{
//	        return myaddserive.Addmyvalue(request.getNum1(),request.getNum2());
//	}
//}

 