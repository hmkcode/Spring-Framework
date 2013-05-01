package com.hmkcode.spring.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hmkcode.spring.mybatis.vo.Person;


public interface Mapper {

  /**
   * Retrieves the List of person 
   * @return person list
   */
  //SQL query using xml "Mapper.xml"
  public List<Person> selectAllPerson();
  
  
    /**
    * Retrieves a person 
    * @param person id
    * @return person
    */
    //SQL query using annotation
    @Select("SELECT * FROM person")
    public List<Person> selectAllPerson2();
  
    /******************************************
    * Retrieves a person 
    * @param person id
    * @return person
    */
    //SQL query using annotation
    @Select("SELECT * FROM person WHERE id = #{id}")
    public Person selectPerson(@Param("id") int id);
  
    /******************************************
    * Insert a person 
    * @param person
    * @return int
    */
    @Insert("INSERT INTO person (name) VALUES (#{name})")
    public int insertPerson(Person person);
}

