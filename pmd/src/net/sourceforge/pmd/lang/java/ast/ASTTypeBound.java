/* Generated By:JJTree: Do not edit this line. ASTTypeBound.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTTypeBound extends AbstractJavaNode {
    public ASTTypeBound(int id) {
        super(id);
    }

    public ASTTypeBound(JavaParser p, int id) {
        super(p, id);
    }


    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}