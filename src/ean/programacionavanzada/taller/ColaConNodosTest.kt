package ean.programacionavanzada.taller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ColaConNodosTest {
    @Test
    fun pruebaColas1() {
        var c = ColaConNodos<Int>()
        c.enqueue(7)
        c.enqueue(8)
        c.enqueue(11)

        while (!c.isEmpty) {
            val elem = c.front
            println(elem)
            c.dequeue()
        }
    }
}