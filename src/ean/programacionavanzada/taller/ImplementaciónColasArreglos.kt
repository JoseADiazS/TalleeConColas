/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 * <p>
 * Proyecto EAN Taller de Colas
 * Autor: Universidad EAN - Marzo 23 de 2018
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package ean.programacionavanzada.taller

import ean.collections.IQueue

/**
 * Implementación del tipo abstracto de datos Colas, especificado en la interface IQueue
 * Esta implementación utiliza un arreglo o vector estático para almacenar la información
 * respectiva
 */
open class ColaConArreglosCirculares<T> : IQueue<T> {
    //---------------------------------------------------------
    // Constantes
    //---------------------------------------------------------
    /**
     * Tamaño inicial del arreglo circular
     */
    private val CAPACIDAD_MAXIMA = 100

    //--------------------------------------
    // Atributos
    //--------------------------------------

    /**
     * Arreglo circular para los elementos de la cola
     */
    private var arreglo: Array<T?> = kotlin.arrayOfNulls<Any?>(CAPACIDAD_MAXIMA) as Array<T?>

    /**
     * El indice del elemento que se encuentra en el tope de la pila
     */
    private var inicio: Int = 0

    /**
     * Posición donde se encuentra el elemento en la cola de la cola
     */
    private var fin: Int = 0

    /**
     * Número total de datos en el arreglo
     */
    private var tam: Int = 0

    //---------------------------------------------
    // Constructor
    //---------------------------------------------

    /**
     * Crea una cola vacía
     */
    constructor()

    override val front: T
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val isEmpty: Boolean
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun clear() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun copy(): IQueue<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dequeue(): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun enqueue(element: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
