package duckOduck

import duckOduck.base.Duck
import duckOduck.behaviour.fly.FlyRocketPowered
import duckOduck.ducks.ModelDuck


fun main() {
    val duck: Duck = getDuck()
    duck.display()
    duck.performFly()
    duck.setFlyingBehaviour(FlyRocketPowered())
    duck.performFly()
    duck.performQuack()
}

fun getDuck(): Duck = ModelDuck()