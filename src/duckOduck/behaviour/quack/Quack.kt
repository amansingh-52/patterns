package duckOduck.behaviour.quack

import duckOduck.behaviour.quack.interfaces.QuackBehaviour

class Quack : QuackBehaviour {
    override fun quack() {
        println("Quack quack!!!")
    }
}