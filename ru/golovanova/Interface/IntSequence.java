package ru.golovanova.Interface;

public class IntSequence {

    public int next() {
        return 0;
    }
    public boolean hasNext() {
        return false;
    }

    public static IntSequence of(int... sequence) {
        return new IntSequence() {
            int[] arraySequence = sequence;
            int index = 0;

            @Override
            public int next() {
                return arraySequence[index++];
            }
            @Override
            public boolean hasNext() {
                if (index < arraySequence.length)
                    return true;
                else return false;
            }
        };
    }

    public static IntSequence Constant(int i) {
        return new IntSequence() {
            @Override
            public int next() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3,2,3,4);
        while(sequence.hasNext()) {
            System.out.println(sequence.next());
        }
        IntSequence constant = Constant(11);
        for (int i = 0; i < 10; i++) {
            System.out.println(constant.next());
        }
    }
}
