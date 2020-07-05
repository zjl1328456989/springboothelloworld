package com.atguigu.controller;

import com.atguigu.domain.Person;
import com.atguigu.service.PersonService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class PersonController {

    @Resource
    PersonService personService;
    //查询所有信息
    @RequestMapping("/findAll")
    public List<Person> findAll(Model model) {

        return personService.findAll();
    }
    //按照id查询信息
    @RequestMapping("/findePersonById")
    public Person findPersonById(Integer id){
        return personService.findPersonBuId(id);
    }
    //添加信息
    @RequestMapping("/savePerson")
    public void savePerson(Person person){
        personService.savePerson(person);
    }
    //修改信息
    @RequestMapping("/updatePerson")
    public void updatePerson(Person person){
        personService.updatePerson(person);
    }

    //删除信息
    @RequestMapping("/deletdPerson")
    public void deletePerson(Integer id){
        personService.deletePerson(id);
    }

}
