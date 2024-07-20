package com.sunnyswag.core.tinyhandler

import java.util.concurrent.ConcurrentLinkedQueue

class MessageManager {
    private val recycledQueue: ConcurrentLinkedQueue<Message> = ConcurrentLinkedQueue()
    private val msgQueue: ConcurrentLinkedQueue<Message> = ConcurrentLinkedQueue()
}