/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase8.javase8thbatch.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class Validator {

    void validate(Object obj) {
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            //System.out.println("Field "+field);
            Annotation[] annos = field.getDeclaredAnnotations();
            for (Annotation anno : annos) {
                //System.out.println("Anno "+anno);
                if (anno instanceof NullOrEmpty) {
                    NullOrEmpty nullOrEmpty = (NullOrEmpty) anno;
                    //System.out.println("Field "+field.getName()+" have nullorEmpty anno");
                    String value;
                    try {
                        value = (String) (field.get(obj));
                        if (value == null || value == "") {
                            System.out.println("Field " + field.getName() + " " + nullOrEmpty.message());
                        }
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        }
    }

}
