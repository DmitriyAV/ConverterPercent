import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun transactionVk() {
        val cart: String = "Vk Pay"
        val recently: Int = 15_000_00
        val amountTotal: Int = 6000_00

        val result = transaction(
            cartType = cart,
            amountRecently = recently,
            amount = amountTotal
        )
        assertEquals(6000, result)
    }

    @Test
    fun transactionMastercard() {
        val cart: String = "Mastercard"
        val recently: Int = 15_000_00
        val amountTotal: Int = 299_00

        val result = transaction(
            cartType = cart,
            amountRecently = recently,
            amount = amountTotal
        )
        assertEquals(299, result)
    }
    @Test
    fun transactionMaestro() {
        val cart: String = "Maestro"
        val recently: Int = 75_00_00
        val amountTotal: Int = 299_00

        val result = transaction(
            cartType = cart,
            amountRecently = recently,
            amount = amountTotal
        )
        assertEquals(299, result)
    }

    @Test
    fun transactionVisa() {
        val cart: String = "Visa"
        val recently: Int = 15_000_00
        val amountTotal: Int = 6000_00

        val result = transaction(
            cartType = cart,
            amountRecently = recently,
            amount = amountTotal
        )
        assertEquals(5955.0, result)
    }
}