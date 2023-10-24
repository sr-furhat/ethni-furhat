package furhatos.app.ethnifurhat
import furhatos.app.ethnifurhat.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class EthnifurhatSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
