package br.pro.turing.farmerproject.services;

import br.pro.turing.farmerproject.domain.Data;
import br.pro.turing.farmerproject.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DataService {

    @Autowired
    DataRepository repository;

    public Data findData(String resource, String device, Date now){
        return repository.findByDeviceNameAndResourceNameAndInstantGreaterThanEqual(device, resource, now);}
}
