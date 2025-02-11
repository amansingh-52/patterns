package duckOduck.base

import duckOduck.behaviour.fly.interfaces.FlyBehaviour
import duckOduck.behaviour.quack.interfaces.QuackBehaviour

abstract class Duck {
    protected abstract var flyBehaviour: FlyBehaviour
    protected abstract var quackBehaviour: QuackBehaviour

    abstract fun display()

    fun setFlyingBehaviour(behaviour: FlyBehaviour) {
        flyBehaviour = behaviour
    }

    fun setQuackingBehaviour(behaviour: QuackBehaviour) {
        quackBehaviour = behaviour
    }

    fun performFly() {
        flyBehaviour.fly()
    }

    fun performQuack() {
        quackBehaviour.quack()
    }
}