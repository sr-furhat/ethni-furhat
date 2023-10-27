package furhatos.app.ethnifurhat.flow

import furhatos.app.ethnifurhat.flow.main.Sleeping
import furhatos.app.ethnifurhat.flow.wizardButtons.NoStartTheExperiment
import furhatos.flow.kotlin.*

val noParent: State = state {
    include(NoStartTheExperiment)
    onUserEnter(instant = true) {
        when { // "it" is the user that entered
            furhat.isAttendingUser -> furhat.glance(it.id) // Glance at new users entering
            !furhat.isAttendingUser -> furhat.attend(it) // Attend user if not attending anyone
        }
    }

    onUserLeave(instant = true) {
        when {
            !users.hasAny() -> { // last user left
                furhat.attendNobody()
                goto(Sleeping)
            }

            furhat.isAttending(it) -> furhat.attend(users.other) // current user left
            !furhat.isAttending(it) -> furhat.glance(it.head.location) // other user left, just glance
        }
    }
}