class Set {
    var isEmpty: Boolean = true
    var setItems: List<Item> = listOf()

    fun addItem(item: Item? = null) {
        if (item != null) {
            setItems += item
        }
        isEmpty = false
    }

    fun removeItem(item: Item? = null) {
        if (item != null && setItems.contains(item)) {
            setItems -= item
        }

        isEmpty = true
    }

    fun contains(item: Item): Boolean {
        for (obj in setItems) {
            if (obj === item) {
                return true
            }
        }
        return false
    }
}

data class Item(val id: Int) {}
