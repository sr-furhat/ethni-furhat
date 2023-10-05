package furhatos.app.ethnifurhat.flow.main

import furhat.libraries.standard.GesturesLib
import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.voice.Voice
import furhatos.nlu.common.*

val Meeting: State = state {
    onEntry {
        furhat.say{
            + "First of all hi! I'm Furhat. I'm one of the most advanced social robots out there!"
            + GesturesLib.PerformSmile1
            + "I can change my face in a second like this"
        }
        furhat.character = "Fernando"
        delay(200)
        furhat.say("Or I can make my face like this")
        furhat.character = "Nazar"
        delay(200)
        furhat.say("Or I can become a character from an Anime")
        furhat.character = "AnimePink"
        delay(200)
        furhat.character = "Jane"
        furhat.say("The only thing that I can change is not my face. At the same time ")
        furhat.voice = Voice("Justin-Neural")
        furhat.say("I can change my voice and language too!")
        furhat.voice = Voice("Lisa-Neural")
        furhat.say("Hallo daar, ik ben een sociaal intelligente robot")
        furhat.voice = Voice("Amy-neural")
        furhat.say("Enough me. Let's know from you a bit. What is your name?") //Todo
        delay(200) //Todo
        furhat.say("And where are you from [Name]") //Todo
        furhat.say("Nice to meet you [Name]. You know what. I'll change my language and my face in order to make you feel more comfortable.")
        furhat.character = "Nazar"
        furhat.voice = Voice("Filiz")
        furhat.say("işte böyle artık daha rahat konuşabiliriz")
    }

    onResponse<No> {  }
}