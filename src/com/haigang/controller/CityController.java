package com.haigang.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.haigang.domain.City;
import com.haigang.service.CityService;


@Controller
@RequestMapping("city")
public class CityController {
	
	@Resource
	CityService cityservice;
	
	//@RequestMapping("/findCity")
	@RequestMapping(value = "/findCity", method = {RequestMethod.POST })  
	public @ResponseBody void findCity( Long id, HttpServletResponse response) throws Exception{
		
		//model.addAttribute(cityservice.findByProvince(id));
		System.out.println(id);
		List<City> list =(List<City>)cityservice.findByProvince(id);
		for(int i=0;i<list .size();i++){
		System.out.println(list .get(i).getCityName());
		}
		/*GsonBuilder b = new GsonBuilder();
		b.registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY);

		Gson gson = b.create();*/
		Gson gson = new Gson();
	    
		
		Type type = new TypeToken<List<City>>(){}.getType();
		
		String s2 = gson.toJson(list,type);  
		 System.out.println(s2);
		 response.setContentType("text/html;charset=UTF-8");
	      response.getWriter().write(s2);
		 /*out.write(s2);
		 out.flush(); 
		
		 out.close(); */

	
	}
	 public Map<Long, List<City>> list2Map(List<City> list) {  
		  
	        Map<Long, List<City>> map = new HashMap<Long, List<City>>();  
	  
	        if ((list != null) && (list.size() != 0)) {  
	            for (City cityList : list) {  
	                // 这一步是关键，也很巧妙吧，哈哈  
	                List<City> testList = map.get(cityList.getId());  
	                if (testList == null) {  
	                    testList = new ArrayList<City>();  
	                }  
	                testList.add(cityList);  
	                map.put(cityList.getId(), testList);  
	            }  
	        }  
	        return map;  
	    }  
	public Map<Long,City> listtomap(List<City> list){
		//List<City> list = new ArrayList<City>();  
		  Map<Long, City> map = new HashMap<Long, City>();  
		  for(City city : list){  
		   if(city==null){  
		    continue;  
		   } else{ 
		   //Student为javabean对象.保存的数据学号,姓名,班级  
		   //以学号作为key.  
		   map.put(city.getId(), city);
		   }
		   }
		return map;
	}

	}
