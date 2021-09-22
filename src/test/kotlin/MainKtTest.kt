import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getAmountMinForCartMM() {
        assertEquals(300_00, 300_00)
    }

    @Test
    fun getAmountMaxForCartMM() {
        assertEquals(75_000_00, amountMaxForCartMM)
    }

    @Test
    fun getAmountAfterLimit() {
        assertEquals(20_00, amountAfterLimit)
    }


    @Test
    fun getAmountMinForCartViWo() {
        assertEquals(35_00, amountMinForCartViWo)
    }


    @Test
    fun getErrorAmount() {
        assertEquals("Сумма меньше 35 рублей!", errorAmount)
    }

    @Test
    fun getMaxAmountForCartInDay() {
        assertEquals(150_000_00, maxAmountForCartInDay)
    }

    @Test
    fun getMaxAmountForCartInMounth() {
        assertEquals(600_000_00, maxAmountForCartInMounth)
    }

    @Test
    fun getMaxAmountForVkAtOnce() {
        assertEquals(15_000_00, maxAmountForVkAtOnce)
    }

    @Test
    fun getErrorLimit() {
        assertEquals("Превышен суточный лимит!", errorLimit)
    }

    @Test
    fun getMaxAmountForVkAtMounth() {
        assertEquals(40_000_00, maxAmountForVkAtMounth)
    }

    @Test
    fun getConvertToRub() {
        assertEquals(100, convertToRub)
    }

    @Test
    fun transaction() {
        val cart: String = "Vk Pay"
        val recently: Int = 150_000_00
        val amountTotal: Int = 60_000

        val result = transaction(
            cartType = cart,
            amountRecently = recently,
            amount = amountTotal
        )
        assertEquals("Превышен лимит трансакций.", result)
    }
}