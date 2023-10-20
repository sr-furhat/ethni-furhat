package furhatos.app.ethnifurhat.flow.main
import furhat.libraries.standard.GesturesLib
import furhatos.app.ethnifurhat.setting.nativeLang

import furhatos.app.ethnifurhat.flow.Parent
import furhatos.app.ethnifurhat.flow.main.langs.*
import furhatos.flow.kotlin.*

import furhatos.nlu.common.*


val Testing: State = state(Parent) {
    onEntry {
        val StartScript  = StartScript[users.current.nativeLang]
        if (StartScript != null) {
            furhat.say(StartScript)
            furhat.gesture(GesturesLib.PerformSmile1)
            delay(300)
            goto(Question1_eco)
        }
    }
}
//asking questions about econ
var countt: Int = 0;
val Question1_eco: State = state(Parent) {
    var correctAnswer: String? = null
    onEntry {
        val questionone = QuestionOneEcon[users.current.nativeLang]
        val question_third = QuestionThreeEcon[users.current.nativeLang]
        val text1 = questionone?.get("question")
        correctAnswer = QuestionOneEcon[users.current.nativeLang]?.get("answer")
        if (text1 is String) {
            furhat.ask(text1)
            furhat.gesture(GesturesLib.PerformThoughtful1)
            delay(300)
        }
        goto(Question2_eco)

    }
    onResponse {
        val userResponse = it.text.trim()
        if (userResponse.equals(correctAnswer, ignoreCase = true)) {
            furhat.say("Your Answer is Correct! Well done!")
            furhat.gesture(GesturesLib.PerformSmile1)
            delay(300)
            goto(Question2_eco)

        }
        else {
            furhat.say("That's not the correct answer. The correct answer is $correctAnswer.")
            furhat.gesture(GesturesLib.PerformSad1)
            delay(300)
            goto(Question2_eco)

        }

    }
}
val Question2_eco: State = state(Parent) {
    var correctAnswer2: String? = null
    onEntry {
        val question_two = QuestionTwoEcon[users.current.nativeLang]
        val text2 = question_two?.get("question1") as? String
        correctAnswer2 = QuestionTwoEcon[users.current.nativeLang]?.get("answer1") as? String
        if (text2 is String) {
            furhat.ask(text2)
            furhat.gesture(GesturesLib.PerformThoughtful1)
            delay(300)
        }
    }
    onResponse{
        val userResponse = it.text.trim()
        if (userResponse.equals(correctAnswer2, ignoreCase = true)) {
            furhat.say("Well Done")
            furhat.gesture(GesturesLib.ExpressSympathy1())
            furhat.gesture(GesturesLib.PerformSmile1)
            countt++
        } else {
            furhat.say("That's not the correct answer. The correct answer is $correctAnswer2.")

        }
    }
}





