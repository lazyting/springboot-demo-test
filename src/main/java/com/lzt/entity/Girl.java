package com.lzt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by lzt on 2018/7/10.
 */
@Entity                             //标注为对应数据的表
public class Girl {

    @Id                             //标注为id，主键
    @GeneratedValue                 //设置自增
    private Integer id;

    private String cupSize;

    @Min(value = 18, message = "年龄不能小于18")
    private Integer age;

    @NotNull(message = "金额不能为空")
    private Double money;

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Girl() {
        //必须生成无参构造方法，不然报错
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
