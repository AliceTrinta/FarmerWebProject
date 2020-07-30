package br.pro.turing.farmerproject.services;

import br.pro.turing.farmerproject.domain.Device;
import br.pro.turing.farmerproject.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    DeviceRepository repository;

    public List<Device> findAll(){return repository.findAll();}
}
