package org.example.repositories;


import org.example.model.Params;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ParamsRepository extends JpaRepository<Params,Long> {
    List<Params> findByObjIdAndTimeBetween(String deviceId, LocalDateTime startDate, LocalDateTime endDate);
}
