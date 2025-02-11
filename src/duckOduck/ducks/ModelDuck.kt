package duckOduck.ducks

import duckOduck.base.Duck
import duckOduck.behaviour.fly.FlyNoFly
import duckOduck.behaviour.fly.interfaces.FlyBehaviour
import duckOduck.behaviour.quack.Quack
import duckOduck.behaviour.quack.interfaces.QuackBehaviour

class ModelDuck : Duck() {
    override var flyBehaviour: FlyBehaviour = FlyNoFly()
    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() {
        println("I'm a model 🦆")
    }
}