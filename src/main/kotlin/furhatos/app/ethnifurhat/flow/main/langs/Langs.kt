package furhatos.app.ethnifurhat.flow.main.langs

import furhatos.flow.kotlin.furhat

val EN = "English"
val TR = "Turkish"
val NL = "Dutch"
val PT = "Portuguese"
val PL = "Polish"
val DE = "German"
val AR = "Arabic"

val DefaultFaceAndVoice = hashMapOf(
    "df" to "Titan",
    "dv" to "Joey-neural",
)

val MeetingCharacters = hashMapOf(
    EN to listOf("Gregory-Neural", "Marty"),
    TR to listOf("Filiz", "Nazar"),
    PL to listOf("Ola-Neural", "Vinnie"),
    PT to listOf("Vitoria-Neural", "Patricia"),
    DE to listOf("Vicki-Neural", "Daniel"),
    AR to listOf("Hala-Neural", "Omar"),
    NL to listOf("Lisa-Neural", "Jane"),
)

val MeetingLearnName = hashMapOf(
    EN to listOf(
        "Now, To be able to provide you a better experience can I learn your name?",
        "Nice to meet you",
        "What a nice name!",
        "Now that we have met, we can start our learning part. I'll try to teach you a topic from history, science, and ideologies and you will be tested after I finish my part. ?"
    ),
    TR to listOf(
        "Şimdi, size daha iyi bir deneyim sunabilmek için adınızı öğrenebilir miyim?",
        "Tanıştığımıza memnun oldum",
        "Ne güzel bir isim!",
        "Artık tanıştığımıza göre öğrenme kısmına başlayabiliriz. Sana tarihten, bilimden, ideolojilerden bir konu öğretmeye çalışacağım ve ben kendi payıma düşeni bitirdikten sonra sınanacaksın. "
        ),
    PL to listOf(
        "Teraz, aby zapewnić Ci lepsze doświadczenie, czy mogę poznać Twoje imię?",
        "Miło mi cię poznać",
        "Jakie ładne imię!",
        "Teraz, gdy się spotkaliśmy, możemy rozpocząć część edukacyjną. Spróbuję nauczyć Cię jakiegoś tematu z historii, nauki i ideologii, a gdy skończę swoją część, zostaniesz poddany próbie."
        ),
    PT to listOf(
        "Agora, para poder proporcionar-lhe uma melhor experiência, posso aprender o seu nome?",
        "Prazer em conhecê-lo",
        "Que nome legal!",
        "Agora que nos conhecemos, podemos começar nossa parte de aprendizado. Tentarei ensinar-lhe um tópico de história, ciência e ideologias e você será testado depois que eu terminar minha parte."
        ),
    DE to listOf(
        "Jetzt, um Ihnen eine bessere Erfahrung bieten zu können, darf ich Ihren Namen erfahren?",
        "Schön, Sie kennenzulernen",
        "Was ein schöner Name!",
        "Nachdem wir uns nun kennengelernt haben, können wir mit unserem Lernteil beginnen. Ich werde versuchen, Ihnen ein Thema aus Geschichte, Wissenschaft und Ideologien beizubringen, und Sie werden geprüft, nachdem ich meinen Teil beendet habe. "
        ),
    AR to listOf(
        "الآن، لكي أتمكن من تقديم تجربة أفضل لك، هل يمكنني معرفة اسمك؟",
        "سُررت بلقائك",
        "ما اسم لطيف!",
        " الآن بعد أن التقينا، يمكننا أن نبدأ الجزء التعليمي الخاص بنا. سأحاول أن أعلمك موضوعًا من التاريخ والعلوم والأيديولوجيات وسيتم اختبارك بعد أن أنهي الجزء الخاص بي."
        ),
    NL to listOf(
        "Nu, om u een betere ervaring te bieden, mag ik uw naam leren kennen?",
        "Leuk om je te ontmoeten",
        "Wat een mooie naam!",
        "Nu we elkaar hebben ontmoet, kunnen we beginnen met ons leergedeelte. Ik zal proberen je een onderwerp uit de geschiedenis, wetenschap en ideologieën te leren en je zult op de proef worden gesteld nadat ik mijn deel heb afgerond."
        ),
)

val MeetingLastCheck = hashMapOf(
    EN to listOf("Are you ready", "Then let's begin! Good luck!"),
    TR to listOf("Hazır mısın?", "O zaman başlayalım! İyi şanslar!"),
    PL to listOf("Jesteś gotowy?", "No to zaczynajmy! Powodzenia!"),
    PT to listOf("Você está pronto?", "Então, vamos começar! Boa sorte!"),
    DE to listOf("Sind Sie bereit?", "Dann lasst uns beginnen! Viel Erfolg!"),
    AR to listOf(" هل أنت جاهز؟", "ثم لنبدأ! حظًا سعيدًا!"),
    NL to listOf("Ben je klaar?", "Laten we dan beginnen! Veel succes!"),
)

val MeetingLearnLanguage = hashMapOf(
    EN to "Perfect! Everything set!",
    TR to "Mükemmel! Her şey hazır!",
    PL to "Doskonale! Wszystko gotowe!",
    PT to "Perfeito! Tudo pronto!",
    DE to "Perfekt! Alles bereit!",
    AR to "ممتاز! كل شيء جاهز!",
    NL to "Perfect! Alles klaar!",
)