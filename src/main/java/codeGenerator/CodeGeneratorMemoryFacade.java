package codeGenerator;

public class CodeGeneratorMemoryFacade {
    private Memory memory;

    public CodeGeneratorMemoryFacade(){
        memory = new Memory();
    }

    public void pintCodeBlock() {
        memory.pintCodeBlock();
    }

    public void add3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        memory.add3AddressCode(op, opr1, opr2, opr3);
    }

    public void add3AddressCode(int i, Operation op, Address opr1, Address opr2, Address opr3) {
        memory.add3AddressCode(i, op, opr1, opr2, opr3);
    }

    public int getCurrentCodeBlockAddress() {
        return memory.getCurrentCodeBlockAddress();
    }

    public int getTemp() {
        return memory.getTemp();
    }

    public int saveMemory() {
        return memory.saveMemory();
    }

    public int getDateAddress() {
        int address = memory.getDateAddress();
        memory.updateDateAddress();
        return address;
    }
}
