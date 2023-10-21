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
    var wrongAnswers: List<String>? = null
    onEntry {
        val questionone = QuestionOneEcon[users.current.nativeLang]
        val text1 = questionone?.get("question")
        correctAnswer = QuestionOneEcon[users.current.nativeLang]?.get("answer") as? String
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
        } else {
            if (userResponse in wrongAnswers ?: emptyList()) {
                furhat.say("That's not the correct answer. The correct answer is $correctAnswer.")
                goto(Question2_eco)
            } else {
                furhat.say("Please use 1 2 3 or 4!")
                furhat.gesture(GesturesLib.PerformSad1)
                delay(300)
                reentry()
            }
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
        goto(Question3_eco)
    }
    onResponse{
        val userResponse = it.text.trim()
        if (userResponse.equals(correctAnswer2, ignoreCase = true)) {
            furhat.say("Well Done")
            furhat.gesture(GesturesLib.ExpressSympathy1())
            furhat.gesture(GesturesLib.PerformSmile1)
            goto(Question3_eco)
        } else {
            furhat.say("That's not the correct answer. The correct answer is $correctAnswer2.")
            goto(Question3_eco)

        }
    }
}
val Question3_eco: State = state(Parent) {
    var correctAnswer3: String? = null
    onEntry {
        val question_three = QuestionThreeEcon[users.current.nativeLang]
        val text3 = question_three?.get("question3")
        correctAnswer3 = QuestionThreeEcon[users.current.nativeLang]?.get("answer1")
        if (text3 is String) {
            furhat.ask(text3)
            furhat.gesture(GesturesLib.PerformThoughtful1)
            delay(300)
        }
        val QuestionDone = EconQuestionDone[users.current.nativeLang]
        if (QuestionDone != null) {
            furhat.say(QuestionDone)
        }
    }
    onResponse{
        val userResponse = it.text.trim()
        if (userResponse.equals(correctAnswer3, ignoreCase = true)) {
            furhat.say("Well Done")
            furhat.gesture(GesturesLib.ExpressSympathy1())
            furhat.gesture(GesturesLib.PerformSmile1)
            countt++
        } else {
            furhat.say("That's not the correct answer. The correct answer is $correctAnswer3.")

        }
    }
}






