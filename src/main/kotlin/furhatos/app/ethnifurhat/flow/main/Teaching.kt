package furhatos.app.ethnifurhat.flow.main
import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.setting.nativeLang

import furhatos.app.ethnifurhat.flow.Parent
import furhatos.app.ethnifurhat.flow.main.langs.*
import furhatos.flow.kotlin.*

import furhatos.gestures.Gestures
//The Expresssions and gestures are still not finished could be change
val Teaching: State = state(Parent) {
    onEntry {
        val message = First_Message[users.current.nativeLang]
        if (message != null) {
            furhat.say(message)
        } else {
            furhat.say("Sorry, I don't have a message for this language.")
        }
        furhat.gesture(Gestures.BigSmile)
        delay(1000)
        goto(bitcoin)
    }
}
val bitcoin: State = state(Parent) {
    onEntry {
        val meaning = bitcoin_meaning[users.current.nativeLang]
        if (meaning != null) {
            furhat.say(meaning)
            furhat.gesture(Gestures.Thoughtful)
            delay(500)
        }
        val workingsystem = bitcoin_workingsystem[users.current.nativeLang]
        if (workingsystem != null) {
            furhat.say(workingsystem)
            furhat.gesture(Gestures.Surprise)
            delay(500)
        }
        val keyconcepts = bitcoin_keyconcepts[users.current.nativeLang]
        if (keyconcepts!= null) {
            furhat.say(keyconcepts)
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
        val secondmessage = Second_Message[users.current.nativeLang]
        if (secondmessage != null) {
            furhat.say(secondmessage)
        }
        furhat.gesture(GesturesLib.PerformSmile1)
        furhat.gesture(GesturesLib.ExpressSympathy1())
        goto(liberland)
    }

}
val liberland: State = state(Parent) {
    onEntry {
        val liberland_introduction = liberland_introduction[users.current.nativeLang]
        if (liberland_introduction != null) {
            furhat.say(liberland_introduction)
            furhat.gesture(GesturesLib.PerformSmile1)
            delay(500)
        }
        val liberland_description = liberland_description[users.current.nativeLang]
        if (liberland_description != null) {
            furhat.say(liberland_description)
            furhat.gesture(Gestures.Surprise)
            delay(500)
        }
        val liberland_recongnition  = liberland_recongnition [users.current.nativeLang]
        if (liberland_recongnition != null) {
            furhat.say(liberland_recongnition )
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
        val liberland_ideals  = liberland_ideals [users.current.nativeLang]
        if (liberland_ideals != null) {
            furhat.say(liberland_ideals )
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
        val third_message = Third_message[users.current.nativeLang]
        if (third_message != null) {
            furhat.say(third_message)
            furhat.gesture(GesturesLib.PerformTripleBlink)
            furhat.gesture(GesturesLib.PerformIntenseShake)
            goto(Disinfilation)
        }
    }
}
val Disinfilation: State = state(Parent) {
    onEntry {
        val Disinfilation_introduction = Disinfilation_introduction[users.current.nativeLang]
        if (Disinfilation_introduction != null) {
            furhat.say(Disinfilation_introduction)
            GesturesLib.PerformThoughtful1

            delay(500)
        }
        val Disinfilation_meaning = Disinfilation_meaning[users.current.nativeLang]
        if (Disinfilation_meaning != null) {
            furhat.say(Disinfilation_meaning)
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
        val Disinfilation_causes = Disinfilation_causes[users.current.nativeLang]
        if (Disinfilation_causes != null) {
            furhat.say(Disinfilation_causes)
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
        val Disinfilation_effects = Disinfilation_effects[users.current.nativeLang]
        if (Disinfilation_effects != null) {
            furhat.say(Disinfilation_effects)
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
        val fourth_message = Fourth_message[users.current.nativeLang]
        if (fourth_message != null) {
            furhat.say(fourth_message)
            furhat.gesture(GesturesLib.PerformTripleBlink)
            furhat.gesture(GesturesLib.PerformIntenseShake)
            goto(mahmutpasha)
        }
    }
}
val mahmutpasha: State = state(Parent) {
    onEntry {
        val MahmutPashaIntroduction  = Mahmut_pasha_introduction[users.current.nativeLang]
        if (MahmutPashaIntroduction != null) {
            furhat.say(MahmutPashaIntroduction)
            GesturesLib.PerformThoughtful1

            delay(500)
        }
        val MahmutPashaPersonWho  = Mahmut_pasha_personwho[users.current.nativeLang]
        if (MahmutPashaPersonWho != null) {
            furhat.say(MahmutPashaPersonWho)
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
        val MahmutPashaSiegeofPlevna = Mahmut_pasha_siegofplevna[users.current.nativeLang]
        if (MahmutPashaSiegeofPlevna != null) {
            furhat.say(MahmutPashaSiegeofPlevna)
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
        val MahmutPashaRecognition= Mahmut_pasha_recognition[users.current.nativeLang]
        if (MahmutPashaRecognition != null) {
            furhat.say(MahmutPashaRecognition)
            furhat.gesture(GesturesLib.PerformBigSmile1)
            delay(500)
        }
    }
}




