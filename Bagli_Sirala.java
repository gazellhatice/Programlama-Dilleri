package Bagli_Sirala;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Node {
    int data;
    int address;
    
    Node(int data, int address){
        this.data = data;
        this.address = address;
    }
}
public class Bagli_Sirala {
    public static void main(String[] args) throws FileNotFoundException {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Dosya adini giriniz: ");
         String fileName = scanner.nextLine();
         
         File file = new File(fileName);
         Scanner fileScanner = new Scanner(file);
         
         Node[] nodes = new Node[0];
         int index = 0;
         
         System.out.println("Ilk Hali");
         while(fileScanner.hasNextLine()){
             int data = Integer.parseInt(fileScanner.nextLine());
             if(index >= nodes.length){
                 Node[] newNodes = new Node[nodes.length + 1];
                 System.arraycopy(nodes, 0, newNodes,0, nodes.length);
                 nodes = newNodes;
             }
             nodes[index] = new Node(data, index);
             System.out.println(" Data: " + nodes[index].data + ", Address: " + nodes[index].address);
             index++;
        } 
         for(int i = 0; i < nodes.length - 1; i++){
             for(int j = 0; j < nodes.length - i - 1; j++){
                 if(nodes[j].data > nodes[j + 1].data){
                     Node temp = nodes[j];
                     nodes[j] = nodes[j + 1];
                     nodes[j + 1] = temp;
                 }
             }
         }
         System.out.println("Son Hali");
         for(Node node : nodes){
             System.out.println(" Data: " + node.data + ", Address: " + node.address);
         }
     }
}
