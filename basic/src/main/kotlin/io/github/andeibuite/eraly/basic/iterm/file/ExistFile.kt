package io.github.andeibuite.eraly.basic.iterm.file

import io.github.andeibuite.eraly.basic.stream.read.Readable
import io.github.andeibuite.eraly.basic.stream.read.stream.ReadStream
import io.github.andeibuite.eraly.basic.stream.write.Writeable
import io.github.andeibuite.eraly.basic.stream.write.stream.WriteStream

class ExistFile( path: String ): File( path ), Readable, Writeable
{
	override val existence: Boolean = true

	override fun getReadStream(): ReadStream
	{
		TODO("Not yet implemented")
	}

	override fun getWriteStream(): WriteStream
	{
		TODO("Not yet implemented")
	}
}