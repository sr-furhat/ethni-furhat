package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Greeting: State = state(Parent) {
    onEntry {
        when (users.count) {
            in 1..2 -> {
                for (user in users.all) {
                    furhat.attend(user)
                    GesturesLib.PerformBigSmile1
                    GesturesLib.ExpressEmpathy()
                    furhat.say("Hi")

                    delay(1500)  // Attend to the user for 3 seconds
                }
                goto(Greeting_2)
            }
            else -> {
                furhat.say("Hello Everyone")
                goto(Greeting_2)
            }
        }
    }

}

val Greeting_2: State = state(Parent) {
    onEntry {

        furhat.ask {
            + GesturesLib.PerformThoughtful1
            + GesturesLib.PerformTripleBlink
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
            + GesturesLib.ExpressSurpriseMild1()
            + "Great! Thank you for helping us by joining our experiment! "
        }

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



