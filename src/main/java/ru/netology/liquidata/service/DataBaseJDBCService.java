package ru.netology.liquidata.service;

import org.springframework.stereotype.Service;
import ru.netology.liquidata.repository.DataBaseJDBCRepository;

@Service
public class DataBaseJDBCService {

    private DataBaseJDBCRepository dataBaseJDBCRepository;

    public DataBaseJDBCService(DataBaseJDBCRepository dataBaseJDBCRepository) {
        this.dataBaseJDBCRepository = dataBaseJDBCRepository;
    }

    public String getProductName(String name) {
        return dataBaseJDBCRepository.getProductName(name);
    }
}
