package behaviour.fly

import behaviour.fly.interfaces.FlyBehaviour

class FlyNoFly : FlyBehaviour {
    override fun fly() {
       println("I can't fly")
    }
}