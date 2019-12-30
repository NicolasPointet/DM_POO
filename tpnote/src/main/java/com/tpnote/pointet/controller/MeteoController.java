package com.tpnote.pointet.controller;

import com.tpnote.pointet.model.DarkSkyAPI.Currently;
import com.tpnote.pointet.model.DarkSkyAPI.Weather;
import com.tpnote.pointet.model.GeoAPI.GeoRequest;
import com.tpnote.pointet.model.GeoAPI.Geometry;
import com.tpnote.pointet.model.GeoAPI.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class MeteoController {

    private GeoRequest geoRequest;
    private Weather weather;

    private String apiAddr = "https://api-adresse.data.gouv.fr/search/?q=";
    private String darkApiAddr = "https://api.darksky.net/forecast/032b61dc256584a9f1b4a105d7c755b0/";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/meteo")
    public String postMeteo(@RequestParam("address") String search, Model model) {
        geoRequest = restTemplate.getForObject(apiAddr + search, GeoRequest.class);

        Properties properties = geoRequest.getFeatures().get(0).getProperties();
        Geometry geometry = geoRequest.getFeatures().get(0).getGeometry();

        model.addAttribute("search", search);
        model.addAttribute("label", properties.getLabel());

        List<Double> coords = geometry.getCoordinates();

        String darkAddr = darkApiAddr + coords.get(1) + "," + coords.get(0) + "?units=si&lang=fr";

        weather = restTemplate.getForObject(darkAddr, Weather.class);

        Currently currently = weather.getCurrently();

        model.addAttribute("humidity", currently.getHumidity() * 100);
        model.addAttribute("temperature", currently.getTemperature());
        model.addAttribute("summary", currently.getSummary());

        return "weather";
    }


}
