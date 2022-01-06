data class Player(val score: Int, val name: String)
val player = Player(score = 1, name = "Jeff")

val newPlayer = player.copy(score = 2)
// Now player is unchanged, but newPlayer is Player(score=2, name=Jeff)