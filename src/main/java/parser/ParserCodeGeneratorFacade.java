package parser;

import codeGenerator.CodeGenerator;
import scanner.token.Token;

public class ParserCodeGeneratorFacade {
    private CodeGenerator cg;

    public ParserCodeGeneratorFacade() {
        cg = new CodeGenerator();
    }

    public void printMemory() {
        cg.printMemory();
    }

    public void semanticFunction(int func, Token next) {
        cg.semanticFunction(func, next);
    }
}
