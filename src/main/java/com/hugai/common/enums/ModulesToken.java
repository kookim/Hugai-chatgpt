package com.hugai.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author WuHao
 * @since 2023/5/31 15:27
 */
@Getter
@AllArgsConstructor
public enum ModulesToken {

    DEFAULT(1024,4000),

    DRAW(1024,1024),

    CHAT(512,4000),

    SQL(512,4000),

    TEXT(2048,4000),

    ;

    /**
     * 单次请求上限
     */
    private final int once;
    /**
     * 上下文最大的token数量（多轮对话）
     */
    private final int contextMax;

}
