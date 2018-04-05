package ean.programacionavanzada.taller

import ean.collections.LinkedQueue
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TallerColasKtTest {
    @Test
    fun prueba1() {
        var colita = LinkedQueue<String>()

        with (colita) {
            enqueue("casa")
            enqueue("comer")
            enqueue("dormir")
            enqueue("soñar")
            enqueue("solsticio")
        }
        assertEquals(3, numVerbos(colita))
    }
}