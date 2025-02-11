package duckOduck.ducks

import duckOduck.base.Duck
import duckOduck.behaviour.fly.FlyWithWings
import duckOduck.behaviour.fly.interfaces.FlyBehaviour
import duckOduck.behaviour.quack.Quack
import duckOduck.behaviour.quack.interfaces.QuackBehaviour

class MallardDuck : Duck() {
    override var flyBehaviour: FlyBehaviour = FlyWithWings()

    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() {
        println("I'm a real mallard duck!!")
    }
}