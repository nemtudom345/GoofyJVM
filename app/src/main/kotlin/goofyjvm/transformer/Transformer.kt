package goofyjvm.transformer

import goofyjvm.transformer.impl.*
import org.objectweb.asm.tree.ClassNode

open class Transformer {

    companion object {
        val transformers = arrayListOf<Transformer>(VoidTransformer())
    }

    open fun transform(node: ClassNode) {

    }

}