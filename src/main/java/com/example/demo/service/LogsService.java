package com.example.demo.service;

import com.example.demo.entity.Logs;
import com.example.demo.mapper.LogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogsService {
    @Autowired
    private LogsMapper logsMapper;
    public int insert(Logs record){
        return logsMapper.insert(record);
    }
}
