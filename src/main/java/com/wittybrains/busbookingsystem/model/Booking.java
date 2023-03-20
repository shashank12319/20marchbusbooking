package com.wittybrains.busbookingsystem.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//
//@Entity
//@Table(name = "booking")
//public class Booking {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long bookingId;
//	private LocalDate dateOfBooking;
//	@OneToOne
//	private TravelSchedule schedule;
//	
//    
//    @ManyToOne
//	private User user;
//	private Double totalAmount;
//	private String seatStatus;
//
//	public Long getBookingId() {
//		return bookingId;
//	}
//
//	public void setBookingId(Long bookingId) {
//		this.bookingId = bookingId;
//	}
//
//	public LocalDate getDateOfBooking() {
//		return dateOfBooking;
//	}
//
//	public void setDateOfBooking(LocalDate dateOfBooking) {
//		this.dateOfBooking = dateOfBooking;
//	}
//
//	public TravelSchedule getSchedule() {
//		return schedule;
//	}
//
//	public void setSchedule(TravelSchedule schedule) {
//		this.schedule = schedule;
//	}
//
//	public Double getTotalAmount() {
//		return totalAmount;
//	}
//
//	public void setTotalAmount(Double totalAmount) {
//		this.totalAmount = totalAmount;
//	}
//
//	public LocalDate getDate() {
//		return this.dateOfBooking;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//
//
//	public String getSeatStatus() {
//		return seatStatus;
//	}
//
//	public void setSeatStatus(String seatStatus) {
//		this.seatStatus = seatStatus;
//	}
//
//}




import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.wittybrains.busbookingsystem.dto.BookingDTO;
import com.wittybrains.busbookingsystem.dto.BusDTO;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	private LocalDate dateOfBooking;
	@OneToOne
	private TravelSchedule schedule;

	private Integer numberOfSeats;
	private Double fareAmount;

	@ManyToOne
	private Bus bus;
	private String routeInfo;
//    @ManyToOne
//    private Driver driver;
//
	@ManyToOne
	private User user;
	private Double totalAmount;
	private String bookingStatus;

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(LocalDate dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public TravelSchedule getSchedule() {
		return schedule;
	}

	public void setSchedule(TravelSchedule schedule) {
		this.schedule = schedule;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Double getFareAmount() {
		return fareAmount;
	}

	public void setFareAmount(Double fareAmount) {
		this.fareAmount = fareAmount;
	}

//    public BusDTO getBus() {
//        return bus;
//    }
//
//    public void setBus(BusDTO bus) {
//        this.bus = bus;
//    }

	public String getRouteInfo() {
		return routeInfo;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public void setRouteInfo(String routeInfo) {
		this.routeInfo = routeInfo;
	}

//    public Driver getDriver() {
//        return driver;
//    }
//
//    public void setDriver(Driver driver) {
//        this.driver = driver;
//    }

   

	public Double getTotalAmount() {
		return totalAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public LocalDate getDate() {
		return this.dateOfBooking;
	}

	

}
