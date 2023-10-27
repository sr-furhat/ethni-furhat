package furhatos.app.ethnifurhat.flow.noMain

import furhat.libraries.standard.GesturesLib
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onUserEnter
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.voice.Voice
import furhatos.app.ethnifurhat.flow.noMain.facesandvoices.DefaultFaceAndVoice

val noSleeping: State = state {
    onEntry {
        furhat.character = DefaultFaceAndVoice["df"]
        furhat.voice = Voice(DefaultFaceAndVoice["dv"])
        furhat.attendNobody()
        furhat.gesture(GesturesLib.PerformFallAsleepPersist)
    }

    onUserEnter {
        furhat.gesture(GesturesLib.PerformWakeUpWithHeadShake)
        goto(noInit2)
    }
}