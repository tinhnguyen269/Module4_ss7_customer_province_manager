package com.example.customerprovincemanagement.repository;

import com.example.customerprovincemanagement.model.DTO.IProvinceDTO;
import com.example.customerprovincemanagement.model.Province;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province, Long> {
    @Query(nativeQuery = true, value = "select p.name, count(customer.first_name) as number from customer join customer_province.province p on p.id = customer.province_id group by province_id")
    Iterable<IProvinceDTO> getAllProvince();
}
