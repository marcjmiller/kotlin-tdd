import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/*
*
* Step 1 - New Set is empty
* Step 2 - Add switches to not empty
* Step 3 - Remove returns to empty
* Step 4 - Add a single object
* Step 5 - Refactor tests
* Step 6 - Remove takes object away
*   ^^^^^^^^^^^^^^^^^
* Step 7 - Add many objects
* Step 8 - Refactor emptiness, contains, null check
* Step 9 - Remove many
* Step 10 - Refactor indexOf
* Step 11 - No duplicates
* Step 12 - Any size
*
* */

class SetTest {
    var set = Set()
    val setItem = Item(1)

    @Test
    fun `Step 1 & 2 & 3 - item manipulation with emptiness`() {
        assertTrue(set.isEmpty)

        set.addItem()
        assertFalse(set.isEmpty)

        set.removeItem()
        assertTrue(set.isEmpty)
    }

    @Test
    fun `Step 4 - set contains a single object`() {
        set.addItem(setItem)

        assertFalse(set.isEmpty)
        assertTrue(set.contains(setItem))
    }

    @Test
    fun `Step 6 - set loses object upon removal`() {
        set.removeItem(setItem)

        set.addItem(setItem)
        assertTrue(set.contains(setItem))

        set.removeItem(setItem)
        assertFalse(set.contains(setItem))
        assertTrue(set.isEmpty)
    }
}
