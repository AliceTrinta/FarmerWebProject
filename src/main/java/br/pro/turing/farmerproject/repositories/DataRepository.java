package br.pro.turing.farmerproject.repositories;

import br.pro.turing.farmerproject.domain.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDateTime;
import java.util.Date;

public interface DataRepository extends MongoRepository<Data, String> {
    Data findByDeviceNameAndResourceNameAndInstantGreaterThanEqual(String device, String resource, Date now);
}
