/**
 * 
 */
package com.veera.springAOP.service;

import com.veera.springAOP.model.Cricle;
import com.veera.springAOP.model.Triangle;

/**
 * @author Veera
 *
 */
public class ShapeService {
	
	private Cricle cricle;
	private Triangle triangle;
	/**
	 * @return the cricle
	 */
	public Cricle getCricle() {
		return cricle;
	}
	/**
	 * @param cricle the cricle to set
	 */
	public void setCricle(Cricle cricle) {
		this.cricle = cricle;
	}
	/**
	 * @return the triangle
	 */
	public Triangle getTriangle() {
		return triangle;
	}
	/**
	 * @param triangle the triangle to set
	 */
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
	

}
