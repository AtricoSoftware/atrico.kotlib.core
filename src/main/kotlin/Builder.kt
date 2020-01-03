/**
 * Builder type for immutable object
 */
interface Builder<T> {
    /**
     * Build the object
     */
    fun build(): T
}