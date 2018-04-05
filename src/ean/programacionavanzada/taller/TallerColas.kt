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
 * palabras contiene una serie de palabras. Determine cuántas de esas palabras son verbos
 */
fun numVerbos(palabras: IQueue<String>): Int {
    val copia = palabras.copy()
    var c = 0

    while (!copia.isEmpty) {
        val pal = copia.front.toUpperCase()
        if (pal.endsWith("AR") || pal.endsWith("ER") || pal.endsWith("IR")) {
            c = c + 1
        }
        copia.dequeue()
    }
    return c
}

/**
 * Coloca el elemento como el primero en la cola, de forma tal que sea el siguiente a atender
 */
fun <T> meterElementoDePrimero(cola: IQueue<T>, elem: T) {
    TODO("Completar!")
}

/**
 * Obtiene cuál es la palabra mas larga del conjunto de palabras dada.
 */
fun obtenerLaPalabraMásLarga(palabras: IQueue<String>): String {
    TODO("Completar")
}

