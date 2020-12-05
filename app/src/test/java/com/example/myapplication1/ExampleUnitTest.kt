package com.example.myapplication1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val ann = Person(name = "Ann", growth = 150, age = 15)

    val jane = Person(name = "Jane", growth = 170, age = 17)

    var collection = listOf(ann, jane)

    @Test

    fun start() {
        print(collection.sort())
    }

    fun List<Person>.sort: List<Person> {
        return sortedWith(compareBy(Person::age))
    }
}