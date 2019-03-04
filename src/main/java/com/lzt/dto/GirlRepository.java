package com.lzt.dto;

import com.lzt.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lzt on 2018/7/10.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
