package com.booking.dajavabooking.service;

import com.booking.dajavabooking.entity.Area;
import com.booking.dajavabooking.repository.AreaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;
    public List<Area> getAllListArea() {
        return areaRepository.findAll();
    }
    public Optional<Area> getAreaName(int areaId) {
        return areaRepository.findById(areaId);
    }

}
