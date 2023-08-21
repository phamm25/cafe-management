package com.inn.cafe.POJO;

import jakarta.persistence.Entity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;

@Entity
@DynamicUpdate
@DynamicInsert
public class User {
}
