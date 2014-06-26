package io.netty.buffer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PooledByteBufAllocator allocator = PooledByteBufAllocator.DEFAULT;
		allocator.newHeapBuffer(45,Integer.MAX_VALUE);
//		buffer.writeByte(2);
	}

}
