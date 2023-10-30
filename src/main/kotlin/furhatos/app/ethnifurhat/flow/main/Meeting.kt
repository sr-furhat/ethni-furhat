package furhatos.app.ethnifurhat.flow.noMain

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.noParent
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.app.ethnifurhat.flow.noMain.facesandvoices.DefaultFaceAndVoice
import furhatos.app.ethnifurhat.flow.noMain.facesandvoices.DutchVoice
import furhatos.app.ethnifurhat.flow.noMain.facesandvoices.DifferentVoice

val noMeetingLastCheck = listOf(
    "Now that we have met, we can start our learning part.",
    "I'll try to teach you a topic from history, The Ottoman commander Gazi Osman Pasha. After I finish teaching you'll be tested by a quiz.",
    "Are you ready?",
    "Then let's begin! Good luck!",
)

val noMeeting: State = state(noParent) {
    onEntry {
        goto(noFirstContact)
    }
}

val noFirstContact: State = state(noParent) {
    onEntry {
        furhat.say("First of all hi! I'm Furhat")
        delay(200)
        furhat.attend(users.other)
        furhat.say("I'm one of the most advanced social robots out there!")
        furhat.gesture(GesturesLib.ExpressSmileCongratulatory1(), async = false)
        furhat.attend(users.other)
        furhat.say("I can change my face in a second like this")
        furhat.attend(users.other)
        delay(300)
        furhat.attend(users.other)
        furhat.character = "Kione"
        delay(300)
        furhat.say("let me give another example")


        delay(300)
        furhat.character = "Nazar"
        delay(500)
        furhat.say("How about this one?")
        delay(500)
        furhat.attend(users.other)
        furhat.character = DefaultFaceAndVoice["df"]
        delay(500)

        furhat.say("The only thing that I can change is not my face. At the same time ")
        furhat.attend(users.other)
        furhat.voice = Voice(DifferentVoice)
        furhat.say("I can change my voice and language too!")
        delay(100)

        furhat.voice = Voice(DutchVoice)
        furhat.say {
            +GesturesLib.ExpressEmpathy()
            +"Hallo daar, ik ben een sociaal intelligente robot."
        }
        furhat.attend(users.other)
        furhat.say("Ik spreek vloeiend Nederlands!")

        delay(200)

        furhat.character = DefaultFaceAndVoice["df"]
        furhat.voice = Voice(DefaultFaceAndVoice["dv"])
        goto(noLastCheck)
    }
}

val noLastCheck: State = state(noParent) {
    onEntry {
        furhat.attend(users.random)
        furhat.say(noMeetingLastCheck[0])
        furhat.attend(users.random)
        furhat.say(noMeetingLastCheck[1])
        furhat.attend(users.random)
        furhat.say(noMeetingLastCheck[2])
        furhat.gesture(GesturesLib.ExpressThinking())
    }
}