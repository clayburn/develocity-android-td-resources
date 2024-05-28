package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

abstract class ResourceLocatingUnitTest {
    @Test
    fun `test resource should exist`() {
        assertEquals(
            "foo", this::class.java.classLoader!!
                .getResource("com/example/myapplication/test.txt")
                .readText()
        )
    }
}