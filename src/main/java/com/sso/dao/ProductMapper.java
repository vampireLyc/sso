package com.sso.dao;

import com.sso.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Lyc on 2017/10/31.
 */
@Mapper
public interface ProductMapper {
    Product select(@Param("id") Long id);
    void update(Product product);
}
