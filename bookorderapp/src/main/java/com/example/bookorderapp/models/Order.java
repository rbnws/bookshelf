package com.example.bookorderapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="order")
public class Order {
	@Id
	private String id;
	private Customer customer;
	private List<Book> book_list;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the book_list
	 */
	public List<Book> getBook_list() {
		return book_list;
	}
	/**
	 * @param book_list the book_list to set
	 */
	public void setBook_list(List<Book> book_list) {
		this.book_list = book_list;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", book_list=" + book_list + ", getId()=" + getId()
				+ ", getCustomer()=" + getCustomer() + ", getBook_list()=" + getBook_list() + "]";
	}
	

}
