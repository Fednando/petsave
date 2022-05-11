package br.com.aula.petsave

import io.reactivex.disposables.Disposable
import org.junit.Test

import org.junit.Assert.*
import io.reactivex.subjects.BehaviorSubject
import java.lang.StringBuilder


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//        val pSubject = BehaviorSubject.create<Int>()
//        pSubject.onNext(0)
//
//
//        pSubject.subscribe({ it: Int -> println("Observer 1 onNext: $it") },
//            { error: Throwable? -> }, {}
//        ) { on1: Disposable? -> println("Observer 1 onSubscribe") }
//
//        pSubject.onNext(1)
//        pSubject.onNext(2)
//
//
//        pSubject.subscribe({ it: Int -> println("Observer 2 onNext: $it") },
//            { error: Throwable? -> }, {}
//        ) { on1: Disposable? -> println("Observer 2 onSubscribe") }
//
//        pSubject.onNext(3)
//        pSubject.onNext(4)

        val result1 = StringBuilder()
        val result2 = StringBuilder()
        val subject = BehaviorSubject.create<String>()
        subject.subscribe { value: String? ->
            result1.append(value)
        }
        subject.onNext("a")
        subject.onNext("b")
        subject.onNext("c")
        subject.subscribe { value: String? ->
            result2.append(value)
        }
        subject.onNext("d")
        subject.onComplete()
        //Output will be abcd
        //Output will be abcd
        println(result1)
        //Output will be cd being BehaviorSubject
        //(c is last item emitted before subscribe)
        //Output will be cd being BehaviorSubject
        //(c is last item emitted before subscribe)
        println(result2)


    }
}