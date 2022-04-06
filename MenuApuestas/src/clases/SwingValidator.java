
package clases;

import javax.swing.*;
import javax.swing.text.JTextComponent;
public class SwingValidator {
    public boolean isPresent(JTextComponent c, String fieldName){
	if (c.getText().length() == 0) {
		showMessage(c, fieldName + " es un campo requerido.");
		c.requestFocusInWindow();
                    return false;
	    }
	return true;
    }
    public boolean isPassword(JPasswordField c, String fieldName){
        String s = new String(c.getPassword());
	if (s.length() == 0) {
		showMessage(c, fieldName + " es un campo requerido.");
		c.requestFocusInWindow();
                    return false;
	    }
	return true;
    }
    public boolean isInteger(JTextComponent c, String fieldName){
	try{
		int i = Integer.parseInt(c.getText());
		return true;
            } catch (NumberFormatException e){
		showMessage(c, fieldName + " debe ser entero.");
		c.requestFocusInWindow() ;
		return false;
            }
    }
    public boolean isgrather0(JTextComponent c, String fieldName){
            if(Integer.parseInt(c.getText())>0) return true;
            showMessage(c, fieldName + " debe ser mayor que 0.");
            c.requestFocusInWindow() ;
            return false;
        }
        
        
    public boolean isDouble(JTextComponent c, String fieldName) {
	try{
		double d = Double.parseDouble(c.getText());
		return true;
	} catch (NumberFormatException e){
		showMessage(c, fieldName + " debe ser un número válido.");
		c.requestFocusInWindow() ;
		return false;
	}
    }
    private void showMessage(JTextComponent c, String message){
	JOptionPane.showMessageDialog(c, message, "Dato no válido", JOptionPane.ERROR_MESSAGE);
    }
}
