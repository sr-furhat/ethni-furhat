package furhatos.app.ethnifurhat.flow.main.facesandvoices

const val EN = "English"
const val TR = "Turkish"
const val NL = "Dutch"
const val PT = "Portuguese"
const val PL = "Polish"
const val DE = "German"
const val AR = "Arabic"

// ROBOT

//const val MALE = "Rod22k_HQ"
//const val FEMALE = "Sharon22k_HQ"
//
//val DefaultFaceAndVoice = hashMapOf(
//    "df" to "Titan",
//    "dv" to "Ryan22k_HQ",
//)
//
//val DutchVoice = "test" //MUST BE CHANGED
//const val DifferentVoice = "Justin-Neural" //MUST BE CHANGED

// VIRTUAL

const val MALE = "Gregory-Neural"
const val FEMALE = "Kendra-Neural"

val DefaultFaceAndVoice = hashMapOf(
    "df" to "Titan",
    "dv" to "Joey-neural",
)

const val DifferentVoice = "Justin-Neural"
const val DutchVoice = "Laura-Neural"

val MeetingCharacters = hashMapOf(
    EN to listOf(MALE, "Marty"),
    TR to listOf(FEMALE, "Nazar"),
    PL to listOf(FEMALE, "Vinnie"),
    PT to listOf(FEMALE, "Patricia"),
    DE to listOf(MALE, "James"),
    AR to listOf(MALE, "Omar"),
    NL to listOf(FEMALE, "Jane"),
)



