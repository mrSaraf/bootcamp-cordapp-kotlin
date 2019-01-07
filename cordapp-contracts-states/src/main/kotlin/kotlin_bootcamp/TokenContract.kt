package kotlin_bootcamp

import net.corda.core.contracts.*

/* Our contract, governing how our state will evolve over time.
 */
class TokenContract  {

    companion object {
        const val ID = "kotlin_bootcamp.TokenContract"
    }

    interface Commands : CommandData {
        class Issue : Commands
    }

}