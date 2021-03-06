/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.expression.ArrayStoreExpression;

public class ASTArrayStoreExpression extends AbstractApexNode<ArrayStoreExpression> {

    public ASTArrayStoreExpression(ArrayStoreExpression arrayStoreExpression) {
        super(arrayStoreExpression);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
