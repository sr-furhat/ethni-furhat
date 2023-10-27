package furhatos.app.ethnifurhat.flow.wizardButtons

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.main.Init2
import furhatos.app.ethnifurhat.flow.noMain.noGreeting
import furhatos.app.ethnifurhat.flow.noMain.noMeetingLastCheck
import furhatos.app.ethnifurhat.flow.noMain.noTeaching
import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.Section
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.partialState

val NoStartTheExperiment = partialState {
    onButton("Start Greeting - No Ethni", section = Section.LEFT, color = Color.Green) {
        goto(noGreeting)
    }
    onButton("Start Teaching - No Ethni", section = Section.LEFT, color = Color.Red) {
        furhat.gesture(GesturesLib.ExpressHappiness1())
        furhat.say(noMeetingLastCheck[3])
        goto(noTeaching)
    }
    onButton("Swithc to Ethni", section = furhatos.flow.kotlin.Section.LEFT, color = Color.Green) {
        goto(Init2)
    }
}