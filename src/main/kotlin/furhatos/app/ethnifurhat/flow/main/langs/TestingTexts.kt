package furhatos.app.ethnifurhat.flow.main.langs

//Starting
val StartScript = hashMapOf(
    EN to "Ok. I'll start with reading questions and answers. Please say only the Number of the answer like 1 2 3 or 4. Thanks! Let's begin.",
    DE to "",
    TR to "",
    NL to ""
)

//Ending
val EndingScript = hashMapOf(
    EN to "You nailed it! The test is over. Let's see how you did it!",
    DE to "",
    TR to "",
    NL to ""
)

//True answer
val TrueAnswer = hashMapOf(
    EN to listOf("Correct Answer!", "Well done!", "That's right", "Wu hu! correct"),
    DE to "",
    TR to "",
    NL to ""
)

//False answer
val FalseAnswer = hashMapOf(
    EN to listOf("Oh sorry that was wrong!", "Dooot wrong answer!", "Opsie wrong answer", "Unfortunately that was wrong."),
    DE to "",
    TR to "",
    NL to ""
)

//Econ
val QuestionOneEcon = hashMapOf(
    EN to hashMapOf(
        "question" to "Question 1: What is disinflation?\n" +
                "1-) A rapid increase in the rate of inflation.\n" +
                "2-) A gradual decrease in the rate of inflation.\n" +
                "3-) A sudden decrease in the price of goods and services.\n" +
                "4-) None of the above.\n",
        "answer" to "2",
        "wrong" to listOf("1","3","4")//listOf("two","second","2","decrease in the rate of inflation")
    ),
    DE to hashMapOf(
        "question" to "Frage 1: Was ist Deflation?\n" +
                "1-) Ein schneller Anstieg der Inflationsrate.\n" +
                "2-) Ein allmählicher Rückgang der Inflationsrate.\n" +
                "3-) Ein plötzlicher Rückgang der Preise für Waren und Dienstleistungen.\n" +
                "4-) Keine der oben genannten.\n",
        "answer" to 2
    ),
    TR to hashMapOf(
        "question" to "Soru 1: Enflasyon nedir?\n" +
                "1-) Enflasyon hızında hızlı bir artışı.\n" +
                "2-) Enflasyon hızında kademeli bir azalma.\n" +
                "3-) Mal ve hizmetlerin fiyatlarında ani bir düşüş.\n" +
                "4-) Yukarıdakilerin hiçbiri.\n",
        "answer" to 2
    ),
    NL to hashMapOf(
        "question" to "Vraag 1: Wat is desinflatie?\n" +
                "1-) Een snelle stijging van het inflatiepercentage.\n" +
                "2-) Een geleidelijke daling van het inflatiepercentage.\n" +
                "3-) Een plotselinge daling van de prijzen van goederen en diensten.\n" +
                "4-) Geen van bovenstaande.\n",
        "answer" to 4
    )
)


val QuestionTwoEcon = hashMapOf(
    EN to hashMapOf(
        "question1" to "Question 2: What can central banks do to achieve disinflation?\n" +
                "1-) Lower interest rates.\n" +
                "2-) Increase government spending.\n" +
                "3-) Raise interest rates.\n" +
                "4-) None of the above.\n",
        "answer1" to "3"
    ),
    DE to hashMapOf(
        "question1" to "Frage 2: Was können Zentralbanken tun, um Deflation zu erreichen?\n" +
                "A) Zinssätze senken\n" +
                "B) Staatsausgaben erhöhen\n" +
                "C) Zinssätze erhöhen\n" +
                "D) Keines von alledem\n",
        "answer" to listOf("c", "C", "zinssätze erhöhen") // List of accepted variations
    ),
    TR to hashMapOf(
        "question1" to "Soru 2: Enflasyonu düşürmek için merkez bankaları ne yapabilir?\n" +
                "A) Faiz oranlarını düşürebilir\n" +
                "B) Hükümet harcamalarını artırabilir\n" +
                "C) Faiz oranlarını yükseltebilir\n" +
                "D) Yukarıdakilerin hiçbiri\n",
        "answer1" to listOf("c", "C", "faiz oranlarını yükseltebilir") // List of accepted variations
    ),
    NL to hashMapOf(
        "question1" to "Vraag 2: Wat kunnen centrale banken doen om desinflatie te bereiken?\n" +
                "A) Rente verlagen\n" +
                "B) Overheidsuitgaven verhogen\n" +
                "C) Rente verhogen\n" +
                "D) Geen van bovenstaande\n",
        "answer1" to listOf("c", "C", "rente verhogen") // List of accepted variations
    )
)


val QuestionThreeEcon = hashMapOf(
    EN to hashMapOf(
        "question2" to "Question 3: What are the effects of moderate disinflation?\n"+
            "A) Decreased consumer purchasing power.\n"+
            "B) Increased affordability of goods and services.\n"+
            "C) Economic stagnation.\n"+
            "D) A and C.\n",
        "answer2" to "2"),

)

val EconQuestionDone = hashMapOf(
    EN to "Well done! Lets move to the History Questions"
)

//History
val QuestionOneHistory = hashMapOf(
    EN to listOf(
        "Question 1: Where did Mahmud Pasha defend during the Russo-Turkish War of 1877-1878?\n"+
        "A) Istanbul\n"+
        "B) Plevna (Pleven, Bulgaria)\n"+
        "C) Ankara\n"+
        "D) Athens\n"),
        //"B"),
    DE to "",
    TR to "",
    NL to ""
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
