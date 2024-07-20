package com.sunnyswag.core.tinyhandler

data class Message(
    val what: Int = 0,
    val arg1: Int = 0,
    val arg2: Int = 0,
    val obj: Any = Any(),
    val timeToExecute: Long = 0L,
    val target: Handler,
    val callback: Runnable,
    val priority: Priority = Priority.Low
)

enum class Priority {
    High,
    Medium,
    Low
}