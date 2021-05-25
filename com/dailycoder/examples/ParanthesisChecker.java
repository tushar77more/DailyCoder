package com.dailycoder.examples;

import java.util.Stack;

public class ParanthesisChecker {

	public static void main(String[] args) {

		String str="{([])}";
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(st.empty()) {
				st.push(ch);
			} else if(ch=='}' && st.peek()=='{') {
				st.pop();
			}else if(ch==')' && st.peek()=='(') {
				st.pop();
			}else if (ch==']' && st.peek()=='[') {
				st.pop();
			}else{
				st.push(ch);
			}
			
		}
		
		if(st.empty()) {
			System.out.println("Given string is well formed");
		}else {
			System.out.println("Given string is not  well formed");
		}

	}

}
