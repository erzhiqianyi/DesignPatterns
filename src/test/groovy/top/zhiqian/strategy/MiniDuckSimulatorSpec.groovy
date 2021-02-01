package top.zhiqian.strategy

import spock.lang.*

@Title("Unit test for duck behavior")
@Narrative(""" create ducks and test their behavior """)
@Subject(Duck)
@Unroll
class MiniDuckSimulatorSpec extends Specification {

    def "Mallard Duck can flying  ,swim , and quack "() {
        given: "A Mallard duck "
        Duck duck = new MallardDuck()

        when: "duck perform quack and fly "
        duck.performQuack()
        duck.performFly()

        then: "duck should be quack and fly"

    }


    def "Model duck can fly with rocket powered"(){
        given: "A model duck  "
        Duck duck = new ModelDuck()

        when: "set model duck fly behavior as fly rocket powered "
        duck.performFly()
        duck.setFlyBehavior(new FlyRocketPowered())
        duck.performFly()

        then: "duck should be fly with rocket powered"

    }

}
