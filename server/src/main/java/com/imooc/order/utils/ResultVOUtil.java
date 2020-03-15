package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;

/**
 * @ Author     ：djq.
 * @ Date       ：Created in 12:02 2020/1/3
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
