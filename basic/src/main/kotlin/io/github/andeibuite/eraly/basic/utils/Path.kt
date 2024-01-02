package io.github.andeibuite.eraly.basic.utils

import io.github.andeibuite.eraly.basic.metadata.EralyBasicConfig

object PathUtils
{

	// 将路径格式化, Windows 可能用不了
	fun formatPath( path: String ): String
	{
		val result = StringBuilder()
		// 字符穿长度特判
		if (path.length.toUInt() !in 1u.. EralyBasicConfig.Path.maxLength )
			throw IllegalArgumentException("This strings is illegal to be path expression because of length")
		// 粗处理: 第一位字符情况
		val rough: String = when( path[0] ){
			// 当前位置的相对路径, 替换成绝对路径
			'.'-> path.replaceRange(0,1, System.getProperty("user.dir"))
			else-> path
		}
		// 遍历中, 上一次遍历到的字符
		var previous = Char(0)
		// 去除连续斜杠
		rough.forEach {
			// 判断是否为路径的非法字符
			when(it){
				'\\','*','|',Char(0) ->
					throw IllegalArgumentException("Found illegal char inside path expression")
			}
			if ( it != '/' || previous != '/' )
				result.append(it)
			previous = it
		}
		return result.toString()
	}


}
