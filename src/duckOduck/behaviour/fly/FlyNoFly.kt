package duckOduck.behaviour.fly

import duckOduck.behaviour.fly.interfaces.FlyBehaviour

class FlyNoFly : FlyBehaviour {
    override fun fly() {
       println("I can't fly")
    }
}