import base.Duck
import behaviour.fly.FlyRocketPowered
import ducks.ModelDuck


fun main() {
    val duck: Duck = getDuck()
    duck.display()
    duck.performFly()
    duck.setFlyingBehaviour(FlyRocketPowered())
    duck.performFly()
    duck.performQuack()
}

fun getDuck(): Duck = ModelDuck()