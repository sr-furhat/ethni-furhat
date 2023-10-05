package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.BehaviorLib
import furhat.libraries.standard.BehaviorLib.behaviorLib
import furhat.libraries.standard.GesturesLib
import furhat.libraries.standard.NluLib
import furhatos.app.ethnifurhat.flow.Parent
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.gestures.Gestures
import furhatos.nlu.common.*
import furhatos.util.Language

val Meeting: State = state(Parent) {
    onEntry {
        goto(FirstContact)
    }

    onResponse<PersonName> {
        furhat.say("Nice to meet you ${it.text}")
    }
}

val FirstContact: State = state(Parent) {
    onEntry {
        furhat.say("First of all hi! I'm Furhat")
        delay(200)
        furhat.say("I'm one of the most advanced social robots out there!")
        furhat.gesture(GesturesLib.ExpressSmileCongratulatory1(), async = false)
        furhat.say("I can change my face in a second like this")

        delay(500)
        furhat.character = "Kione"
        delay(500)
        furhat.say("should I give you another example")


        delay(1000)
        furhat.character = "Nazar"
        delay(500)
        furhat.say("How about this one?")



        delay(1000)
        furhat.character = "Jane"
        delay(500)
        furhat.say {
            +"And here are some of my gestures"
            +blocking {
                furhat.gesture(GesturesLib.ExpressConfusion1(), async = false)
                furhat.gesture(GesturesLib.ExpressFear1(), async = false)
                furhat.gesture(GesturesLib.ExpressAnger2(), async = false)
            }
            +"how about that?"
        }
        delay(100)

        furhat.say("The only thing that I can change is not my face. At the same time ")
        furhat.voice = Voice("Justin-Neural")
        furhat.say("I can change my voice and language too!")
        delay(100)

        furhat.voice = Voice("Lisa-Neural")
        furhat.say("Hallo daar, ik ben een sociaal intelligente robot. Ik spreek vloeiend Nederlands!")
        delay(200)

        furhat.voice = Voice("Amy-neural")
        goto(LearnLanguage)
    }
}

val LearnLanguage: State = state(Parent) {
    onEntry {
        furhat.ask("Enough me. Let's know from you a bit. What is your native language?")
    }

    onResponse<NluLib.SpokenLanguages> {
        val language = it.text

        furhat.say{
            + GesturesLib.ExpressThinking()
            + "Oh you speak $language huh. Let's continue with $language then!"}

        when (language) {
            "Dutch" -> {
                furhat.setInputLanguage(Language.ENGLISH_US, Language.DUTCH)
                furhat.voice = Voice("Lisa-Neural")
                furhat.say{
                    + GesturesLib.ExpressEmpathy()
                    + "Hallo daar, ik ben een sociaal intelligente robot. Ik spreek vloeiend Nederlands!"}

            }
            "Turkish" -> {
                furhat.setInputLanguage(Language.ENGLISH_US, Language.TURKISH)
                furhat.character = "Nazar"
                furhat.voice = Voice("Filiz")
                furhat.say{
                    + GesturesLib.ExpressEmpathy()
                    + "Merhaba, ben konuşan bir robotum!"}
            }
            "Polish" -> {
                furhat.setInputLanguage(Language.ENGLISH_US, Language.POLISH)
                furhat.character = "Vinnie"
                furhat.voice = Voice("Ola-Neural")
                furhat.say("Cześć, jestem mówiącym robotem!")
            }
            "Portuguese" -> {
                furhat.setInputLanguage(Language.ENGLISH_US, Language.PORTUGUESE_BR, Language.PORTUGUESE_PT)
                furhat.voice = Voice("Vitoria-Neural")
                furhat.character = "Patricia"
                furhat.say("Olá, eu sou um robô falante.")
            }
            "English" -> {
                furhat.voice = Voice("Gregory-Neural")
                furhat.character = "Marty"
                furhat.say("Perfect!")
            }
            "German" -> {
                furhat.setInputLanguage(Language.ENGLISH_US, Language.GERMAN)
                furhat.character = "Daniel"
                furhat.voice = Voice("Vicki-Neural")
                furhat.say("Hallo, ich bin ein sprechender Roboter!")
            }
            "Arabic" -> {
                furhat.setInputLanguage(Language.ENGLISH_US, Language.ARABIC)
                furhat.character = "Omar"
                furhat.voice = Voice("Hala-Neural")
                furhat.say("مرحبا , أنا روبوت متكلم!")
            }
            else -> {
                furhat.say{
                    + GesturesLib.ExpressSadness1()
                    + "I'm really sorry but I didn't programmed to have this experiment in $language."
                    + GesturesLib.ExpressGuilt1()
                    + "But I'll inform my developers to implement $language language."
                    + GesturesLib.PerformHeadDown()
                    + "Thanks for your interest but I'm going to end this and sleep."
                }
            }
        }
    }

    onResponse {
        furhat.ask("Sorry didn't understand that. Can you say that again?")
    }
}