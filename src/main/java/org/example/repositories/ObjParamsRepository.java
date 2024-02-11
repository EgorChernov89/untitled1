package org.example.repositories;

import com.example.test.model.ObjParams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjParamsRepository extends JpaRepository<ObjParams,Long> {
}
