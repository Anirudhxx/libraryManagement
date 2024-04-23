package com.example.librarymanagement.service;

import com.example.librarymanagement.entity.Rental;
import com.example.librarymanagement.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    public Rental getRentalById(Long id) {
        return rentalRepository.findById(id).orElse(null);
    }

    public Rental createRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public Rental updateRental(Long id, Rental rental) {
        if (!rentalRepository.existsById(id)) {
            return null;
        }
        rental.setId(id);
        return rentalRepository.save(rental);
    }

    public boolean deleteRental(Long id) {
        if (!rentalRepository.existsById(id)) {
            return false;
        }
        rentalRepository.deleteById(id);
        return true;
    }
}
