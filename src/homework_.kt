class Node(val name: String) {
    val node = mutableListOf<Node>()

    fun node(name: String, initialize: (Node.() -> Unit)? = null) {
        val child = Node(name)
        node.add(child)
        if (initialize != null) {
            child.initialize()
        }
    }
}


fun root(createNodes: (Node.() -> Unit)? = null) {}


// create root and node
fun main(args: Array<String>) {
    root {
        node("1") {
            node("3") {
                node("5")
            }
            node("4")
        }
        node("2")
    }
}
