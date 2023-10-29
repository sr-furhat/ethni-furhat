package furhatos.app.ethnifurhat.flow.wizardbuttons

import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.flow.main.Greeting
import furhatos.app.ethnifurhat.flow.main.LanguageLearned
import furhatos.app.ethnifurhat.flow.main.MeetingLastCheck
import furhatos.app.ethnifurhat.flow.main.Teaching
import furhatos.app.ethnifurhat.flow.noMain.noInit2
import furhatos.app.ethnifurhat.setting.nativeLang
import furhatos.flow.kotlin.Color
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.partialState
import furhatos.flow.kotlin.users

val StartTheExperiment = partialState {
    onButton("Start Greeting", section = furhatos.flow.kotlin.Section.LEFT, color = Color.Green) {
        goto(Greeting)
    }
    onButton("Start Teaching", section = furhatos.flow.kotlin.Section.LEFT, color = Color.Yellow) {
        furhat.gesture(GesturesLib.ExpressHappiness1())
        furhat.say(MeetingLastCheck[3])
        goto(Teaching)
    }
    onButton("Swithc to No Ethni", section = furhatos.flow.kotlin.Section.LEFT, color = Color.Red) {
        goto(noInit2)
    }
}

val EthnicityButton = partialState {
    onButton("English", section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Blue) {
        users.current.nativeLang = "English"
        goto(LanguageLearned)
    }

    onButton("Dutch", section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Blue) {
        users.current.nativeLang = "Dutch"
        goto(LanguageLearned)
    }

    onButton("German", section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Blue) {
        users.current.nativeLang = "German"
        goto(LanguageLearned)
    }

    onButton("Turkish", section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Blue) {
        users.current.nativeLang = "Turkish"
        goto(LanguageLearned)
    }

    onButton("Arabic", section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Blue) {
        users.current.nativeLang = "Arabic"
        goto(LanguageLearned)
    }

    onButton("Polish", section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Blue) {
        users.current.nativeLang = "Polish"
        goto(LanguageLearned)
    }

    onButton("Portuguese", section = furhatos.flow.kotlin.Section.RIGHT, color = Color.Blue) {
        users.current.nativeLang = "Portuguese"
        goto(LanguageLearned)
    }
}