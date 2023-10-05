package furhatos.app.ethnifurhat.setting

import furhatos.records.User
import furhatos.flow.kotlin.UserDataDelegate

var User.nativeLang: String? by UserDataDelegate()

var User.name: String? by UserDataDelegate()