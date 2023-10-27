package furhatos.app.ethnifurhat.flow.main.facesandvoices

const val EN = "English"
const val TR = "Turkish"
const val NL = "Dutch"
const val PT = "Portuguese"
const val PL = "Polish"
const val DE = "German"
const val AR = "Arabic"

val DefaultFaceAndVoice = hashMapOf(
    "df" to "Titan",
    "dv" to "Joey-neural",
)

val MeetingCharacters = hashMapOf(
    EN to listOf("Gregory-Neural", "Marty"),
    TR to listOf("Kendra-Neural", "Nazar"),
    PL to listOf("Kendra-Neural", "Vinnie"),
    PT to listOf("Kendra-Neural", "Patricia"),
    DE to listOf("Kendra-Neural", "Jane"),
    AR to listOf("Gregory-Neural", "Omar"),
    NL to listOf("Kendra-Neural", "Jane"),
)

val DutchVoice = "test"