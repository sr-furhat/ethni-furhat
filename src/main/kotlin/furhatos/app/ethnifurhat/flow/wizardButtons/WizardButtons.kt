package furhatos.app.ethnifurhat.flow.wizardButtons

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.main.Init2
import furhatos.app.ethnifurhat.flow.main.Greeting
import furhatos.app.ethnifurhat.flow.main.MeetingLastCheck
import furhatos.app.ethnifurhat.flow.main.Teaching
import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.Section
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.partialState

val NoStartTheExperiment = partialState {
    onButton("Start Greeting - No Ethni", section = Section.LEFT, color = Color.Green) {
        goto(Greeting)
    }
    onButton("Start Teaching - No Ethni", section = Section.LEFT, color = Color.Yellow) {
        furhat.gesture(GesturesLib.ExpressHappiness1())
        furhat.say(MeetingLastCheck[3])
        goto(Teaching)
    }
    onButton("Swithc to Ethni", section = Section.LEFT, color = Color.Red) {
        goto(Init2)
    }
}