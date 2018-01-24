package com.soriole.dht.kademlia.simulations;

import com.soriole.dht.kademlia.JKademliaNode;
import com.soriole.dht.kademlia.message.SimpleMessage;
import com.soriole.dht.kademlia.message.SimpleReceiver;
import com.soriole.dht.kademlia.node.KademliaId;

import java.io.IOException;

/**
 * Test 1: Try sending a simple message between nodes
 *
 * @author Joshua Kissoon
 * @created 20140218
 */
public class SimpleMessageTest {

    public static void main(String[] args) {
        try {
            JKademliaNode kad1 = new JKademliaNode("Joshua", new KademliaId("12345678901234567890"), 7574);
            JKademliaNode kad2 = new JKademliaNode("Crystal", new KademliaId("12345678901234567891"), 7572);

            kad1.getServer().sendMessage(kad2.getNode(), new SimpleMessage("Some Message1"), new SimpleReceiver());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
