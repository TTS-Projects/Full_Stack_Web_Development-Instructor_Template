package com.tts.WeatherApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;
    
    public Response getForecast(String zipCode) {
    	//sample Url: http://api.openweathermap.org/data/2.5/forecast?id=524901&appid=acb225c42ebbee699320e5360db92f13
    	String url = "http://api.openweathermap.org/data/2.5/forecast?id=524901&appid=acb225c42ebbee699320e5360db92f13";
    	//String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + 
        //    zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        Response resp = restTemplate.getForObject(url, Response.class);
        System.out.println("resp = " + resp.toString());
        return resp;
    }
}