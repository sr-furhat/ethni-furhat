package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onUserEnter
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.voice.Voice
import furhatos.app.ethnifurhat.flow.main.facesandvoices.DefaultFaceAndVoice

val Sleeping: State = state {
    onEntry {
        furhat.character = DefaultFaceAndVoice["df"]
        furhat.voice = Voice(DefaultFaceAndVoice["dv"])
        furhat.attendNobody()
        furhat.gesture(GesturesLib.PerformFallAsleepPersist)
    }

    onUserEnter {
        furhat.gesture(GesturesLib.PerformWakeUpWithHeadShake)
        goto(Init2)
    }
}
