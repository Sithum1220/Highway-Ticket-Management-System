package lk.ijse.microservice.vehicleservice.controller;

import lk.ijse.microservice.vehicleservice.dto.VehicleDTO;
import lk.ijse.microservice.vehicleservice.entity.Vehicle;
import lk.ijse.microservice.vehicleservice.service.VehicleService;
import lk.ijse.microservice.vehicleservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public ResponseUtil save(@RequestBody VehicleDTO vehicle) {
        vehicleService.saveVehicle(vehicle);
        return new ResponseUtil("200","SuccessFully saved vehicle",null);
    }

    @GetMapping
    public ResponseUtil getAll() {
        return new ResponseUtil("200","Successfully fetch all vehicles",vehicleService.getAllVehicles());
    }

}
