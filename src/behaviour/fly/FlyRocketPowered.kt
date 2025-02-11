package behaviour.fly

import behaviour.fly.interfaces.FlyBehaviour

class FlyRocketPowered : FlyBehaviour {
    override fun fly() {
        println("I'm flying with 🚀 \uD83D\uDE80 \uD83D\uDE80")
    }
}