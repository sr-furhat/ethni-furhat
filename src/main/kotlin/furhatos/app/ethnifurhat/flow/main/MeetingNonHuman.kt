package furhatos.app.ethnifurhat.flow.main



import furhat.libraries.standard.GesturesLib
import furhat.libraries.standard.NluLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.nlu.common.*
import furhatos.app.ethnifurhat.setting.nativeLang






val MeetingNonHuman: State = state(Parent) {
    onEntry {
        goto(FirstContact1)
    }
}

val FirstContact1: State = state(Parent) {
    onEntry {
        furhat.say("First of all hi! I'm Furhat")
        delay(200)
        furhat.say("I'm one of the most advanced social robots out there!")
        furhat.gesture(GesturesLib.ExpressSmileCongratulatory1(), async = false)
        furhat.say("I can change my face in a second like this")

        delay(300)
        furhat.character = "Kione"
        delay(300)
        furhat.say("let me give another example")


        delay(300)
        furhat.character = "Nazar"
        delay(500)
        furhat.say("How about this one?")



        delay(500)
        furhat.character = DefaultFaceAndVoice["df"]
        delay(200)

        furhat.say("The only thing that I can change is not my face. At the same time ")
        furhat.voice = Voice("Justin-Neural")
        furhat.say("I can change my voice and language too!")
        delay(100)

        furhat.voice = Voice("Laura-Neural")
        furhat.say{
            + GesturesLib.ExpressEmpathy()
            + "Hallo daar, ik ben een sociaal intelligente robot. Ik spreek vloeiend Nederlands!"
        }
        delay(200)

        furhat.character = DefaultFaceAndVoice["df"]
        furhat.voice = Voice(DefaultFaceAndVoice["dv"])
        goto(LastCheck1)
    }
}



val LastCheck1: State = state(Parent) {
    onEntry {
        furhat.say(MeetingLastCheck[0])
        furhat.ask(MeetingLastCheck[1])
    }

    onReentry {
        furhat.ask(MeetingLastCheck[1])
    }

    onResponse<Yes> {
        furhat.gesture(GesturesLib.ExpressHappiness1())
        furhat.say(MeetingLastCheck[2])
        goto(Teaching)
    }

    onResponse<No> {
        furhat.character = DefaultFaceAndVoice["df"]
        furhat.voice = Voice(DefaultFaceAndVoice["dv"])
        furhat.say{
            + GesturesLib.PerformSad1
            + GesturesLib.PerformHeadDown()
            + "Oh, ok. If you change your mind I'll be here! "
        }
        goto(Sleeping)
    }

    onResponse {
        furhat.say{
            + GesturesLib.PerformThoughtful1
            + "Sorry didn't understand that. Can you say that again?"}
    }
}

