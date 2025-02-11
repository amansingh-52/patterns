package duckOduck.behaviour.quack

import duckOduck.behaviour.quack.interfaces.QuackBehaviour

class Squeak : QuackBehaviour {
    override fun quack() {
        println("Squeak!")
    }
}