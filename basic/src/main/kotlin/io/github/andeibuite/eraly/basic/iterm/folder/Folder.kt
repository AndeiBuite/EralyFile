package io.github.andeibuite.eraly.basic.iterm.folder

import io.github.andeibuite.eraly.basic.iterm.Iterm

class Folder( path: String = "./" ): Iterm( path )
{

	override val existence: Boolean = TODO("实现判断文件夹是否存在")

	fun getChild(relativePath: String): Iterm
	{
		TODO("Not yet implemented")
	}

	fun getChildrenList(level: UInt): Array<Iterm>
	{
		TODO("Not yet implemented")
	}

}