/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class KotlinerMeta(
    var kotlinerId: Long? = null,
    var id: Long? = null,
    var metaKey: String? = null,
    var metaValue: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("KotlinerMeta (")

        sb.append(kotlinerId)
        sb.append(", ").append(id)
        sb.append(", ").append(metaKey)
        sb.append(", ").append(metaValue)

        sb.append(")")
        return sb.toString()
    }
}
