package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "users")
public class Users implements Serializable {
  /**
   * ID
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  /**
   * 名前
   */
  @Column(name = "name")
  private String name;
  /**
   * メールアドレス
   */
  @Column(name = "email")
  private String email;
  /**
   * パスワード
   */
  @Column(name = "password")
  private String password;
}