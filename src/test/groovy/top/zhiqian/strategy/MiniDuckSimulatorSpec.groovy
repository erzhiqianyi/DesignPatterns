package top.zhiqian.strategy

import spock.lang.*
import top.zhiqian.strategy.behavior.fly.FlyRocketPowered
import top.zhiqian.strategy.duck.DecoyDuck
import top.zhiqian.strategy.duck.MallardDuck
import top.zhiqian.strategy.duck.ModelDuck
import top.zhiqian.strategy.duck.RedHeadDuck

@Title("Unit test for duck behavior")
@Narrative(""" create ducks and test their behavior """)
@Subject(Duck)
@Unroll
class MiniDuckSimulatorSpec extends Specification {

    def "Mallard Duck can fly  ,swim , and quack "() {
        given: "A Mallard duck "
        Duck duck = new MallardDuck()

        when: "duck perform quack and fly "
        duck.display()
        duck.performQuack()
        duck.performFly()

        then: "duck should be quack and fly"

    }

    def "decoy Duck can swim ,  quack ,and can't fly "() {
        given: "A Deocy duck "
        Duck duck = new DecoyDuck()

        when: "duck perform quack and fly "
        duck.display()
        duck.performQuack()
        duck.performFly()

        then: "duck should be quack and can't fly "

    }


    def "Model duck can set fly with rocket powered"() {
        given: "A model duck  "
        Duck duck = new ModelDuck()

        when: "set model duck fly behavior as fly rocket powered "
        duck.display()
        duck.performFly()
        duck.setFlyBehavior(new FlyRocketPowered())
        duck.performFly()

        then: "duck should be fly with rocket powered"

    }


    def "Red Head  Duck can fly  ,swim , and quack "() {
        given: "A Mallard duck "
        Duck duck = new RedHeadDuck()

        when: "duck perform quack and fly "
        duck.display()
        duck.performQuack()
        duck.performFly()

        then: "duck should be quack and fly"

    }


}
