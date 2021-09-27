val amountMinForCartMM = 300_00
val amountMaxForCartMM = 75_000_00
val amountAfterLimit = 20_00
val precentForMM = 0.6

val amountMinForCartViWo = 35_00
val percentForViWo = 0.75
val errorAmount = "Сумма меньше 35 рублей!"

val maxAmountForCartInDay = 150_000_00
val maxAmountForCartInMounth = 600_000_00

val maxAmountForVkAtOnce = 15_000_00
val errorLimit = "Превышен суточный лимит!"
val maxAmountForVkAtMounth = 40_000_00
val convertToRub = 100


fun main() {
println("${transaction("Mastercart", 150_000_00, 60_000)} rub")
}

fun transaction(cartType: String = "Vk Pay", amountRecently: Int, amount: Int): Comparable<*> {

    return if (amountRecently !in maxAmountForCartInDay..maxAmountForCartInMounth){
        val result = when {
            cartType === "Vk Pay" -> if (amount > maxAmountForVkAtOnce || amountRecently >= maxAmountForVkAtMounth ) errorLimit else amount / convertToRub
            cartType === "Maestro" || cartType === "Mastercard" -> if (amountRecently in amountMinForCartMM..amountMaxForCartMM) amount / convertToRub else
                ((amount / convertToRub) - (((amount / convertToRub) * precentForMM) + amountAfterLimit)) / convertToRub
            cartType === "Visa" || cartType === "Мир" -> if (amount < amountMinForCartViWo) errorAmount else (amount - ((amount / convertToRub) * percentForViWo)) / convertToRub
            else -> -1
        }
        result
    }
    else return "Превышен лимит трансакций."

}