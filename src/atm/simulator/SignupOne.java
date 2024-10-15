
package atm.simulator;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{

    long random;
    JTextField nameTextField , fnameTextField ,emailTextField, addressTextField, cityTextField,stateTextField,pincodeTextField,dobTextField; 
    JRadioButton male ,female ,married,unmarried;
    JButton next;
    JDateChooser dateChooser;
    SignupOne()
    {
        setLayout(null);
        Random ran = new Random();
      random =Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO."+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
                
         JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        
        JLabel name = new JLabel("NAME :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,20);
        add(name);
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(260, 135, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel(" surname :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,185,200,20);
        add(fname);
        
          fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(260, 185, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,220,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
       dateChooser.setBounds(260,225,400,30);
       add(dateChooser);
       
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,260,200,30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(260, 263, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
         female=new JRadioButton("Female");
        female.setBounds(360, 263, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);    
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
         JLabel email = new JLabel("Email :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,310,200,30);
        add(email);
        
         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(260, 313, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status :");
       marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,360,200,30);
        add(marital);
        
          married=new JRadioButton("Married");
       married.setBounds(260, 360, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(360, 360, 120, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);    
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);       
        
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,410,200,30);
        add(address);
        
        
        
         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(260, 410, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,460,200,30);
        add(city);
        
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
       cityTextField.setBounds(260, 460, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State :");
       state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,510,200,30);
        add(state);
        
          stateTextField = new JTextField();
       stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(260, 515, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pincode :");
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
     pincode.setBounds(100,560,200,30);
        add(pincode);
        
         pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(260, 565, 400, 30);
        add(pincodeTextField);
        
       next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(580,600,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800,800);
        setLocation(350,10);
        setVisible(true);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String formno =""+ random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        }
        else if (female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        }
        else if (unmarried.isSelected()){
            marital = "Unmarried";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
         String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        try{
            if (name.equals("")){
              JOptionPane.showMessageDialog(null,"Name is Required");
            }else{
                Conn c =  new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new Signup2(formno).setVisible(true);
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        
         
    }
   
    public static void main(String args[]) 
    {
            new SignupOne().setVisible(true);
         
    }
}
