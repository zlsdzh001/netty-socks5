package cc.xpcas.nettysocks.handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

import java.util.List;

public class BinaryWebSocketFrameDecoder extends MessageToMessageDecoder<BinaryWebSocketFrame> {


    @Override
    protected void decode(ChannelHandlerContext ctx, BinaryWebSocketFrame msg, List<Object> out) throws Exception {
        ByteBuf content = msg.content();
        ByteBuf retain = content.retain();
        out.add(retain);
    }
}
