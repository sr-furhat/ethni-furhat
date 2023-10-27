package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhat.libraries.standard.NluLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.nlu.common.*
import furhatos.app.ethnifurhat.setting.nativeLang
import furhatos.app.ethnifurhat.flow.main.facesandvoices.DefaultFaceAndVoice
import furhatos.app.ethnifurhat.flow.main.facesandvoices.MeetingCharacters
import furhatos.app.ethnifurhat.flow.main.facesandvoices.DutchVoice

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
        furhat.voice = Voice(MeetingCharacters["NL"]?.get(0))
        furhat.say("I can change my voice and language too!")
        delay(100)

        furhat.voice = Voice(DutchVoice)
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
        furhat.say {
            +"Enough me. Let's know from you a bit. What is your native language?"
            +GesturesLib.ExpressInterest1()
        }
    }
}

val LanguageLearned: State = state(Parent) {
    onEntry {
        furhat.say{
            + GesturesLib.ExpressThinking()
            + "Oh you speak ${users.current.nativeLang} huh."
        }

        furhat.say("Let's me continue with something might be more familiar with you.")
        furhat.voice = Voice(MeetingCharacters[users.current.nativeLang]?.get(0))
        furhat.character = MeetingCharacters[users.current.nativeLang]?.get(1)
        furhat.gesture(GesturesLib.ExpressEmpathy())
        furhat.say("Perfect! Everything set!")
        goto(LastCheck)
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

}

