package br.com.aula.petsave.design_patterns.factory

import br.com.aula.petsave.design_patterns.singleton.NetworkDriver
import com.google.common.truth.Truth
import org.junit.Test

sealed class Country {
    object Canada: Country()
}

object Spain: Country()
class Greece(val someProperty: String): Country()
data class USA(val someProperty: String): Country()
//class Poland: Country()

class Currency(val code: String)

object CurrencyFactory{
    fun currencyForCountry(country: Country): Currency =
        when (country) {
            is Spain -> Currency("EUR")
            is Greece -> Currency("EUR")
            is USA -> Currency("USD")
            is Country.Canada -> Currency("CAD")
        }
}

class FactoryMethodText{
    @Test
    fun currencyTest() {
        val geedCurrency = CurrencyFactory.currencyForCountry(Greece("")).code

        println("Greek currency: $geedCurrency")

        val usaCurrency = CurrencyFactory.currencyForCountry(USA("")).code

        println("USA currency: $usaCurrency")

        Truth.assertThat(geedCurrency).isSameInstanceAs("EUR")
        Truth.assertThat(usaCurrency).isSameInstanceAs("USD")

    }
}