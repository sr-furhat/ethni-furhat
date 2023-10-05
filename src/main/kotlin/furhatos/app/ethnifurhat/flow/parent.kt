package furhatos.app.ethnifurhat.flow

import furhat.libraries.standard.BehaviorLib
import furhatos.app.ethnifurhat.flow.main.Sleeping
import furhatos.flow.kotlin.*

val Parent: State = state {
    include(BehaviorLib.AutomaticMovements.randomHeadMovements())
    onUserEnter(instant = true) {
        when { // "it" is the user that entered
            furhat.isAttendingUser -> furhat.glance(it) // Glance at new users entering
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
