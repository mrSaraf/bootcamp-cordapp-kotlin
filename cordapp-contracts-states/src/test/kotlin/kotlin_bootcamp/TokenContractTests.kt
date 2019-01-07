package kotlin_bootcamp

import net.corda.core.contracts.Contract
import net.corda.core.identity.CordaX500Name
import net.corda.testing.contracts.DummyState
import net.corda.testing.core.DummyCommandData
import net.corda.testing.core.TestIdentity
import net.corda.testing.node.MockServices
import net.corda.testing.node.ledger
import org.junit.Test

class TokenContractTests {
//    private val alice = TestIdentity(CordaX500Name("Alice", "", "GB"))
//    private val bob = TestIdentity(CordaX500Name("Bob", "", "GB"))
//    private val ledgerServices = MockServices(TestIdentity(CordaX500Name("TestId", "", "GB")))
//    private val tokenState = TokenState(alice.party, bob.party, 1)
//
//    @Test
//    fun tokenContractImplementsContract() {
//        assert((TokenContract() is Contract))
//    }
//    @Test
//    fun tokenContractRequiresZeroInputsInTheTransaction() {
//        ledgerServices.ledger {
//            transaction {
//                // Has an input, will fail.
//                input(TokenContract.ID, tokenState)
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                fails()
//            }
//            transaction{
//                // Has no input, will verify.
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                verifies()
//            }
//        }
//    }
//    @Test
//    fun tokenContractRequiresOneOutputInTheTransaction() {
//        ledgerServices.ledger {
//            transaction {
//                // Has two outputs, will fail.
//                output(TokenContract.ID, tokenState)
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                fails()
//            }
//            transaction {
//                // Has one output, will verify.
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                verifies()
//            }
//        }
//    }
//    @Test
//    fun tokenContractRequiresOneCommandInTheTransaction() {
//
//        ledgerServices.ledger {
//            transaction {
//                output(TokenContract.ID, tokenState)
//                // Has two commands, will fail.
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                fails()
//            }
//            transaction {
//                output(TokenContract.ID, tokenState)
//                // Has one command, will verify.
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                verifies()
//            }
//        }
//    }
//    @Test
//    fun tokenContractRequiresTheTransactionsOutputToBeATokenState() {
//        ledgerServices.ledger {
//            transaction {
//                // Has wrong output type, will fail.
//                output(TokenContract.ID, DummyState())
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                fails()
//            }
//            transaction {
//                // Has correct output type, will verify.
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                verifies()
//            }
//        }
//    }
//    @Test
//    fun tokenContractRequiresTheTransactionsOutputToHaveAPositiveAmount() {
//        val zeroTokenState = TokenState(alice.party, bob.party, 0)
//        val negativeTokenState = TokenState(alice.party, bob.party, -1)
//        val positiveTokenState = TokenState(alice.party, bob.party, 2)
//        ledgerServices.ledger {
//            transaction {
//                // Has zero-amount TokenState, will fail.
//                output(TokenContract.ID, zeroTokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                fails()
//            }
//            transaction {
//                // Has negative-amount TokenState, will fail.
//                output(TokenContract.ID, negativeTokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                fails()
//            }
//            transaction {
//                // Has positive-amount TokenState, will verify.
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                verifies()
//            }
//            transaction {
//                // Also has positive-amount TokenState, will verify.
//                output(TokenContract.ID, positiveTokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                verifies()
//            }
//        }
//    }
//    @Test
//    fun tokenContractRequiresTheTransactionsCommandToBeAnIssueCommand() {
//        ledgerServices.ledger {
//            transaction {
//                // Has wrong command type, will fail.
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, DummyCommandData)
//                fails()
//            }
//            transaction {
//                // Has correct command type, will verify.
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                verifies()
//
//            }
//        }
//    }
//    @Test
//    fun tokenContractRequiresTheIssuerToBeARequiredSignerInTheTransaction() {
//        val tokenStateWhereBobIsIssuer = TokenState(bob.party, alice.party, 1)
//        ledgerServices.ledger {
//            transaction {
//                // Issuer is not a required signer, will fail.
//                output(TokenContract.ID, tokenState)
//                command(bob.publicKey, TokenContract.Commands.Issue())
//                fails()
//            }
//            transaction {
//                // Issuer is also not a required signer, will fail.
//                output(TokenContract.ID, tokenStateWhereBobIsIssuer)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                fails()
//            }
//            transaction {
//                // Issuer is a required signer, will verify.
//                output(TokenContract.ID, tokenState)
//                command(alice.publicKey, TokenContract.Commands.Issue())
//                verifies()
//            }
//            transaction {
//                // Issuer is also a required signer, will verify.
//                output(TokenContract.ID, tokenStateWhereBobIsIssuer)
//                command(bob.publicKey, TokenContract.Commands.Issue())
//                verifies()
//            }
//        }
//    }
}
