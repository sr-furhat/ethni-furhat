package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onUserEnter
import furhatos.flow.kotlin.state

val Sleeping: State = state {
    onEntry {
        furhat.gesture(GesturesLib.PerformFallAsleepPersist)
        furhat.attendNobody()
    }

    onUserEnter {
        furhat.gesture(GesturesLib.PerformWakeUpWithHeadShake)
        delay(1500)
        furhat.attend(it)
        goto(Greeting)
    }
}
