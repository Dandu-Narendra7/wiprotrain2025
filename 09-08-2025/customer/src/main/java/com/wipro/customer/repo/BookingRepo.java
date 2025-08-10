package com.wipro.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.customer.entity.Booking;

@Repository
public interface BookingRepo  extends JpaRepository<Booking, Integer>  {

}
