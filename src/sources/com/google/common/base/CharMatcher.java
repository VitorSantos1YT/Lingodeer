package com.google.common.base;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements Predicate<Character> {

    /* JADX INFO: renamed from: com.google.common.base.CharMatcher$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends NegatedFastMatcher {
        @Override // com.google.common.base.CharMatcher.Negated
        public final String toString() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class And extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharMatcher f16330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharMatcher f16331b;

        public And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f16330a = charMatcher;
            charMatcher2.getClass();
            this.f16331b = charMatcher2;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return this.f16330a.m(c11) && this.f16331b.m(c11);
        }

        public final String toString() {
            return "CharMatcher.and(" + this.f16330a + ", " + this.f16331b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Any extends NamedFastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CharMatcher f16332b = new Any();

        private Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            charMatcher.getClass();
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public final int h(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final int i(CharSequence charSequence, int i11) {
            int length = charSequence.length();
            Preconditions.l(i11, length);
            if (i11 == length) {
                return -1;
            }
            return i11;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(CharSequence charSequence) {
            charSequence.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return None.f16344b;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            charMatcher.getClass();
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnyOf extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char[] f16333a;

        public AnyOf(String str) {
            char[] charArray = str.toString().toCharArray();
            this.f16333a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return Arrays.binarySearch(this.f16333a, c11) >= 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c11 : this.f16333a) {
                sb2.append(CharMatcher.a(c11));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Ascii extends NamedFastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CharMatcher f16334b = new Ascii();

        public Ascii() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return c11 <= 127;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BitSetMatcher extends NamedFastMatcher {
        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BreakingWhitespace extends CharMatcher {
        static {
            new BreakingWhitespace();
        }

        private BreakingWhitespace() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            if (c11 != ' ' && c11 != 133 && c11 != 5760) {
                if (c11 != 8199) {
                    if (c11 != 8287 && c11 != 12288 && c11 != 8232 && c11 != 8233) {
                        switch (c11) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c11 >= 8192 && c11 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Digit extends RangesMatcher {
        static {
            new Digit();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Digit() {
            char[] charArray = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
            char[] cArr = new char[37];
            for (int i11 = 0; i11 < 37; i11++) {
                cArr[i11] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i11) + '\t');
            }
            super("CharMatcher.digit()", charArray, cArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class FastMatcher extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher p() {
            return new NegatedFastMatcher(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ForPredicate extends CharMatcher {
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            ((Character) obj).getClass();
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        /* JADX INFO: renamed from: d */
        public final boolean apply(Character ch2) {
            ch2.getClass();
            throw null;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            throw null;
        }

        public final String toString() {
            return "CharMatcher.forPredicate(null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InRange extends FastMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f16335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char f16336b;

        public InRange(char c11, char c12) {
            Preconditions.g(c12 >= c11);
            this.f16335a = c11;
            this.f16336b = c12;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return this.f16335a <= c11 && c11 <= this.f16336b;
        }

        public final String toString() {
            return "CharMatcher.inRange('" + CharMatcher.a(this.f16335a) + "', '" + CharMatcher.a(this.f16336b) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Invisible extends RangesMatcher {
        static {
            new Invisible();
        }

        private Invisible() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Is extends FastMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f16337a;

        public Is(char c11) {
            this.f16337a = c11;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            return charMatcher.m(this.f16337a) ? this : None.f16344b;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return c11 == this.f16337a;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return new IsNot(this.f16337a);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            return charMatcher.m(this.f16337a) ? charMatcher : new Or(this, charMatcher);
        }

        public final String toString() {
            return "CharMatcher.is('" + CharMatcher.a(this.f16337a) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IsEither extends FastMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f16338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char f16339b;

        public IsEither(char c11, char c12) {
            this.f16338a = c11;
            this.f16339b = c12;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return c11 == this.f16338a || c11 == this.f16339b;
        }

        public final String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.a(this.f16338a) + CharMatcher.a(this.f16339b) + "\")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IsNot extends FastMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f16340a;

        public IsNot(char c11) {
            this.f16340a = c11;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            return charMatcher.m(this.f16340a) ? new And(this, charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return c11 != this.f16340a;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return new Is(this.f16340a);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            return charMatcher.m(this.f16340a) ? Any.f16332b : this;
        }

        public final String toString() {
            return "CharMatcher.isNot('" + CharMatcher.a(this.f16340a) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JavaDigit extends CharMatcher {
        static {
            new JavaDigit();
        }

        private JavaDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return Character.isDigit(c11);
        }

        public final String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JavaIsoControl extends NamedFastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CharMatcher f16341b = new JavaIsoControl();

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            if (c11 > 31) {
                return c11 >= 127 && c11 <= 159;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JavaLetter extends CharMatcher {
        static {
            new JavaLetter();
        }

        private JavaLetter() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return Character.isLetter(c11);
        }

        public final String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JavaLetterOrDigit extends CharMatcher {
        static {
            new JavaLetterOrDigit();
        }

        private JavaLetterOrDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return Character.isLetterOrDigit(c11);
        }

        public final String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JavaLowerCase extends CharMatcher {
        static {
            new JavaLowerCase();
        }

        private JavaLowerCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return Character.isLowerCase(c11);
        }

        public final String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class JavaUpperCase extends CharMatcher {
        static {
            new JavaUpperCase();
        }

        private JavaUpperCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return Character.isUpperCase(c11);
        }

        public final String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class NamedFastMatcher extends FastMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16342a;

        public NamedFastMatcher(String str) {
            this.f16342a = str;
        }

        public final String toString() {
            return this.f16342a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Negated extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharMatcher f16343a;

        public Negated(CharMatcher charMatcher) {
            this.f16343a = charMatcher;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(CharSequence charSequence) {
            return charSequence.length() - this.f16343a.f(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return !this.f16343a.m(c11);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(CharSequence charSequence) {
            return this.f16343a.o(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(CharSequence charSequence) {
            return this.f16343a.n(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return this.f16343a;
        }

        public String toString() {
            return this.f16343a + ".negate()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class NegatedFastMatcher extends Negated {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class None extends NamedFastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CharMatcher f16344b = new None();

        private None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher b(CharMatcher charMatcher) {
            charMatcher.getClass();
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public final int f(CharSequence charSequence) {
            charSequence.getClass();
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final int h(CharSequence charSequence) {
            charSequence.getClass();
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final int i(CharSequence charSequence, int i11) {
            Preconditions.l(i11, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean n(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean o(CharSequence charSequence) {
            charSequence.getClass();
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final CharMatcher p() {
            return Any.f16332b;
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher q(CharMatcher charMatcher) {
            charMatcher.getClass();
            return charMatcher;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Or extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharMatcher f16345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharMatcher f16346b;

        public Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f16345a = charMatcher;
            charMatcher2.getClass();
            this.f16346b = charMatcher2;
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return this.f16345a.m(c11) || this.f16346b.m(c11);
        }

        public final String toString() {
            return "CharMatcher.or(" + this.f16345a + ", " + this.f16346b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RangesMatcher extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char[] f16348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final char[] f16349c;

        public RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.f16347a = str;
            this.f16348b = cArr;
            this.f16349c = cArr2;
            Preconditions.g(cArr.length == cArr2.length);
            int i11 = 0;
            while (i11 < cArr.length) {
                Preconditions.g(cArr[i11] <= cArr2[i11]);
                int i12 = i11 + 1;
                if (i12 < cArr.length) {
                    Preconditions.g(cArr2[i11] < cArr[i12]);
                }
                i11 = i12;
            }
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return apply((Character) obj);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            int iBinarySearch = Arrays.binarySearch(this.f16348b, c11);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i11 = (~iBinarySearch) - 1;
            return i11 >= 0 && c11 <= this.f16349c[i11];
        }

        public final String toString() {
            return this.f16347a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SingleWidth extends RangesMatcher {
        static {
            new SingleWidth();
        }

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Whitespace extends NamedFastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f16350b = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CharMatcher f16351c = new Whitespace();

        public Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean m(char c11) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c11) >>> f16350b) == c11;
        }
    }

    public static String a(char c11) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(c11 & 15);
            c11 = (char) (c11 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static CharMatcher c(String str) {
        int length = str.length();
        if (length == 0) {
            return None.f16344b;
        }
        if (length != 1) {
            return length != 2 ? new AnyOf(str) : new IsEither(str.charAt(0), str.charAt(1));
        }
        return new Is(str.charAt(0));
    }

    public static CharMatcher e() {
        return Ascii.f16334b;
    }

    public static CharMatcher g(char c11, char c12) {
        return new InRange(c11, c12);
    }

    public static CharMatcher j(char c11) {
        return new Is(c11);
    }

    public static CharMatcher k() {
        return new IsNot(' ');
    }

    public static CharMatcher l() {
        return JavaIsoControl.f16341b;
    }

    public CharMatcher b(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    @Override // com.google.common.base.Predicate
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean apply(Character ch2) {
        return m(ch2.charValue());
    }

    public int f(CharSequence charSequence) {
        int i11 = 0;
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            if (m(charSequence.charAt(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public int h(CharSequence charSequence) {
        return i(charSequence, 0);
    }

    public int i(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        Preconditions.l(i11, length);
        while (i11 < length) {
            if (m(charSequence.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public abstract boolean m(char c11);

    public boolean n(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!m(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean o(CharSequence charSequence) {
        return h(charSequence) == -1;
    }

    public CharMatcher p() {
        return new Negated(this);
    }

    public CharMatcher q(CharMatcher charMatcher) {
        return new Or(this, charMatcher);
    }
}
