# Race Condition in a Simple Counter

This repository demonstrates a race condition in a simple Java counter class.  The `increment()` method is not thread-safe, leading to inaccurate counts when accessed concurrently by multiple threads.

## The Problem

The `Counter` class has a `count` variable and an `increment()` method that increments this variable.  If multiple threads call `increment()` simultaneously, the final count may be lower than expected, as increments might be overwritten.

## The Solution

The solution involves using appropriate synchronization mechanisms to ensure that only one thread can access and modify the `count` variable at a time.  This is achieved using the `synchronized` keyword.