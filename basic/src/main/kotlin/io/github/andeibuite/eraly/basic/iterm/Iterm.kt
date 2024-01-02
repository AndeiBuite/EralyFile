package io.github.andeibuite.eraly.basic.iterm

import io.github.andeibuite.eraly.basic.utils.PathUtils

// This class represents a directory that could be described with a path of hard disk (Even not exist)
// 这个类代表硬盘上的一个目录(允许该目录不真实存在, 满足目录定义即可)
abstract class Iterm( var path: String )
{
	abstract val existence: Boolean
	override fun toString(): String = path

}

