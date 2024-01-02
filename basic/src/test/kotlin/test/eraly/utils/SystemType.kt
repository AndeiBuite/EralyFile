package test.eraly.utils

import java.io.Serializable

abstract class SystemType( private val name: String ): Serializable
{
	override fun toString(): String = name

	companion object
	{
		// 当前系统类型
		val current = run {
			val lowercaseName = System.getProperty("os.name").lowercase()
			when{
				lowercaseName.contains("mac")-> MacOS
				lowercaseName.contains("windows")-> Windows
				lowercaseName.contains("linux")-> Linux
				else-> OtherSystem
			}
		}

	}

}

object MacOS: SystemType("MacOS")
{
	private fun readResolve(): Any = MacOS
}

object Windows: SystemType("Windows")
{
	private fun readResolve(): Any = Windows
}
object Linux: SystemType("Linux")
{
	private fun readResolve(): Any = Linux
}
object OtherSystem: SystemType("OtherSystem")
{
	private fun readResolve(): Any = OtherSystem
}