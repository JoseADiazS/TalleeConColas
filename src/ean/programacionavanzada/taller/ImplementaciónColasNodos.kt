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
 * Implementación del TAD Cola (IQueue) utilizando una secuencia de nodos
 * sencillamente encadenados.
 */
open class ColaConNodos<T> : IQueue<T> {

    //--------------------------------------
    // Atributos
    //--------------------------------------
    /**
     * La cabeza de la cola. El primer elemento de la misma.
     */
    private var prim: Node<T>? = null

    /**
     * El último elemento de la cola.
     */
    private var ult: Node<T>? = null

    //-------------------------------------------------
    // Constructor
    //-------------------------------------------------

    /**
     * Crea una cola vacía
     */
    constructor()

    //-------------------------------------------------
    // Métodos
    //-------------------------------------------------.

    override val front: T
        get()  {
            require(!isEmpty)
            return prim!!.info
        }
    override val isEmpty: Boolean
        get() = prim == null

    override fun clear() {
        prim = null
        ult = null

    }

    override fun copy(): IQueue<T> {
        var copia = ColaConNodos<T>()
        var p = prim
        while (p != null) {
            val elem = p.info
            copia.enqueue(elem)
            p = p.next
        }
        return copia
    }

    override fun dequeue(): T {
        require(!isEmpty)
        // Obtener el elemento que está de primero
        val elem = front
        // Hay un solo nodo
        if (prim == ult) {
            prim = null
            ult = null
        }
        else {
            prim = prim!!.next
        }
        return elem
    }

    override fun enqueue(element: T) {
        val nodo = Node<T>(element)
        if (isEmpty) {
            prim = nodo
        }
        else {
            ult!!.next = nodo
        }
        ult = nodo
    }


    //------------------------------------------------------------------------------------------------------------------

    /**
     * Clase Nodo que se utilizará para almacenar la información de los elementos de la cola
     */
    internal class Node<T>(theInfo: T) {
        //-------------------------------------------
        // Atributos
        //-------------------------------------------
        var info: T = theInfo
        var next: Node<T>? = null
    }
}