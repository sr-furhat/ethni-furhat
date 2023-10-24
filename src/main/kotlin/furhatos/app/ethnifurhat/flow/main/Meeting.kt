package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhat.libraries.standard.NluLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.nlu.common.*
import furhatos.app.ethnifurhat.setting.nativeLang

const val EN = "English"
const val TR = "Turkish"
const val NL = "Dutch"
const val PT = "Portuguese"
const val PL = "Polish"
const val DE = "German"
const val AR = "Arabic"

val DefaultFaceAndVoice = hashMapOf(
    "df" to "Titan",
    "dv" to "Joey-neural",
)

val MeetingCharacters = hashMapOf(
    EN to listOf("Gregory-Neural", "Marty"),
    TR to listOf("Kendra-Neural", "Nazar"),
    PL to listOf("Kendra-Neural", "Vinnie"),
    PT to listOf("Kendra-Neural", "Patricia"),
    DE to listOf("Kendra-Neural", "Jane"),
    AR to listOf("Gregory-Neural", "Omar"),
    NL to listOf("Kendra-Neural", "Jane"),
)

val MeetingLastCheck = listOf(
    "Now that we have met, we can start our learning part. I'll try to teach you a topic from history, The Ottoman commander Gazi Osman Pasha. After I finish teaching you'll be tested by a quiz.",
    "Are you ready?",
    "Then let's begin! Good luck!",
)

val Meeting: State = state(Parent) {
    onEntry {
        goto(FirstContact)
    }
}

val FirstContact: State = state(Parent) {
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
        goto(LearnLanguage)
    }
}

val LearnLanguage: State = state(Parent) {
    onEntry {
        furhat.ask("Enough me. Let's know from you a bit. What is your native language? In English please.")
    }

    onResponse<NluLib.SpokenLanguages> {
        users.current.nativeLang = it.text
        furhat.say{
            + GesturesLib.ExpressThinking()
            + "Oh you speak ${it.text} huh."
        }

        when(it.text) {
            "English", "Turkish", "Dutch", "Porteguese", "Polish", "German", "Arabic"-> {
                furhat.say("Let's me continue with something might be more familiar with you.")
                furhat.voice = Voice(MeetingCharacters[it.text]?.get(0))
                furhat.character = MeetingCharacters[it.text]?.get(1)
                furhat.gesture(GesturesLib.ExpressEmpathy())
                furhat.say("Perfect! Everything set!")
                goto(LastCheck)
            }
            else -> {
                furhat.say{
                    + GesturesLib.ExpressSadness1()
                    + "I'm really sorry but I didn't programmed to have this experiment in ${it.text}."
                    + GesturesLib.ExpressGuilt1()
                    + GesturesLib.PerformHeadDown()
                    + "Thanks for your interest but I'm going to end this and go to sleep."
                }
                goto(Sleeping)
            }
        }

    }

    onResponse {
        furhat.ask{
            + GesturesLib.PerformThoughtful1
            + "Sorry didn't understand that. Can you say that again?"}
    }
}

val LastCheck: State = state(Parent) {
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

