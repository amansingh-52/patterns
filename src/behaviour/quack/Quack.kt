package behaviour.quack

import behaviour.quack.interfaces.QuackBehaviour

class Quack : QuackBehaviour {
    override fun quack() {
        println("Quack quack!!!")
    }
}