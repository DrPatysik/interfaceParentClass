fun main(args:Array<String>){
    println( Player.createPlayer() )
    println( Player.createPlayer() )
}

 class Player private constructor(){
    companion object {
        private var player: Player? = null

        fun createPlayer(): Player {
            if (player == null) {
                player = Player()
            }
            return requireNotNull(player)
        }
    }
 }