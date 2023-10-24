package furhatos.app.ethnifurhat.flow


import furhatos.app.ethnifurhat.flow.main.Sleeping

import furhatos.app.ethnifurhat.flow.main.Meeting

import furhatos.app.ethnifurhat.setting.DISTANCE_TO_ENGAGE
import furhatos.app.ethnifurhat.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.users
import furhatos.flow.kotlin.voice.Voice

val Init: State = state {

    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
        furhat.character = "Titan"
        furhat.voice = Voice("Joey-neural")

    }
    onEntry {
        /** start interaction */
        when {
            users.hasAny() -> {
                furhat.attend(users.random)
                goto(Meeting)
            }
            else -> goto(Sleeping)
        }
    }

}
