package kotlin_bootcamp

import com.google.common.collect.ImmutableList
import net.corda.testing.node.MockNetwork
import net.corda.testing.node.StartedMockNode
import org.junit.*
import kotlin.test.assertEquals

class TokenIssueFlowTest {
//    private lateinit var network: MockNetwork
//    private lateinit var nodeA: StartedMockNode
//    private lateinit var nodeB: StartedMockNode
//
//    @Before
//    fun setup() {
//        network = MockNetwork(ImmutableList.of("kotlin_bootcamp"))
//        nodeA = network.createPartyNode(null)
//        nodeB = network.createPartyNode(null)
//        network.runNetwork()
//    }
//
//    @After
//    fun tearDown() {
//        network.stopNodes()
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun transactionConstructedByFlowUsesTheCorrectNotary() {
//        val flow = TokenIssueFlow(nodeB.info.legalIdentities[0], 99)
//        val future = nodeA.startFlow(flow)
//        network.runNetwork()
//        val signedTransaction = future.get()
//
//        assertEquals(1, signedTransaction.tx.outputStates.size.toLong())
//        val output = signedTransaction.tx.outputs[0]
//
//        assertEquals(network.notaryNodes[0].info.legalIdentities[0], output.notary)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun transactionConstructedByFlowHasOneTokenStateOutputWithTheCorrectAmountAndOwner() {
//        val flow = TokenIssueFlow(nodeB.info.legalIdentities[0], 99)
//        val future = nodeA.startFlow(flow)
//        network.runNetwork()
//        val signedTransaction = future.get()
//
//        assertEquals(1, signedTransaction.tx.outputStates.size.toLong())
//        val output = signedTransaction.tx.outputsOfType(TokenState::class.java)[0]
//
//        assertEquals(nodeB.info.legalIdentities[0], output.owner)
//        assertEquals(99, output.amount)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun transactionConstructedByFlowHasOneOutputUsingTheCorrectContract() {
//        val flow = TokenIssueFlow(nodeB.info.legalIdentities[0], 99)
//        val future = nodeA.startFlow(flow)
//        network.runNetwork()
//        val signedTransaction = future.get()
//
//        assertEquals(1, signedTransaction.tx.outputStates.size.toLong())
//        val (_, contract) = signedTransaction.tx.outputs[0]
//
//        assertEquals("kotlin_bootcamp.TokenContract", contract)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun transactionConstructedByFlowHasOneIssueCommand() {
//        val flow = TokenIssueFlow(nodeB.info.legalIdentities[0], 99)
//        val future = nodeA.startFlow(flow)
//        network.runNetwork()
//        val signedTransaction = future.get()
//
//        assertEquals(1, signedTransaction.tx.commands.size.toLong())
//        val (value) = signedTransaction.tx.commands[0]
//
//        assert(value is TokenContract.Commands.Issue)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun transactionConstructedByFlowHasOneCommandWithTheIssueAsASigner() {
//        val flow = TokenIssueFlow(nodeB.info.legalIdentities[0], 99)
//        val future = nodeA.startFlow(flow)
//        network.runNetwork()
//        val signedTransaction = future.get()
//
//        assertEquals(1, signedTransaction.tx.commands.size.toLong())
//        val (_, signers) = signedTransaction.tx.commands[0]
//
//        assertEquals(1, signers.size.toLong())
//        assert(signers.contains(nodeA.info.legalIdentities[0].owningKey))
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun transactionConstructedByFlowHasNoInputsAttachmentsOrTimeWindows() {
//        val flow = TokenIssueFlow(nodeB.info.legalIdentities[0], 99)
//        val future = nodeA.startFlow(flow)
//        network.runNetwork()
//        val signedTransaction = future.get()
//
//        assertEquals(0, signedTransaction.tx.inputs.size.toLong())
//        // The single attachment is the contract attachment.
//        assertEquals(1, signedTransaction.tx.attachments.size.toLong())
//        assertEquals(null, signedTransaction.tx.timeWindow)
//    }
}
