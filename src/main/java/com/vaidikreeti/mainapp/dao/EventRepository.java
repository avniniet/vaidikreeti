/**
 * 
 */
package com.vaidikreeti.mainapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaidikreeti.mainapp.entity.Event;

/**
 * @author prostriker23
 * @since initial development
 * @version 1.0
 */
public interface EventRepository extends JpaRepository<Event, Integer> {

}