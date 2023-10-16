package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.main.langs.DefaultFaceAndVoice
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onUserEnter
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.voice.Voice

val Sleeping: State = state {
    onEntry {
        furhat.character = DefaultFaceAndVoice["df"]
        furhat.voice = Voice(DefaultFaceAndVoice["dv"])
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
