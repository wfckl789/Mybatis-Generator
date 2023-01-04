package com.example.mybatisgenerator.dao;

import com.example.mybatisgenerator.model.ActReProcdef;
import com.example.mybatisgenerator.model.ActReProcdefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActReProcdefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    long countByExample(ActReProcdefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    int deleteByExample(ActReProcdefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    int insert(ActReProcdef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    int insertSelective(ActReProcdef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    List<ActReProcdef> selectByExample(ActReProcdefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    ActReProcdef selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    int updateByExampleSelective(@Param("record") ActReProcdef record, @Param("example") ActReProcdefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    int updateByExample(@Param("record") ActReProcdef record, @Param("example") ActReProcdefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    int updateByPrimaryKeySelective(ActReProcdef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACT_RE_PROCDEF
     *
     * @mbg.generated Wed Jan 04 15:39:59 CST 2023
     */
    int updateByPrimaryKey(ActReProcdef record);
}