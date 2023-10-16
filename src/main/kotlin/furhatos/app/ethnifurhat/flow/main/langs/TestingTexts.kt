package furhatos.app.ethnifurhat.flow.main.langs

//Starting
val StartScript = hashMapOf(
    EN to "Ok. I'll start with reading questions and answers. Please say only the letter of the answer. Thanks! Let's begin."
)

//Ending
val EndingScript = hashMapOf(
    EN to "You nailed it! The test is over. Let's see how you did it!"
)

//True answer
val TrueAnswer = hashMapOf(
    EN to listOf("Correct Answer!", "Well done!", "That's right", "Wu hu! correct")
)

//False answer
val FalseAnswer = hashMapOf(
    EN to listOf("Oh sorry that was wrong!", "Dooot wrong answer!", "Opsie wrong answer", "Unfortunately that was wrong.")
)

//Econ
val QuestionOneEcon = hashMapOf(
    EN to listOf(
        "Question 1: What is disinflation?",
        "A) A rapid increase in the rate of inflation",
        "B) A gradual decrease in the rate of inflation",
        "C) A sudden decrease in the price of goods and services",
        "D) None of the above",
        "B")
)

val QuestionTwoEcon = hashMapOf(
    EN to listOf(
        "Question 2: What can central banks do to achieve disinflation?",
        "A) Lower interest rates",
        "B) Increase government spending",
        "C) Raise interest rates",
        "D) None of the above",
        "C")
)

val QuestionThreeEcon = hashMapOf(
    EN to listOf(
        "Question 3: What are the effects of moderate disinflation?",
        "A) Decreased consumer purchasing power",
        "B) Increased affordability of goods and services",
        "C) Economic stagnation",
        "D) A and C",
        "B")
)

//History
val QuestionOneHistory = hashMapOf(
    EN to listOf(
        "Question 1: Where did Mahmud Pasha defend during the Russo-Turkish War of 1877-1878?",
        "A) Istanbul",
        "B) Plevna (Pleven, Bulgaria)",
        "C) Ankara",
        "D) Athens",
        "B")
)

val QuestionTwoHistory = hashMapOf(
    EN to listOf(
        "Question 2: What is Mahmud Pasha best known for?",
        "A) Leading naval battles",
        "B) Defending Plevna against Russian forces",
        "C) Diplomatic negotiations",
        "D) Building fortifications",
        "B")
)

val QuestionThreeHistory = hashMapOf(
    EN to listOf(
        "Question 3: Why is Mahmud Pasha remembered in history?",
        "A) For surrendering to the enemy",
        "B) For his bravery and the fierce resistance of his troops in the defense of Plevna",
        "C) For his artistic achievements",
        "D) None of the above",
        "B")
)


//Bitcoin
val QuestionOneBitcoin = hashMapOf(
    EN to listOf(
        "Question 1: What is Bitcoin?",
        "A) A centralized digital currency",
        "B) A decentralized digital currency",
        "C) Controlled by a single government",
        "D) None of the above",
        "B")
)

val QuestionTwoBitcoin = hashMapOf(
    EN to listOf(
        "Question 2: How are Bitcoin transactions verified?",
        "A) Through a process called minting",
        "B) Through a process called mining",
        "C) Through a process called printing",
        "D) None of the above",
        "B")
)

val QuestionThreeBitcoin = hashMapOf(
    EN to listOf(
        "Question 3: What is the maximum supply of Bitcoin?",
        "A) 50 million coins",
        "B) 100 million coins",
        "C) 21 million coins",
        "D) 1 million coins",
        "C")
)


//Geography
val QuestionOneGeography = hashMapOf(
    EN to listOf(
        "Question 1: Where is Liberland located?",
        "A) Between France and Germany",
        "B) Along the Danube River, between Croatia and Serbia",
        "C) In South America",
        "D) None of the above",
        "B")
)

val QuestionTwoGeography = hashMapOf(
    EN to listOf(
        "Question 2: Who founded Liberland?",
        "A) Vít Jedlička",
        "B) Elon Musk",
        "C) Angela Merkel",
        "D) None of the above",
        "A")
)

val QuestionThreeGeography = hashMapOf(
    EN to listOf(
        "Question 3: What are the key principles of Liberland?",
        "A) Strong central government",
        "B) Limited government interference, individual rights, and free-market principles",
        "C) Total government control",
        "D) None of the above",
        "B")
)
