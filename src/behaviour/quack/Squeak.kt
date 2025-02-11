package behaviour.quack

import behaviour.quack.interfaces.QuackBehaviour

class Squeak : QuackBehaviour {
    override fun quack() {
        println("Squeak!")
    }
}