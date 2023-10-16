package furhatos.app.ethnifurhat.flow.main.langs

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
    DE to listOf("Vicki-Neural", "Jane"),
    AR to listOf("Hala-Neural", "Omar"),
    NL to listOf("Lisa-Neural", "Jane"),
)

val MeetingLastCheck = hashMapOf(
    EN to listOf(
        "Now that we have met, we can start our learning part. I'll try to teach you a topic from history, science, and ideologies and you will be tested after I finish my part.",
        "Are you ready",
        "Then let's begin! Good luck!"),
    TR to listOf(
        "Artık tanıştığımıza göre öğrenme kısmına başlayabiliriz. Sana tarihten, bilimden, ideolojilerden bir konu öğretmeye çalışacağım ve ben kendi payıma düşeni bitirdikten sonra sınanacaksın. ",
        "Hazır mısın?",
        "O zaman başlayalım! İyi şanslar!"),
    PL to listOf(
        "Teraz, gdy się spotkaliśmy, możemy rozpocząć część edukacyjną. Spróbuję nauczyć Cię jakiegoś tematu z historii, nauki i ideologii, a gdy skończę swoją część, zostaniesz poddany próbie.",
        "Jesteś gotowy?",
        "No to zaczynajmy! Powodzenia!"),
    PT to listOf(
        "Você está pronto?",
        "Então, vamos começar! Boa sorte!",
        "Agora que nos conhecemos, podemos começar nossa parte de aprendizado. Tentarei ensinar-lhe um tópico de história, ciência e ideologias e você será testado depois que eu terminar minha parte."),
    DE to listOf(
        "Nachdem wir uns nun kennengelernt haben, können wir mit unserem Lernteil beginnen. Ich werde versuchen, Ihnen ein Thema aus Geschichte, Wissenschaft und Ideologien beizubringen, und Sie werden geprüft, nachdem ich meinen Teil beendet habe. ",
        "Sind Sie bereit?",
        "Dann lasst uns beginnen! Viel Erfolg!"),
    AR to listOf(
        " الآن بعد أن التقينا، يمكننا أن نبدأ الجزء التعليمي الخاص بنا. سأحاول أن أعلمك موضوعًا من التاريخ والعلوم والأيديولوجيات وسيتم اختبارك بعد أن أنهي الجزء الخاص بي.",
        " هل أنت جاهز؟",
        "ثم لنبدأ! حظًا سعيدًا!"),
    NL to listOf(
        "Nu we elkaar hebben ontmoet, kunnen we beginnen met ons leergedeelte. Ik zal proberen je een onderwerp uit de geschiedenis, wetenschap en ideologieën te leren en je zult op de proef worden gesteld nadat ik mijn deel heb afgerond.",
        "Ben je klaar?",
        "Laten we dan beginnen! Veel succes!"),
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

val SorryNoUnderstand = hashMapOf(
    EN to "Sorry didn't understand that. Can you say that again?",
    TR to "Üzgünüm bunu anlamadım. Tekrar söyleyebilir misin?",
    PL to "Przepraszam, nie zrozumiałem tego. Czy możesz to powtórzyć?",
    PT to "Desculpe, não entendi isso. Você pode dizer isso de novo?",
    DE to "Tut mir leid, das habe ich nicht verstanden. Kannst du das nochmal sagen?",
    AR to "آسف لم أفهم ذلك. أيمكنك أن تعيد ما قلت؟",
    NL to "Sorry begreep dat niet. Kan je dat herhalen?",
)