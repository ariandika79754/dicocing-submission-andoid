package com.hardeka.dicoding

object BelajarData {
    private val database = arrayOf(
        arrayOf(
            "Kotlin Language",
            "Use for: Android Language",
            "Device: Linux, Windows, MacOS",
            "Kotlin is a cross-platform, statically typed, general-purpose high-level programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise.",
            " 2016",
            " Supported",
            R.drawable.kotlen, //image row and title for detail
            R.drawable.satu, //image background for detail
            R.drawable.dua, //image for aesthetic
            "https://kotlinlang.org/"
        ),
        arrayOf(
            "C Language",
            "Use for: General Purpose Programming",
            "Device: Linux, Windows, MacOS",
            "C is a general-purpose computer programming language. It was created in the 1970s by Dennis Ritchie, and remains very widely used and influential. By design, C's features cleanly reflect the capabilities of the targeted CPUs.",
            " 1972",
            " Supported",
            R.drawable.c,
            R.drawable.dua,
            R.drawable.tiga,
            "https://en.wikipedia.org/wiki/C_(programming_language)"
        ),
        arrayOf(
            "C++  Language",
            "Use for: Functional Programming",
            "Device: Linux, Windows, MacOS",
            "C++ was created by Danish computer scientist Bjarne Stroustrup as an extension of the C language, with features such as object-oriented, generic, and functional programming.",
            " 1985",
            " Supported",
            R.drawable.cplus,
            R.drawable.tiga,
            R.drawable.empat,
            "https://en.wikipedia.org/wiki/C%2B%2B"
        ),
        arrayOf(
            "Dart Language",
            "Use for: Cross Platform",
            "Device: Linux, Windows, MacOS",
            "Dart is a programming language designed by Lars Bak and Kasper Lund and developed by Google. The programming language can be used to develop web and mobile apps as well as server and desktop applications. It is an object-oriented, class-based, garbage-collected language with C-style syntax.",
            " 2011",
            " Supported",
            R.drawable.dart1,
            R.drawable.empat,
            R.drawable.lima,
            "https://dart.dev/"
        ),
        arrayOf(
            "Java Language",
            "use for: Multi-paradigm",
            "Device: Linux, Windows, MacOS",
            "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.",
            " 1995",
            " Supported",
            R.drawable.java1,
            R.drawable.lima,
            R.drawable.enam,
            "https://www.java.com/"
        ),
        arrayOf(
            "Node.js",
            "Use for: Cross platform",
            "Device: Linux, Windows, MacOS",
            "Node.js is a cross-platform, open-source server environment that can run on Windows, Linux, Unix, macOS, and more. Node.js is a back-end JavaScript runtime environment, runs on the V8 JavaScript engine, and executes JavaScript code outside a web browser.",
            " 2009",
            " Supported",
            R.drawable.node,
            R.drawable.enam,
            R.drawable.tujuh,
            "https://nodejs.org/en"
        ),
        arrayOf(
            "PHP Language",
            "Use for: Multi-paradigm",
            "Device: Linux, Windows, MacOS",
            "PHP is a general-purpose scripting language geared towards web development. It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1993 and released in 1995. The PHP reference implementation is now produced by the PHP Group.",
            " 1995",
            " Supported",
            R.drawable.php,
            R.drawable.tujuh,
            R.drawable.delapan,
            "https://www.php.net/"
        ),
        arrayOf(
            "Python Language",
            "Use for: Multi-paradigm",
            "Device: Linux, Windows, MacOS",
            "Python is a high-level, general-purpose programming language. Its design philosophy emphasizes code readability with the use of significant indentation. Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured, object-oriented and functional programming.",
            " 1991",
            " Supported",
            R.drawable.python,
            R.drawable.delapan,
            R.drawable.sembilan,
            "https://www.python.org/"
        ),
        arrayOf(
            "Swift Language",
            "Use for: Multi-paradigm",
            "Device: MacOS",
            "Swift is a high-level general-purpose, multi-paradigm, compiled programming language developed by Apple Inc. and the open-source community.",
            " 2014",
            " Mac only",
            R.drawable.swift,
            R.drawable.sembilan,
            R.drawable.sepuluh,
            "https://swift.org/"
        ),
        arrayOf(
            "Scala Language",
            "Use for: General Purpose Programming",
            "Device: Linux, Windows, MacOS",
            "Scala is a strong statically typed high-level general-purpose programming language that supports both object-oriented programming and functional programming. Designed to be concise, many of Scala's design decisions are aimed to address criticisms of Java.",
            " 2004",
            " Supported",
            R.drawable.scala2,
            R.drawable.satu,
            R.drawable.empat,
            "https://www.scala-lang.org/"
        )
    )

    val listData: ArrayList<BelajarLang>
        get(){
            val list = ArrayList<BelajarLang>()
            for (data in database) {
                val belajarLang = BelajarLang()
                belajarLang.name = data[0] as String
                belajarLang.usefor = data[1] as String
                belajarLang.device = data[2] as String
                belajarLang.explain = data[3] as String
                belajarLang.year = data[4] as String
                belajarLang.laptop = data[5] as String
                belajarLang.pic1 = data[6] as Int
                belajarLang.background = data[7] as Int
                belajarLang.pic2 = data[8] as Int
                belajarLang.belajarlink = data[9] as String

                list.add(belajarLang)
            }
            return list
        }

}