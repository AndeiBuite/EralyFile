package io.github.andeibuite.eraly.basic.utils

import java.lang.System

object SystemUtils
{
	// 当前系统类型
	val currentType = run {
		val lowercaseName = System.getProperty("os.name").lowercase()
		when{
			lowercaseName.contains("mac")-> SystemType.MacOS
			lowercaseName.contains("windows")-> SystemType.Windows
			lowercaseName.contains("linux")-> SystemType.Linux
			else-> SystemType.Others
		}
	}

}

enum class SystemType
{
	MacOS,
	Windows,
	Linux,
	Android,
	IOS,
	Others,
}