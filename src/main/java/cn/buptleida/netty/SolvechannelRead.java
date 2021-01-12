package cn.buptleida.netty;

import io.netty.channel.ChannelHandlerContext;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2021/1/12 10:20 下午
 */

/**
 * 为解决netty包中的报错而增加的接口
 */
public interface SolvechannelRead {
    public default void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    }

    public default void channelActive(ChannelHandlerContext ctx) throws Exception {

    }

    public default void channelInactive(ChannelHandlerContext ctx) throws Exception {

    }
}
