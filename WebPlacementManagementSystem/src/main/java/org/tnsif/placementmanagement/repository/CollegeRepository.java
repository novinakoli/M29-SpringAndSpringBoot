package org.tnsif.placementmanagement.repository;
/*JPA repository is an interface which contains all the

 * JPA CRUD operations which is required for Spring boot*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entities.*;

public interface CollegeRepository extends JpaRepository<College,Integer> {

}