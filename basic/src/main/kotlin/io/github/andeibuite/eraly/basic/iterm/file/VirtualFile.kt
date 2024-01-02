package io.github.andeibuite.eraly.basic.iterm.file

class VirtualFile( path: String = "./" ): File( path )
{
	override val existence: Boolean = false
}