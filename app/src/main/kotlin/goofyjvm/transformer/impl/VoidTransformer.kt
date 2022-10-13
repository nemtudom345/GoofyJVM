package goofyjvm.transformer.impl

import goofyjvm.transformer.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode

class VoidTransformer : Transformer() {

    override fun transform(node: ClassNode) {
        if (node.name == "java/lang/Void") {
            node.access = node.access xor Opcodes.ACC_FINAL
        }
    }

}