package ducks

import base.Duck
import behaviour.fly.FlyWithWings
import behaviour.fly.interfaces.FlyBehaviour
import behaviour.quack.Quack
import behaviour.quack.interfaces.QuackBehaviour

class MallardDuck : Duck() {
    override var flyBehaviour: FlyBehaviour = FlyWithWings()

    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() {
        println("I'm a real mallard duck!!")
    }
}