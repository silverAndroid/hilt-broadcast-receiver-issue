package dev.rururu.hiltbroadcastreceivertest

import javax.inject.Inject

class InjectableClass @Inject constructor() {
    val value = 42
}