package io.github.andeibuite.eraly.basic.stream.write

import io.github.andeibuite.eraly.basic.stream.write.stream.WriteStream

// 实现该接口即可作为「输出目标」, 接受自程序输出的信息
interface Writeable
{

	// 获取程序输出流 ( 程序 >>> 输出目标 )
	fun getWriteStream(): WriteStream

}