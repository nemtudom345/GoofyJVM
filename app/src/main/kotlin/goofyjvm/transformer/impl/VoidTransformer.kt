package goofyjvm.transformer.impl

import goofyjvm.transformer.Transformer
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

class VoidTransformer : Transformer() {

    override fun transform(node: ClassNode) {
        if (node.name == "java/lang/Void") {
            node.access = node.access xor Opcodes.ACC_FINAL

            val ctor = MethodNode()
            ctor.name = "<init>"
            ctor.access = Opcodes.ACC_PUBLIC
            ctor.desc = "()V"
            node.methods.add(ctor)
        }
    }

}