package ducks

import base.Duck
import behaviour.fly.FlyNoFly
import behaviour.fly.interfaces.FlyBehaviour
import behaviour.quack.Quack
import behaviour.quack.interfaces.QuackBehaviour

class ModelDuck : Duck() {
    override var flyBehaviour: FlyBehaviour = FlyNoFly()
    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() {
        println("I'm a model 🦆")
    }
}