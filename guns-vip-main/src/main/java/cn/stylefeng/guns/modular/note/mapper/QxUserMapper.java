package cn.stylefeng.guns.modular.note.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import cn.stylefeng.guns.modular.note.entity.QxUser;
import cn.stylefeng.guns.modular.note.model.params.QxUserParam;
import cn.stylefeng.guns.modular.note.model.result.QxUserResult;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-11-14
 */
public interface QxUserMapper extends BaseMapper<QxUser> {

    /**
     * 获取列表
     *
     * @author 
     * @Date 2019-11-14
     */
    List<QxUserResult> customList(@Param("paramCondition") QxUserParam paramCondition);

    /**
     * 获取map列表
     *
     * @author 
     * @Date 2019-11-14
     */
    List<Map<String, Object>> customMapList(@Param("paramCondition") QxUserParam paramCondition);

    /**
     * 获取分页实体列表
     *
     * @author 
     * @Date 2019-11-14
     */
    Page<QxUserResult> customPageList(@Param("page") Page page, @Param("paramCondition") QxUserParam paramCondition);

    /**
     * 获取分页map列表
     *
     * @author 
     * @Date 2019-11-14
     */
    Page<Map<String, Object>> customPageMapList(@Param("page") Page page, @Param("paramCondition") QxUserParam paramCondition);

    /**
     * 通过账号获取用户
     */
    QxUser getByAccount(@Param("account") String account);
}
