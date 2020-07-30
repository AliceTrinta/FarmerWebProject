package br.pro.turing.farmerproject.resources;

import br.pro.turing.farmerproject.domain.Data;
import br.pro.turing.farmerproject.domain.Device;
import br.pro.turing.farmerproject.dto.DataDTO;
import br.pro.turing.farmerproject.dto.DeviceDTO;
import br.pro.turing.farmerproject.resources.useful.URL;
import br.pro.turing.farmerproject.services.DataService;
import br.pro.turing.farmerproject.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;

import static java.time.ZoneId.systemDefault;

@RestController
@RequestMapping(value = "/devices")
public class DeviceResource {

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private DataService dataService;

    @GetMapping
    public ResponseEntity<List<DeviceDTO>> findAll(){
        List<Device> list = deviceService.findAll();
        List<DeviceDTO> listDto = list.stream().map(x -> new DeviceDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/data")
    public ResponseEntity<Data> findData(@RequestParam(value = "device", defaultValue = "") String name,
                                            @RequestParam(value = "resource", defaultValue = "") String resource) {
        Date instant = new Date();
        System.out.println(instant);
        System.out.println(name);
        System.out.println(resource);
        Data data = dataService.findData(name, resource, instant);
        return ResponseEntity.ok().body(data);
    }
}
