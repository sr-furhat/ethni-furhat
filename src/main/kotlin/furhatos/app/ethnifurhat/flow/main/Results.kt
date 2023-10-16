package furhatos.app.ethnifurhat.flow.main

import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.nlu.common.*

val Results: State = state(Parent) {
    onEntry {
        furhat.say{}
    }
}