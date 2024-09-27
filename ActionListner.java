import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class studentinfo extends Frame implements ActionListener{

    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    
    studentinfo(){

        l1=new Label("Name");
        l2=new Label("Roll Number");
        l3=new Label("Branch");
        t1=new TextField(30);
        t2=new TextField(30);
        t3=new TextField(30);
        b1=new Button("ENTER");
        b2=new Button("CANCEL");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==b1)
        {
            String name=t1.getText();
            String roll=t2.getText();
            String branch=t3.getText();

            try
            {
                //if branch is C.S.E store in CSE.txt
                if(branch.toLowerCase().equals("cse")){

                    FileWriter fw=new FileWriter("CSE.txt",true);
                    BufferedWriter bw=new BufferedWriter(fw);
                    PrintWriter pw=new PrintWriter(bw);
                    pw.println(name);
                    pw.println(roll);
                    pw.println(branch);

                    // Display that record saved locally in box

                    Dialog d=new Dialog(this,"Record Saved",true);
                    d.setLayout(new FlowLayout());
                    Label l=new Label("Record Saved Successfully");
                    d.add(l);
                    d.setSize(400,400);
                    d.setVisible(true);
                    pw.close();
                }

                //if branch is E.C.E store in ECE.txt
                else if(branch.toLowerCase().equals("ece")){

                    FileWriter fw=new FileWriter("ECE.txt",true);
                    BufferedWriter bw=new BufferedWriter(fw);
                    PrintWriter pw=new PrintWriter(bw);
                    pw.println(name);
                    pw.println(roll);
                    pw.println(branch);
                    //display successful
                    //display record saved successfully in dialog box
                    Dialog d=new Dialog(this,"Record Saved",true);
                    d.setLayout(new FlowLayout());
                    Label l=new Label("Record Saved Successfully");
                    d.add(l);
                    d.setSize(300,300);
                    d.setVisible(true);
                    pw.close();
                }


                //if branch is ICT 
                else if(branch.toLowerCase().equals("ict"))
                {
                    FileWriter fw=new FileWriter("ICT.txt",true);
                    BufferedWriter bw=new BufferedWriter(fw);
                    PrintWriter pw=new PrintWriter(bw);
                    pw.println(name);
                    pw.println(roll);
                    pw.println(branch);
                    //display successful
                    //display record saved successfully in dialog box
                    Dialog d=new Dialog(this,"Record Saved",true);
                    d.setLayout(new FlowLayout());
                    Label l=new Label("Record Saved Successfully");
                    d.add(l);
                    d.setSize(400,400);
                    d.setVisible(true);
                    pw.close();
                }

                else{

                    //for displaying invalid branch on the dialog box

                    Dialog d=new Dialog(this,"Invalid Branch");
                    d.setLayout(new FlowLayout());
                    Label l=new Label("Invalid Branch");
                    d.add(l);
                    d.setSize(150,150);
                    d.setVisible(true);

                }
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
        }
        else
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        studentinfo s = new studentinfo();
    }
}