package top.zhiqian.strategy.sample.game

import spock.lang.*
import top.zhiqian.strategy.sample.game.character.King
import top.zhiqian.strategy.sample.game.character.Knight
import top.zhiqian.strategy.sample.game.character.Queue
import top.zhiqian.strategy.sample.game.character.Troll
import top.zhiqian.strategy.sample.game.weapon.AxeBehavior
import top.zhiqian.strategy.sample.game.weapon.BowAndArrowBehavior
import top.zhiqian.strategy.sample.game.weapon.KnifeBehavior
import top.zhiqian.strategy.sample.game.weapon.SwordBehavior

@Title("Unit test for character fight behavior ")
@Narrative(""" create characters and test their behavior """)
@Subject(java.lang.Character)
@Unroll
class CharacterSpec extends Specification {

    def "King should use sword"() {
        given: " a king"
        Character king = new King()

        when: "king perform fight "
        king.display()
        king.fight()

        then: "king should use sword to fight"
        king.showWeapon().getClass() == SwordBehavior.class

    }

    def "Knight should use use bow and arrow"() {
        given: " a Knight"
        Character knight = new Knight()

        when: "Knight perform fight"
        knight.display()
        knight.fight()

        then: "king should use  bow and arrow to fight"
        knight.showWeapon().getClass() == BowAndArrowBehavior.class
    }


    def "Queue  should use use knife"() {
        given: " a Queue"
        Character queue = new Queue()

        when: "Queue perform fight"
        queue.display()
        queue.fight()

        then: "Queue should use knife"
        queue.showWeapon().getClass() == KnifeBehavior.class

    }

    def "Troll  should use axe"() {
        given: " a Troll"
        Character troll = new Troll()

        when: "Troll perform fight"
        troll.display()
        troll.fight()

        then: "Troll should use  axe"
        troll.showWeapon().getClass() == AxeBehavior.class
    }


    def "Knight can use use bow and arrow and change weapon to sword "() {
        given: " a Knight"
        Character knight = new Knight()

        when: "Knight perform fight"
        knight.display()
        knight.fight()

        then: "king should use  bow and arrow to fight"
        knight.showWeapon().getClass() == BowAndArrowBehavior.class

        when: "Knight change weapon to Sword"
        SwordBehavior swordBehavior = new SwordBehavior()
        knight.setWeapon(swordBehavior)

        and: "fight"
        knight.fight()

        then: "Knight should use sword to fight"
        knight.showWeapon() == swordBehavior
    }


}
