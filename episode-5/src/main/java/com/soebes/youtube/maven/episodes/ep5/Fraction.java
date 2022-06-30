package com.soebes.youtube.maven.episodes.ep5;

record Fraction(int numerator, int denominator) {
  Fraction add(Fraction sum2) {
    if (denominator == sum2.denominator) {
      return new Fraction(this.numerator + sum2.numerator, this.denominator);
    } else {
      return new Fraction(1, 1);
    }
  }
}
