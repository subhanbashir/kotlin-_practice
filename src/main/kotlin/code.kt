fun takesMultipleFunctions(input: String, vararg fns: (String) -> String): String =
    fns.fold(input){ carry, fn -> fn(carry)
    }

fun main(args: Array<String>) {
    println(
        takesMultipleFunctions(
            "this is a test",
            { s -> s.toUpperCase() },
            { s -> s.replace(" ", "_") },
            {s -> s.substring(2,14)},
            {s -> s+"subhan"}
        )
    )
    // Prints: THIS_IS_A_TEST
}