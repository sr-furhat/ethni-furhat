package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.*

val Thanks: State = state(Parent) {
    onEntry {
        furhat.say {
            delay(500)
            +"And that was it!"
            +GesturesLib.ExpressHappiness1()
        }
        delay(250)
        furhat.attend(users.random)
        furhat.say {
            + "A big thank you for joining our experiment and listening me!"
            + GesturesLib.ExpressInterest1()}
        delay(250)
        furhat.attend(users.random)
        furhat.say {
            + "I'm done and now it's your turn. You'll receive a little quiz about Osman pasha. Please do the quiz without cheating or choosing random questions. If you don't know just leave that question empty. Thanks again and hava a good day!"
            + GesturesLib.ExpressPleased1()
        }
        delay(250)
        furhat.attend(users.random)
        furhat.say {
            + "Goodbye for now!"
            + GesturesLib.ExpressSmileCongratulatory1()
            + "Now I'm going to sleep."
        }
        delay(500)
        goto(Sleeping)
    }
}