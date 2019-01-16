package example

import org.apache.commons.codec.binary.Hex
import org.bitcoinj.core.ECKey

fun main(args: Array<String>) {
    val privateKey = "18e14a7b6a307f426a94f8114701e7c8e774e7f9a47e2c2035db29a206321725"
    println("private key: ${privateKey}")

    val ecKey = ECKey.fromPrivate(Hex.decodeHex(privateKey))
    val publicKey = ecKey.publicKeyAsHex
    println("public key: ${publicKey}")

}
