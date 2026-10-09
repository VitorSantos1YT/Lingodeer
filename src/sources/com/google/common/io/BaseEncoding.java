package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BaseEncoding f17416a = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BaseEncoding f17417b = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BaseEncoding f17418c;

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ByteSink {
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends ByteSource {
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i11, int i12) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass5 extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(int i11) {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i11, int i12) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Base16Encoding extends StandardBaseEncoding {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final char[] f17429g;

        public Base16Encoding(Alphabet alphabet) {
            super(alphabet, (Character) null);
            this.f17429g = new char[512];
            char[] cArr = alphabet.f17421b;
            Preconditions.g(cArr.length == 16);
            for (int i11 = 0; i11 < 256; i11++) {
                char[] cArr2 = this.f17429g;
                cArr2[i11] = cArr[i11 >>> 4];
                cArr2[i11 | 256] = cArr[i11 & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException("Invalid input length " + charSequence.length());
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < charSequence.length()) {
                char cCharAt = charSequence.charAt(i11);
                Alphabet alphabet = this.f17430d;
                bArr[i12] = (byte) ((alphabet.a(cCharAt) << 4) | alphabet.a(charSequence.charAt(i11 + 1)));
                i11 += 2;
                i12++;
            }
            return i12;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final void d(Appendable appendable, byte[] bArr, int i11) throws IOException {
            Preconditions.m(0, i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i12] & 255;
                char[] cArr = this.f17429g;
                appendable.append(cArr[i13]);
                appendable.append(cArr[i13 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public final BaseEncoding l(Alphabet alphabet, Character ch2) {
            return new Base16Encoding(alphabet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Base64Encoding extends StandardBaseEncoding {
        public Base64Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()), (Character) '=');
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            CharSequence charSequenceH = h(charSequence);
            int length = charSequenceH.length();
            Alphabet alphabet = this.f17430d;
            if (!alphabet.f17427h[length % alphabet.f17424e]) {
                throw new DecodingException("Invalid input length " + charSequenceH.length());
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < charSequenceH.length()) {
                int i13 = i11 + 2;
                int iA = (alphabet.a(charSequenceH.charAt(i11 + 1)) << 12) | (alphabet.a(charSequenceH.charAt(i11)) << 18);
                int i14 = i12 + 1;
                bArr[i12] = (byte) (iA >>> 16);
                if (i13 < charSequenceH.length()) {
                    int i15 = i11 + 3;
                    int iA2 = iA | (alphabet.a(charSequenceH.charAt(i13)) << 6);
                    int i16 = i12 + 2;
                    bArr[i14] = (byte) ((iA2 >>> 8) & 255);
                    if (i15 < charSequenceH.length()) {
                        i11 += 4;
                        i12 += 3;
                        bArr[i16] = (byte) ((iA2 | alphabet.a(charSequenceH.charAt(i15))) & 255);
                    } else {
                        i12 = i16;
                        i11 = i15;
                    }
                } else {
                    i12 = i14;
                    i11 = i13;
                }
            }
            return i12;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final void d(Appendable appendable, byte[] bArr, int i11) throws IOException {
            int i12 = 0;
            Preconditions.m(0, i11, bArr.length);
            for (int i13 = i11; i13 >= 3; i13 -= 3) {
                int i14 = i12 + 2;
                int i15 = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16);
                i12 += 3;
                int i16 = i15 | (bArr[i14] & 255);
                Alphabet alphabet = this.f17430d;
                char[] cArr = alphabet.f17421b;
                char[] cArr2 = alphabet.f17421b;
                appendable.append(cArr[i16 >>> 18]);
                appendable.append(cArr2[(i16 >>> 12) & 63]);
                appendable.append(cArr2[(i16 >>> 6) & 63]);
                appendable.append(cArr2[i16 & 63]);
            }
            if (i12 < i11) {
                k(appendable, bArr, i12, i11 - i12);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public final BaseEncoding l(Alphabet alphabet, Character ch2) {
            return new Base64Encoding(alphabet, ch2);
        }

        public Base64Encoding(Alphabet alphabet, Character ch2) {
            super(alphabet, ch2);
            Preconditions.g(alphabet.f17421b.length == 64);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DecodingException extends IOException {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SeparatedBaseEncoding extends BaseEncoding {
        @Override // com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) {
            new StringBuilder(charSequence.length());
            if (charSequence.length() <= 0) {
                throw null;
            }
            charSequence.charAt(0);
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final void d(Appendable appendable, byte[] bArr, int i11) {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final int e(int i11) {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final int f(int i11) {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding g() {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final CharSequence h(CharSequence charSequence) {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding i() {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding j() {
            throw new UnsupportedOperationException("Already have a separator");
        }

        public final String toString() {
            return ((Object) null) + ".withSeparator(\"null\", 0)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StandardBaseEncoding extends BaseEncoding {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Alphabet f17430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Character f17431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile BaseEncoding f17432f;

        /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends OutputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17433a;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                if (this.f17433a <= 0) {
                    throw null;
                }
                throw null;
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                throw null;
            }

            @Override // java.io.OutputStream
            public final void write(int i11) {
                this.f17433a += 8;
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass2 extends InputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17434a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f17435b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f17436c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f17437d;

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }

            @Override // java.io.InputStream
            public final int read() {
                throw null;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i11, int i12) {
                int i13 = i12 + i11;
                Preconditions.m(i11, i13, bArr.length);
                int i14 = i11;
                while (i14 < i13) {
                    int i15 = read();
                    if (i15 == -1) {
                        int i16 = i14 - i11;
                        if (i16 == 0) {
                            return -1;
                        }
                        return i16;
                    }
                    bArr[i14] = (byte) i15;
                    i14++;
                }
                return i14 - i11;
            }
        }

        public StandardBaseEncoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()), (Character) '=');
        }

        @Override // com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            CharSequence charSequenceH = h(charSequence);
            int length = charSequenceH.length();
            Alphabet alphabet = this.f17430d;
            boolean[] zArr = alphabet.f17427h;
            int i11 = alphabet.f17423d;
            int i12 = alphabet.f17424e;
            if (!zArr[length % i12]) {
                throw new DecodingException("Invalid input length " + charSequenceH.length());
            }
            int i13 = 0;
            for (int i14 = 0; i14 < charSequenceH.length(); i14 += i12) {
                long jA = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    jA <<= i11;
                    if (i14 + i16 < charSequenceH.length()) {
                        jA |= (long) alphabet.a(charSequenceH.charAt(i15 + i14));
                        i15++;
                    }
                }
                int i17 = alphabet.f17425f;
                int i18 = (i17 * 8) - (i15 * i11);
                int i19 = (i17 - 1) * 8;
                while (i19 >= i18) {
                    bArr[i13] = (byte) ((jA >>> i19) & 255);
                    i19 -= 8;
                    i13++;
                }
            }
            return i13;
        }

        @Override // com.google.common.io.BaseEncoding
        public void d(Appendable appendable, byte[] bArr, int i11) throws IOException {
            int i12 = 0;
            Preconditions.m(0, i11, bArr.length);
            while (i12 < i11) {
                Alphabet alphabet = this.f17430d;
                k(appendable, bArr, i12, Math.min(alphabet.f17425f, i11 - i12));
                i12 += alphabet.f17425f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public final int e(int i11) {
            return (int) (((((long) this.f17430d.f17423d) * ((long) i11)) + 7) / 8);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof StandardBaseEncoding) {
                StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
                if (this.f17430d.equals(standardBaseEncoding.f17430d) && Objects.equals(this.f17431e, standardBaseEncoding.f17431e)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        public final int f(int i11) {
            Alphabet alphabet = this.f17430d;
            return IntMath.c(i11, alphabet.f17425f, RoundingMode.CEILING) * alphabet.f17424e;
        }

        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding g() {
            return this.f17431e == null ? this : l(this.f17430d, null);
        }

        @Override // com.google.common.io.BaseEncoding
        public final CharSequence h(CharSequence charSequence) {
            Character ch2 = this.f17431e;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public final int hashCode() {
            return this.f17430d.hashCode() ^ Objects.hashCode(this.f17431e);
        }

        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding j() {
            throw null;
        }

        public final void k(Appendable appendable, byte[] bArr, int i11, int i12) throws IOException {
            Preconditions.m(i11, i11 + i12, bArr.length);
            Alphabet alphabet = this.f17430d;
            int i13 = alphabet.f17425f;
            int i14 = alphabet.f17423d;
            int i15 = 0;
            Preconditions.g(i12 <= i13);
            long j11 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                j11 = (j11 | ((long) (bArr[i11 + i16] & 255))) << 8;
            }
            int i17 = ((i12 + 1) * 8) - i14;
            while (i15 < i12 * 8) {
                appendable.append(alphabet.f17421b[((int) (j11 >>> (i17 - i15))) & alphabet.f17422c]);
                i15 += i14;
            }
            Character ch2 = this.f17431e;
            if (ch2 != null) {
                while (i15 < alphabet.f17425f * 8) {
                    appendable.append(ch2.charValue());
                    i15 += i14;
                }
            }
        }

        public BaseEncoding l(Alphabet alphabet, Character ch2) {
            return new StandardBaseEncoding(alphabet, ch2);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            Alphabet alphabet = this.f17430d;
            sb2.append(alphabet);
            if (8 % alphabet.f17423d != 0) {
                Character ch2 = this.f17431e;
                if (ch2 == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(ch2);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        public StandardBaseEncoding(Alphabet alphabet, Character ch2) {
            boolean z11;
            alphabet.getClass();
            this.f17430d = alphabet;
            if (ch2 != null) {
                char cCharValue = ch2.charValue();
                byte[] bArr = alphabet.f17426g;
                if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = true;
            }
            Preconditions.f("Padding character %s was already in alphabet", z11, ch2);
            this.f17431e = ch2;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00b3 A[EDGE_INSN: B:44:0x00b3->B:46:0x00b9 BREAK  A[LOOP:0: B:5:0x000b->B:45:0x00b5]] */
        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding i() {
            int i11;
            boolean z11;
            BaseEncoding baseEncodingL = this.f17432f;
            if (baseEncodingL == null) {
                Alphabet alphabet = this.f17430d;
                char[] cArr = alphabet.f17421b;
                for (char c11 : cArr) {
                    if (Ascii.b(c11)) {
                        int length = cArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                z11 = false;
                                break;
                            }
                            char c12 = cArr[i12];
                            if (c12 >= 'A' && c12 <= 'Z') {
                                z11 = true;
                                break;
                            }
                            i12++;
                        }
                        Preconditions.p(HOBXIlHxIkMBEA.SbJeJQmzxUveT, !z11);
                        char[] cArr2 = new char[cArr.length];
                        for (int i13 = 0; i13 < cArr.length; i13++) {
                            char c13 = cArr[i13];
                            if (Ascii.b(c13)) {
                                c13 = (char) (c13 ^ ' ');
                            }
                            cArr2[i13] = c13;
                        }
                        Alphabet alphabet2 = new Alphabet(ep.a.k(new StringBuilder(), alphabet.f17420a, ".upperCase()"), cArr2);
                        if (!alphabet.f17428i) {
                            alphabet = alphabet2;
                            break;
                        }
                        byte[] bArr = alphabet2.f17426g;
                        if (!alphabet2.f17428i) {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            for (i11 = 65; i11 <= 90; i11++) {
                                int i14 = i11 | 32;
                                byte b3 = bArr[i11];
                                byte b11 = bArr[i14];
                                if (b3 == -1) {
                                    bArrCopyOf[i11] = b11;
                                } else {
                                    char c14 = (char) i11;
                                    char c15 = (char) i14;
                                    if (!(b11 == -1)) {
                                        throw new IllegalStateException(Strings.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c14), Character.valueOf(c15)));
                                    }
                                    bArrCopyOf[i14] = b3;
                                }
                            }
                            alphabet = new Alphabet(ep.a.k(new StringBuilder(), alphabet2.f17420a, ".ignoreCase()"), alphabet2.f17421b, bArrCopyOf, true);
                            break;
                        }
                        alphabet = alphabet2;
                        break;
                    }
                }
                baseEncodingL = alphabet == this.f17430d ? this : l(alphabet, this.f17431e);
                this.f17432f = baseEncodingL;
            }
            return baseEncodingL;
        }
    }

    static {
        new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f17418c = new Base16Encoding(new Alphabet("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] a(String str) {
        try {
            CharSequence charSequenceH = h(str);
            int iE = e(charSequenceH.length());
            byte[] bArr = new byte[iE];
            int iB = b(bArr, charSequenceH);
            if (iB == iE) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (DecodingException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public final String c(byte[] bArr, int i11) {
        Preconditions.m(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(f(i11));
        try {
            d(sb2, bArr, i11);
            return sb2.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public abstract void d(Appendable appendable, byte[] bArr, int i11);

    public abstract int e(int i11);

    public abstract int f(int i11);

    public abstract BaseEncoding g();

    public abstract BaseEncoding i();

    public abstract BaseEncoding j();

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17419a;

        @Override // java.lang.Appendable
        public final Appendable append(char c11) {
            if (this.f17419a == 0) {
                throw null;
            }
            throw null;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i11, int i12) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Alphabet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char[] f17421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f17425f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f17426g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean[] f17427h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f17428i;

        public Alphabet(String str, char[] cArr, byte[] bArr, boolean z11) {
            str.getClass();
            this.f17420a = str;
            cArr.getClass();
            this.f17421b = cArr;
            try {
                int length = cArr.length;
                RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                int iD = IntMath.d(length);
                this.f17423d = iD;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iD);
                int i11 = 1 << (3 - iNumberOfTrailingZeros);
                this.f17424e = i11;
                this.f17425f = iD >> iNumberOfTrailingZeros;
                this.f17422c = cArr.length - 1;
                this.f17426g = bArr;
                boolean[] zArr = new boolean[i11];
                for (int i12 = 0; i12 < this.f17425f; i12++) {
                    zArr[IntMath.c(i12 * 8, this.f17423d, RoundingMode.CEILING)] = true;
                }
                this.f17427h = zArr;
                this.f17428i = z11;
            } catch (ArithmeticException e8) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e8);
            }
        }

        public final int a(char c11) throws DecodingException {
            if (c11 > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c11));
            }
            byte b3 = this.f17426g[c11];
            if (b3 != -1) {
                return b3;
            }
            if (c11 <= ' ' || c11 == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(c11));
            }
            throw new DecodingException("Unrecognized character: " + c11);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Alphabet)) {
                return false;
            }
            Alphabet alphabet = (Alphabet) obj;
            return this.f17428i == alphabet.f17428i && Arrays.equals(this.f17421b, alphabet.f17421b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f17421b) + (this.f17428i ? 1231 : 1237);
        }

        public final String toString() {
            return this.f17420a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Alphabet(String str, char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i11 = 0; i11 < cArr.length; i11++) {
                char c11 = cArr[i11];
                if (c11 < 128) {
                    if (bArr[c11] == -1) {
                        bArr[c11] = (byte) i11;
                    } else {
                        throw new IllegalArgumentException(Strings.c("Duplicate character: %s", Character.valueOf(c11)));
                    }
                } else {
                    throw new IllegalArgumentException(Strings.c("Non-ASCII character: %s", Character.valueOf(c11)));
                }
            }
            this(str, cArr, bArr, false);
        }
    }

    public CharSequence h(CharSequence charSequence) {
        return charSequence;
    }
}
