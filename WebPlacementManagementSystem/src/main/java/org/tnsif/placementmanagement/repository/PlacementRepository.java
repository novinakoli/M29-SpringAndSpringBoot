package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entities.Placement;


//JPA contains all the CURD operations which is required for the Spring boot
public interface PlacementRepository extends JpaRepository<Placement, Integer>{

}