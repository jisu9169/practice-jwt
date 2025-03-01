package com.sparta.springauth;


import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

  @Autowired
  @Qualifier("pizza")
  Food food;

  @Test
  @DisplayName("primary 와 Qualifier 우선 순위 확인")
  void test1(){
    food.eat();
  }
}
