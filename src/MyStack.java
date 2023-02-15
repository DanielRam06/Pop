public class MyStack {
    private int Max; // tamaño máximo del arreglo
    private char[] stack; // arreglo de caracteres
    private int top; // índice de la posición disponible
    
    // constructor de la clase MyStack
    public MyStack(int size) {
        Max = size;
        stack = new char[Max];
        top = 0;
    }
    
    // método para extraer el valor de la cima de la pila
    public char pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return '#'; // devuelve '#' si la pila está vacía
        } else {
            // guardar el valor de la cima en una variable temporal
            char value = stack[top-1];
            
            // actualizar el índice de la posición disponible
            top--;
            
            // devolver el valor de la cima
            return value;
        }
    }
    
    // método para agregar un valor a la pila
    public void push(char value) {
        if (top == Max) {
            System.out.println("Stack is full");
            return;
        } else {
            stack[top] = value;
            top++;
        }
    }
}