/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo
 */
public class guia1Class {
     private double resultado=0;
    
    
    public double areaDiagonal(double lad1, double lad2){
    double Area=lad1*lad2;
    
 
    return sqrt(pow(lad1,2)+pow(lad2,2));
    }
    
    public double areaRadio(int indicador, double valor){
    
    if (indicador==1){
    return ((2 * Math.PI * valor));
        
        
    }else if(indicador==2){
    
    return ((2 * Math.PI * valor)/2);
    
    }
    return 0;
    
    }
    
    /*
            case 3:
                double elegir=Double.parseDouble(JOptionPane.showInputDialog( "¿Que desea ingresar? \n 1.- Radio \n 2.-Diametro"));
                if (elegir==1){
                  double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio"));
                  double volumnr=(4/3)*Math.PI*(radio*radio*radio);
                  JOptionPane.showMessageDialog(null, "El volumen de la esfera es:" + volumnr);
                }else{
                    double diam=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del diametro")); 
                 double volumnd=(4/3)*Math.PI*((diam*diam*diam)/2);
                 JOptionPane.showMessageDialog(null, "El volumen de la esfera es:" + volumnd); 
                }

             break;
             case 4: 
                 double diagonal= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la diagonal"));
                double volumen= diagonal/Math.sqrt(3);
                volumen=pow(volumen,3);
                JOptionPane.showMessageDialog(null, "El vulumen del cubo es:" + volumen);
                
              break;
            case 5: 
                
            break;
            case 6: JOptionPane.showMessageDialog(null, "Hasta luego");break;
            default: JOptionPane.showMessageDialog(null, "Elija una opcion valida");break;
        } 
        }while(opcion!=6);
    
    
    */
}
