package furhatos.app.ethnifurhat.flow.wizardbuttons

import furhatos.app.ethnifurhat.flow.main.Meeting
import furhatos.app.ethnifurhat.flow.main.MeetingNonHuman
import furhatos.app.ethnifurhat.flow.main.Teaching
import furhatos.app.ethnifurhat.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.partialState
import furhatos.flow.kotlin.voice.Voice


val wizardButtons = partialState {
        onButton("Robotic Face", section = furhatos.flow.kotlin.Section.LEFT, color = Color.Blue) {
            furhat.character = "Titan"
            furhat.voice = Voice("Joey-neural")

            goto(MeetingNonHuman)


        }
        onButton("antromorphic",section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Red) {
            goto(Meeting)
        }

}
val UserButton = partialState {
    onButton("Maximum User(Up to 3)", section = furhatos.flow.kotlin.Section.LEFT, color = Color.Green) {
        MAX_NUMBER_OF_USERS = 3
        furhat.say("User Interaction Parameter Updated")
    }
    onButton("Max User(No Limitations)", section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Yellow) {
        MAX_NUMBER_OF_USERS = Int.MAX_VALUE
        furhat.say("User limit Has benn removed")
    }

}