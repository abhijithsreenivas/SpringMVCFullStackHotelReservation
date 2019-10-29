package com.frankmoley.landon.web.service;

import com.frankmoley.landon.business.domain.RoomReservation;
import com.frankmoley.landon.business.service.ReservationService;
import com.frankmoley.landon.web.application.ReservationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ReservationServiceController {

    @Autowired
    private ReservationService reservationService;

    @RequestMapping(method= RequestMethod.GET, value="/reservations/{date}")
    public List<RoomReservation> getAllReservationForData(@PathVariable (value="date")String dateString){

        return this.reservationService.getRoomReservationsForDate(dateString);

    }
}
