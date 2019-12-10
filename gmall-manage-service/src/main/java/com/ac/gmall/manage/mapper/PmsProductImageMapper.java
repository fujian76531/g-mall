package com.ac.gmall.manage.mapper;

import entity.PmsProductImage;
import entity.PmsProductImageCriteria;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PmsProductImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int countByExample(PmsProductImageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int deleteByExample(PmsProductImageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int insert(PmsProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int insertSelective(PmsProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    List<PmsProductImage> selectByExampleWithRowbounds(PmsProductImageCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    List<PmsProductImage> selectByExample(PmsProductImageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    PmsProductImage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") PmsProductImage record, @Param("example") PmsProductImageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int updateByExample(@Param("record") PmsProductImage record, @Param("example") PmsProductImageCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int updateByPrimaryKeySelective(PmsProductImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pms_product_image
     *
     * @mbggenerated Wed Dec 04 13:33:25 CST 2019
     */
    int updateByPrimaryKey(PmsProductImage record);
}