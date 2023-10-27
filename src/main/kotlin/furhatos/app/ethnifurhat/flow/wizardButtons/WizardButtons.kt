package furhatos.app.ethnifurhat.flow.wizardbuttons

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.main.Greeting
import furhatos.app.ethnifurhat.flow.main.MeetingLastCheck
import furhatos.app.ethnifurhat.flow.main.Teaching
import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.partialState

val StartTheExperiment = partialState {
    onButton("Start Greeting", section = furhatos.flow.kotlin.Section.LEFT, color = Color.Green) {
        goto(Greeting)
    }
    onButton("Start Teaching", section = furhatos.flow.kotlin.Section.LEFT, color = Color.Red) {
        furhat.gesture(GesturesLib.ExpressHappiness1())
        furhat.say(MeetingLastCheck[3])
        goto(Teaching)
    }
}