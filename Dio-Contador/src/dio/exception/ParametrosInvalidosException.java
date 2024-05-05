/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package dio.exception;

/**
 *
 * @author Anderson
 */
public class ParametrosInvalidosException  extends Exception{

    /**
     * Creates a new instance of <code>ParametrosInvalidosException</code>
     * without detail message.
     */
    public ParametrosInvalidosException() {
    }

    /**
     * Constructs an instance of <code>ParametrosInvalidosException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ParametrosInvalidosException(String msg) {
        super(msg);
    }
}
