package com.lsang.common.utils;

/**
 * 处理并记录日志文件
 * 
 * @author lsang
 */
public class LogUtils
{
    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
