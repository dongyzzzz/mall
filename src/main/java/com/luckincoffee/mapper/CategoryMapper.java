package com.luckincoffee.mapper;

import com.luckincoffee.pojo.Category;
import com.luckincoffee.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: dyz
 * @Date: 2019/8/27 11:11
 * @Description: 操作分类表接口
 */
@Mapper
public interface CategoryMapper {
    /**
     * 查询所有分类
     * @return 所有分类集合
     */
    @Select("SELECT * FROM t_category ORDER BY id DESC")
    List<Category> findAll();

    /**
     * 添加分类
     */
    void save(Category category);

    /**
     * 根据ID获取分类
     */
    @Select("SELECT * FROM t_category WHERE id=#{id}")
    Category findOne(int id);

    /**
     * 根据分类获取该分类下的所有商品
     */
    @Select("SELECT * FROM t_product WHERE category_id=#{categoryId}")
    List<Product> findByCategoryId(int categoryId);
}
