package com.greenplatform.dao.owerMapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OwerTGreenNlHzMapper {
    List selectTGreenNlHzRank(Map params);
    List selectTGreenNlHz(Map params);
}