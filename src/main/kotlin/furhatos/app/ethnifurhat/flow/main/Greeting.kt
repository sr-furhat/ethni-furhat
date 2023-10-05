package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Greeting: State = state(Parent) {
    onEntry {
        furhat.ask {
            + GesturesLib.PerformThoughtful1
            + "Hey! Would you like to learn something and join our experiment? "
        }
    }

    onReentry {
        furhat.ask {
            + GesturesLib.PerformThoughtful1
            + "Would you like to learn something and join our experiment? "
        }
    }

    onResponse<Yes> {
        furhat.say {
            + GesturesLib.PerformSmile1
            + GesturesLib.PerformHeadeUp()
            + "Great! Thanks you for helping us by joining our experiment! "
        }
        goto(Meeting)
    }

    onResponse<No> {
        furhat.say{
            + GesturesLib.PerformSad1
            + GesturesLib.PerformHeadDown()
            + "Oh, ok. If you change your mind I'll be here! "
        }
        goto(Sleeping)
    }

    onResponse {
        furhat.gesture(GesturesLib.PerformThoughtful1)
        furhat.ask("Sorry but. I couldn't understand you. Can you try again?")
    }
}

