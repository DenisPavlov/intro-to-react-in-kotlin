data class MutablePlayer(var score: Int, var name: String)
val player = MutablePlayer(score = 1, name = "Jeff")
player.score = 2
// Now player is MutablePlayer(score=2, name=Jeff)