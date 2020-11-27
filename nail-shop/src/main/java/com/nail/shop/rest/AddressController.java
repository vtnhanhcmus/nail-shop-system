package com.nail.shop.rest;

import com.nail.shop.models.Cities;
import com.nail.shop.models.Countries;
import com.nail.shop.models.Districts;
import com.nail.shop.services.AddressService;
import com.nail.shop.services.CityService;
import com.nail.shop.services.CountryService;
import com.nail.shop.services.DistrictService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("addresses")
@Api(value="Address API", description="Address Api.")
public class AddressController {

    @Autowired
    private CountryService countryService;
    @Autowired
    private CityService cityService;
    @Autowired
    private DistrictService districtService;

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/countries", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Countries> countryList() {
        return countryService.findAll();
    }

    @GetMapping(value = "/{countryId}/cities", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Cities> citiesList(@PathVariable("countryId") Long countryId) {
        return cityService.findByCountry(countryId);
    }

    @GetMapping(value = "/{cityId}/districts", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Districts> districtList(@PathVariable("cityId") Long cityId) {
        return districtService.findByCity(cityId);
    }




}
