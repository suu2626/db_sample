package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private UserRepository userRepository;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<Users> searchAll() {
    return userRepository.findAll();
  }
  
  /**
   * ユーザー情報 主キー検索
   * @return 検索結果
   */
  public Users findById(Long id) {
    return userRepository.findById(id).get();
  }

  /**
   * ユーザー情報 新規登録
   * @param user ユーザー情報
   */
  public void create(UserRequest userRequest) {
    Users users = new Users();
    users.setName(userRequest.getName());
    users.setEmail(userRequest.getEmail());
    users.setPassword(userRequest.getPassword());
    userRepository.save(users);
  }
}