package top.zhiqian.sample.simUDuck

import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

@Title("Unit test for duck behavior")
@Narrative(""" create ducks and test their behavior """)
@Subject(Duck)
class SimUDuckSpec extends Specification {

    def "The Mallard duck can quack ,swim and fly"() {
        given: "A Mallard duck "
        Duck duck = Mock(MallardDuck)

        when: "mallard duck quack ,swim and fly"
        duck.display()
        duck.quack()
        duck.swim()
        duck.fly()

        then: "mallard duck should quack ,swim and fly"
        1 * duck.display()
        1 * duck.quack()
        1 * duck.swim()
        1 * duck.fly()
    }


    def "The Red Head  duck can quack ,swim and fly"() {
        given: "A red head duck  duck "
        Duck duck = Mock(RedHeadDuck)

        when: "the  duck quack ,swim and fly"
        duck.display()
        duck.quack()
        duck.swim()
        duck.fly()

        then: "the duck should quack ,swim and fly"
        1 * duck.display()
        1 * duck.quack()
        1 * duck.swim()
        1 * duck.fly()
    }

    def "The Rubber  duck can quack ,swim "() {
        given: "A red head duck  duck "
        Duck duck = Mock(RubberDuck)

        when: "the  duck quack ,swim and can't fly"
        duck.display()
        duck.quack()
        duck.swim()
        duck.fly()

        then: "the duck should quack ,swim and can't fly"
        1 * duck.display()
        1 * duck.quack()
        1 * duck.swim()
        0 * duck.fly()
    }

}
