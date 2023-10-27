package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.users
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state

val Greeting: State = state(Parent) {
    onEntry {
        when (users.count) {
            in 1..2 -> {
                for (user in users.all) {
                    furhat.attend(user)
                    GesturesLib.PerformBigSmile1
                    GesturesLib.ExpressEmpathy()
                    furhat.say {
                        random {
                            + "Hi!"
                            + "Hello!"
                            + "Hello there!"
                            + "Welcome!"
                        }
                    }

                    delay(150)  // Attend to the user for 3 seconds
                }
            }
            else -> {
                furhat.say {
                    random {
                        +"Hello everyone!"
                        +"Hi everyone!"
                        +"Wow! Welcome everyone!"
                    }
                }
            }
        }
        furhat.say{
            + GesturesLib.ExpressPleased1()
            + "First of all. "
            + GesturesLib.ExpressHappiness1()
            + "I just want to say a big thank you from the bottom of my chip because you are helping us by joining our experiment."}

        goto(Meeting)
    }
}

