package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhat.libraries.standard.NluLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.nlu.common.*
import furhatos.util.Language

import furhatos.app.ethnifurhat.flow.main.langs.*
import furhatos.app.ethnifurhat.setting.name
import furhatos.app.ethnifurhat.setting.nativeLang

val Meeting: State = state(Parent) {
    onEntry {
        goto(FirstContact)
    }
}

val FirstContact: State = state(Parent) {
    onEntry {
        furhat.say("First of all hi! I'm Furhat")
        delay(200)
        furhat.say("I'm one of the most advanced social robots out there!")
        furhat.gesture(GesturesLib.ExpressSmileCongratulatory1(), async = false)
        furhat.say("I can change my face in a second like this")

        delay(300)
        furhat.character = "Kione"
        delay(300)
        furhat.say("let me give another example")


        delay(300)
        furhat.character = "Nazar"
        delay(500)
        furhat.say("How about this one?")



        delay(500)
        furhat.character = DefaultFaceAndVoice["df"]
        delay(200)

        furhat.say("The only thing that I can change is not my face. At the same time ")
        furhat.voice = Voice("Justin-Neural")
        furhat.say("I can change my voice and language too!")
        delay(100)

        furhat.voice = Voice("Laura-Neural")
        furhat.say{
            + GesturesLib.ExpressEmpathy()
            + "Hallo daar, ik ben een sociaal intelligente robot. Ik spreek vloeiend Nederlands!"
        }
        delay(200)

        furhat.character = DefaultFaceAndVoice["df"]
        furhat.voice = Voice(DefaultFaceAndVoice["dv"])
        goto(LearnLanguage)
    }
}

val LearnLanguage: State = state(Parent) {
    onEntry {
        furhat.ask("Enough me. Let's know from you a bit. What is your native language?")
    }

    onResponse<NluLib.SpokenLanguages> {
        users.current.nativeLang = it.text
        furhat.say{
            + GesturesLib.ExpressThinking()
            + "Oh you speak ${it.text} huh. Let's continue with ${it.text} then!"
        }

        when(it.text) {
            "English" -> {}
            "Turkish" -> {furhat.setInputLanguage(Language.ENGLISH_US, Language.TURKISH)}
            "Dutch" -> {furhat.setInputLanguage(Language.ENGLISH_US, Language.DUTCH)}
            "Portuguese" -> {furhat.setInputLanguage(Language.ENGLISH_US, Language.PORTUGUESE_BR, Language.PORTUGUESE_PT)}
            "Polish" -> {furhat.setInputLanguage(Language.ENGLISH_US, Language.POLISH)}
            "German" -> {furhat.setInputLanguage(Language.ENGLISH_US, Language.GERMAN)}
            "Arabic" -> {furhat.setInputLanguage(Language.ENGLISH_US, Language.ARABIC)}
            else -> {
                furhat.say{
                    + GesturesLib.ExpressSadness1()
                    + "I'm really sorry but I didn't programmed to have this experiment in ${it.text}."
                    + GesturesLib.ExpressGuilt1()
                    + "But I'll inform my developers to implement ${it.text} language."
                    + GesturesLib.PerformHeadDown()
                    + "Thanks for your interest but I'm going to end this and sleep."
                }
            }
        }
        furhat.voice = Voice(MeetingCharacters[it.text]?.get(0))
        furhat.character = MeetingCharacters[it.text]?.get(1)
        furhat.gesture(GesturesLib.ExpressEmpathy())
        MeetingLearnLanguage[it.text]?.let { languageText -> furhat.say(languageText) }
        MeetingLearnName[it.text]?.get(3)?.let { it1 -> furhat.say(it1) }
        goto(LastCheck)
    }

    onResponse {
        furhat.ask("Sorry didn't understand that. Can you say that again?")
    }
}

//val LearnName: State = state(Parent) {
//    onEntry {
//        furhat.setInputLanguage(Language.ENGLISH_US)
//        MeetingLearnName[users.current.nativeLang]?.get(0)?.let { furhat.ask(it) }
//    }
//
//    onResponse<PersonName> {
//        furhat.gesture(GesturesLib.ExpressInterest1())
//        MeetingLearnName[users.current.nativeLang]?.get(1)?.let { nText -> furhat.say(nText) }
//        furhat.say(it.text)
//        users.current.name = it.text
//        furhat.gesture(GesturesLib.ExpressHappiness1())
//        MeetingLearnName[users.current.nativeLang]?.get(2)?.let { nText -> furhat.say(nText) }
//        furhat.setInputLanguage(Language.ENGLISH_US, Language.TURKISH)
//        goto(LastCheck)
//    }
//
//    onResponse {
//        furhat.ask {
//            + GesturesLib.PerformThoughtful2
//            + "Sorry but I couldn't understand it. Can you say your name again?"
//        }
//    }
//}

val LastCheck: State = state(Parent) {
    onEntry {
        MeetingLastCheck[users.current.nativeLang]?.get(0)?.let { furhat.ask(it) }
    }

    onResponse<Yes> {
        furhat.gesture(GesturesLib.ExpressHappiness1())
        MeetingLastCheck[users.current.nativeLang]?.get(1)?.let { furhat.say(it) }
        goto(Teaching)
    }

    onResponse<No> {
        furhat.say{
            + GesturesLib.PerformSad1
            + GesturesLib.PerformHeadDown()
            + "Oh, ok. If you change your mind I'll be here! "
        }
        goto(Sleeping)
    }

    onResponse {
        furhat.ask {
            + GesturesLib.PerformThoughtful2
            + "Sorry but I couldn't understand it. Can you say your name again?"
        }
    }
}

