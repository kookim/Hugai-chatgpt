package com.hugai.modules.system.entity.convert;

import com.hugai.modules.system.entity.dto.SysUserDTO;
import com.hugai.modules.system.entity.model.SysUserModel;
import com.hugai.modules.system.entity.vo.auth.RegisterBody;
import com.org.bebas.core.model.convert.BaseConvert;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author wuhao
 * @date 2022/10/13 14:18
 */
@Mapper(builder = @Builder(disableBuilder = true))
public interface SysUserConvert extends BaseConvert<SysUserModel, SysUserDTO> {

    SysUserConvert INSTANCE = Mappers.getMapper(SysUserConvert.class);

    /**
     * 注册实体转换userDto
     *
     * @param register
     * @return
     */
    SysUserDTO convertToRegister(RegisterBody register);

}
