public class architecture {
    public static void main(String[] args) {

        /*
                  compiler                     interpreter
            .java ---------> .class(byte code) -----------> machine code

            .java file is the original source code
            JVM is needed to run byte code (platform independent).


            JDK -> JRE + dev tools
            JRE -> JVM + Library classes
            JVM -> JIT


            JDK provides environment to develop and run Java programs
            JDK includes a compiler (javac).
            interpreter and loader is also present in JDK.

            JRE provides environment to run the program.
            Consists of JVM, deployment tech., libraries etc.

            At compile time .java file is converted into byte code.
            Process after compilation takes place during runtime.

            JVM interprets byte code line by line.
            JIT provides direct machine code of methods that are used again and again. No re-interpretation
            JVM contains Stack and Heap memory allocation.

            Working of JVM:-
                Class Loader:
                Class loader loads classes needed for execution of program.
                reads .class file and generate binary data.
                Object of this class is created in Heap.

                Linking:
                JVM verifies .class file.
                Allocate memory for class variables
                Replace symbolic references from the type with direct references.

                Initialization:
                Static variables are assigned with values defined in code.





        */

    }
}
