package com.shsxt.base;

public class AssertUtil {
    
    /**
     * 表达式结果真时判断
     * @parammsg
     */
    public static void isTrue(Boolean expression,String msg){
        if(expression){
            throw new ParamException(msg);
        }   
    }
    public static void isTure(Boolean expression){
        if(expression){
            throw new ParamException("参数异常");
        }
    }   
    /**
     * 参数为空时
     * @paramobject
     * @parammsg
     */
    public static void isNull(Object object,String msg){
        if(object==null){
            throw new ParamException(msg);
        }
    }
    /**
     * 参数不空时
     * @paramobject
     * @parammsg
     */
    public static void notNull(Object object,String msg){
        if(object!=null){
            throw new ParamException(msg);
        }
    }
}