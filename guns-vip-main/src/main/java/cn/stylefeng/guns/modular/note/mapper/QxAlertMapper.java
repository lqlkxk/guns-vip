package cn.stylefeng.guns.modular.note.mapper;

import cn.stylefeng.guns.modular.note.entity.QxAlert;
import cn.stylefeng.guns.modular.note.model.params.QxAlertParam;
import cn.stylefeng.guns.modular.note.model.result.QxAlertResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 约单报警记录 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-11-18
 */
public interface QxAlertMapper extends BaseMapper<QxAlert> {

    /**
     * 获取列表
     *
     * @author 
     * @Date 2019-11-18
     */
    List<QxAlertResult> customList(@Param("paramCondition") QxAlertParam paramCondition);

    /**
     * 获取map列表
     *
     * @author 
     * @Date 2019-11-18
     */
    List<Map<String, Object>> customMapList(@Param("paramCondition") QxAlertParam paramCondition);

    /**
     * 获取分页实体列表
     *
     * @author 
     * @Date 2019-11-18
     */
    Page<QxAlertResult> customPageList(@Param("page") Page page, @Param("paramCondition") QxAlertParam paramCondition);

    /**
     * 获取分页map列表
     *
     * @author 
     * @Date 2019-11-18
     */
    Page<Map<String, Object>> customPageMapList(@Param("page") Page page, @Param("paramCondition") QxAlertParam paramCondition);

}
