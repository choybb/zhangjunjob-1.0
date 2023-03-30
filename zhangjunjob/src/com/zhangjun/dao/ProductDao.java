package com.zhangjun.dao;

import java.sql.SQLException;
import java.util.List;

import com.zhangjun.bean.Product;

public interface ProductDao {

	//商品所有商品信息
	public List<Product> list() throws SQLException;
	
}
