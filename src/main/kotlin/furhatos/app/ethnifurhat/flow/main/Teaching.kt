package furhatos.app.ethnifurhat.flow.main

import furhatos.app.ethnifurhat.flow.Parent
import furhatos.app.ethnifurhat.flow.teachingscript.talkingscript
import furhatos.flow.kotlin.*



val Teaching: State = state(Parent) {

    onEntry {
        furhat.attend(users.random)
        for (element in talkingscript) {
            delay(500)
            furhat.attend(users.other)
            furhat.say(element)

        }
        goto(Thanks)
    }
}
