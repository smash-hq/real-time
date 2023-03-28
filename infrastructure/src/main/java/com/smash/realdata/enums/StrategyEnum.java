package com.smash.realdata.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Created: smash_hq at 2023/3/28 16:46
 * @Description: 数据处理手段枚举
 */
@Getter
@AllArgsConstructor
public enum StrategyEnum {
    FILTER,FILLING,MASK,UNION,JOIN;
}
