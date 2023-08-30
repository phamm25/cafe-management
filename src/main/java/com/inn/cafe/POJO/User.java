package com.inn.cafe.POJO;

import jakarta.persistence.Entity;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "User")
/**
 * class user serializable
 */
public class User implements Serializable {
}
