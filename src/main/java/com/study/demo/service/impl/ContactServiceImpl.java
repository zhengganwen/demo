package com.study.demo.service.impl;

import com.study.demo.domain.Contact;
import com.study.demo.mapper.ContactMapper;
import com.study.demo.service.ContactService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:
 */
@Service
public class ContactServiceImpl implements ContactService {
    @Resource
    private ContactMapper contactMapper;
    @Override
    public List<Contact> findAll() {
        return contactMapper.findAll();
    }
}
