package com.atguigu.service.impl;

import com.atguigu.dao.PersonRepository;
import com.atguigu.domain.Person;
import com.atguigu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonRepository personRepository;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    //查询所有
    public List<Person> findAll() {
        //redis的key
        String key = "allperson";
        List<Person> persons =(List<Person>) redisTemplate.boundValueOps(key).get();
        if(persons != null){
            System.out.println("从Redis中获取缓存数据="+persons);
            return persons;
        }
        persons = personRepository.findAll();
        if(persons != null && persons.size()>0){
            System.out.println("从数据库中获取数据存放到Redis缓存="+persons);
            redisTemplate.boundValueOps(key).set(persons);
        }

        return persons;
    }
    @Override
    //按id查询
    public Person findPersonBuId(Integer id){
        return personRepository.getOne(id);
//        return personRepository.findById(id).get();
    }
    //添加信息
    public void savePerson(Person person){
        personRepository.save(person);
    }
    @Override
    //修改信息
    public void updatePerson(Person person){
        personRepository.save(person);
    }

    @Override
    //删除信息
    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }
}
