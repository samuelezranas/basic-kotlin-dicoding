/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihanopsional3

fun manipulateString(str: String, int: Int): String {
    val numberInString = str.filter { it.isDigit() }.toIntOrNull() ?: 0

    val result = numberInString * int

    return if (numberInString != 0) {
        str.replace(Regex("\\d+"), result.toString())
    } else {
        str + int.toString()
    }
}


fun main() {
    println(manipulateString("Dicoding000010", 100) == "Dicoding1000")
    println(manipulateString("dicoding", 99) == "dicoding99")
    println(manipulateString("dicoding123", 10) == "dicoding1230")
}
