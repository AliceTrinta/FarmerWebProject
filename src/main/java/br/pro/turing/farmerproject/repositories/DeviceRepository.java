package br.pro.turing.farmerproject.repositories;

import br.pro.turing.farmerproject.domain.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device, String> {
}
