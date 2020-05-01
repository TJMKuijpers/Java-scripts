package com.company;

public class StackClass {
    int stack[]= new int[5];
    int top=0;
    public void push(int data){
        stack[top]=data;
        top++;
    }
    public int pop(){
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public void peek(){
        int data;
        data=stack[top-1];
        System.out.println("The last value is "+data);
    }
    public void show(){
        for(int n: stack){
            System.out.print(n+" ");
            System.out.println();
        }
    }
}
