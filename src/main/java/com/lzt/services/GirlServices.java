package com.lzt.services;

import com.lzt.dto.GirlRepository;
import com.lzt.entity.Girl;
import com.lzt.model.Result;
import com.lzt.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by lzt on 2018/7/10.
 */
@Service
public class GirlServices {

    @Autowired
    private GirlRepository girlRepository;
    @Value("${cupSize}")
    private String cupSize;

    public List<Girl> getGirls() {
        return girlRepository.findAll();
    }

    @Transactional
    public Result<Girl> saveGirl(Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseUtils.fail(0, bindingResult.getFieldError().getDefaultMessage());
        } else {
            return ResponseUtils.success(girlRepository.save(girl));
        }

    }
}
