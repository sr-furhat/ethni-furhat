package furhatos.app.ethnifurhat.flow.main.facesandvoices

const val EN = "English"
const val TR = "Turkish"
const val NL = "Dutch"
const val PT = "Portuguese"
const val PL = "Polish"
const val DE = "German"
const val AR = "Arabic"

const val MALE = "Rod22k_HQ"
const val FEMALE = "Sharon22k_HQ"

val DefaultFaceAndVoice = hashMapOf(
    "df" to "Titan",
    "dv" to "Ryan22k_HQ",
)

val MeetingCharacters = hashMapOf(
    EN to listOf(MALE, "Marty"),
    TR to listOf(FEMALE, "Nazar"),
    PL to listOf(FEMALE, "Vinnie"),
    PT to listOf(FEMALE, "Patricia"),
    DE to listOf(FEMALE, "Jane"),
    AR to listOf(MALE, "Omar"),
    NL to listOf(FEMALE, "Jane"),
)

val DutchVoice = "test"