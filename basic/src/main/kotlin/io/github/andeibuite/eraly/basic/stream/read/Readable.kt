package io.github.andeibuite.eraly.basic.stream.read

import io.github.andeibuite.eraly.basic.stream.read.stream.ReadStream

// 实现该接口即可作为「输入源」以向程序输入信息
interface Readable
{
	// 获取程序输入流 ( 输入源 >>> 程序 )
	fun getReadStream(): ReadStream

}