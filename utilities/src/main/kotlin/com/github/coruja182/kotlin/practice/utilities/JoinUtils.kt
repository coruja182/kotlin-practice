/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.github.coruja182.kotlin.practice.utilities

import com.github.coruja182.kotlin.practice.list.LinkedList

class JoinUtils {
    companion object {
        fun join(source: LinkedList): String {
            val result = StringBuilder()
            for (i in 0 until source.size()) {
                if (result.isNotEmpty()) {
                    result.append(" ")
                }
                result.append(source.get(i))
            }

            return result.toString()
        }
    }
}
