package org.sang.search.vo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程信息(Course)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
public class CourseVo implements Serializable {
    private static final long serialVersionUID = 742802451509121028L;
    /**
     * 主键
     */
    @Field("id")
    private Long id;
    /**
     * 创建时间
     */
    @Field("gmt_create")
    private Date gmtCreate;
    /**
     * 修改时间
     */
    @Field("gmt_modified")
    private Date gmtModified;
    /**
     * 状态(1:正常，0:禁用)
     */
    @Field("status_id")
    private Integer statusId;
    /**
     * 排序
     */
    @Field("sort")
    private Integer sort;
    /**
     * 讲师用户编码
     */
    @Field("lecturer_user_no")
    private Long lecturerUserNo;
    /**
     * 一级分类ID
     */
    @Field("category_id1")
    private String categoryId1;
    /**
     * 二级分类ID
     */
    @Field("category_id2")
    private String categoryId2;
    /**
     * 三级分类ID
     */
    @Field("category_id3")
    private String categoryId3;
    /**
     * 课程名称
     */
    @Field("course_name")
    private String courseName;
    /**
     * 课程封面
     */
    @Field("course_logo")
    private String courseLogo;
    /**
     * 课程介绍ID
     */
    @Field("introduce_id")
    private Long introduceId;
    /**
     * 是否免费：1免费，0收费
     */
    @Field("is_free")
    private Integer isFree;
    /**
     * 原价
     */
    @Field("course_original")
    private Double courseOriginal;
    /**
     * 优惠价
     */
    @Field("course_discount")
    private Double courseDiscount;
    /**
     * 是否上架(1:上架，0:下架)
     */
    @Field("is_putaway")
    private Integer isPutaway;
    /**
     * 课程排序(前端显示使用)
     */
    @Field("course_sort")
    private Integer courseSort;
    /**
     * 购买人数
     */
    @Field("count_buy")
    private Integer countBuy;
    /**
     * 学习人数
     */
    @Field("count_study")
    private Integer countStudy;
    /**
     * 总课时数
     */
    @Field("period_total")
    private Integer periodTotal;





    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public String getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(String categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public String getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(String categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public String getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(String categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getLecturerUserNo() {
        return lecturerUserNo;
    }

    public void setLecturerUserNo(Long lecturerUserNo) {
        this.lecturerUserNo = lecturerUserNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLogo() {
        return courseLogo;
    }

    public void setCourseLogo(String courseLogo) {
        this.courseLogo = courseLogo;
    }

    public Long getIntroduceId() {
        return introduceId;
    }

    public void setIntroduceId(Long introduceId) {
        this.introduceId = introduceId;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Double getCourseOriginal() {
        return courseOriginal;
    }

    public void setCourseOriginal(Double courseOriginal) {
        this.courseOriginal = courseOriginal;
    }

    public Double getCourseDiscount() {
        return courseDiscount;
    }

    public void setCourseDiscount(Double courseDiscount) {
        this.courseDiscount = courseDiscount;
    }

    public Integer getIsPutaway() {
        return isPutaway;
    }

    public void setIsPutaway(Integer isPutaway) {
        this.isPutaway = isPutaway;
    }

    public Integer getCourseSort() {
        return courseSort;
    }

    public void setCourseSort(Integer courseSort) {
        this.courseSort = courseSort;
    }

    public Integer getCountBuy() {
        return countBuy;
    }

    public void setCountBuy(Integer countBuy) {
        this.countBuy = countBuy;
    }

    public Integer getCountStudy() {
        return countStudy;
    }

    public void setCountStudy(Integer countStudy) {
        this.countStudy = countStudy;
    }

    public Integer getPeriodTotal() {
        return periodTotal;
    }

    public void setPeriodTotal(Integer periodTotal) {
        this.periodTotal = periodTotal;
    }

}
