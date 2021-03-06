package com.sh.services;

import com.sh.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Mr SJL on 2016/10/27.
 */
@Component("tt")
public class CustomerService
{
    @Autowired
    CustomerDao customerDao;

    @Override
    public String toString() {
        return "CustomerService [customerDAO=" + customerDao + "]";
    }
}
