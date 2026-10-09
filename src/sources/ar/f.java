package ar;

import d1.t;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import jp.y0;
import k3.i;
import kotlin.jvm.internal.m;
import ob.u;
import r8.o;
import ry.l;
import v5.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements d7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2849e;

    public f(int i11, byte b3) {
        this.f2845a = i11;
        switch (i11) {
            case 2:
                this.f2848d = new u(5);
                this.f2846b = 8000;
                this.f2847c = 8000;
                break;
            case 3:
            default:
                this.f2848d = new long[10];
                this.f2849e = new Object[10];
                break;
            case 4:
                break;
        }
    }

    public synchronized void a(long j11, Object obj) {
        int i11 = this.f2847c;
        if (i11 > 0) {
            if (j11 <= ((long[]) this.f2848d)[((this.f2846b + i11) - 1) % ((Object[]) this.f2849e).length]) {
                c();
            }
        }
        d();
        int i12 = this.f2846b;
        int i13 = this.f2847c;
        Object[] objArr = (Object[]) this.f2849e;
        int length = (i12 + i13) % objArr.length;
        ((long[]) this.f2848d)[length] = j11;
        objArr[length] = obj;
        this.f2847c = i13 + 1;
    }

    public void b(int i11) {
        int i12 = this.f2846b;
        int i13 = this.f2847c;
        boolean z11 = false;
        if (i11 <= i13 && i12 <= i11) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbK = w4.c.k("Invalid offset: ", i11, ". Valid range is [", i12, " , ");
        sbK.append(i13);
        sbK.append(']');
        p3.a.a(sbK.toString());
    }

    public synchronized void c() {
        this.f2846b = 0;
        this.f2847c = 0;
        Arrays.fill((Object[]) this.f2849e, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.f2849e).length;
        if (this.f2847c < length) {
            return;
        }
        int i11 = length * 2;
        long[] jArr = new long[i11];
        Object[] objArr = new Object[i11];
        int i12 = this.f2846b;
        int i13 = length - i12;
        System.arraycopy((long[]) this.f2848d, i12, jArr, 0, i13);
        System.arraycopy((Object[]) this.f2849e, this.f2846b, objArr, 0, i13);
        int i14 = this.f2846b;
        if (i14 > 0) {
            System.arraycopy((long[]) this.f2848d, 0, jArr, i13, i14);
            System.arraycopy((Object[]) this.f2849e, 0, objArr, i13, this.f2846b);
        }
        this.f2848d = jArr;
        this.f2849e = objArr;
        this.f2846b = 0;
    }

    public int e() {
        t tVar = (t) this.f2849e;
        if (tVar == null) {
            return ((String) this.f2848d).length();
        }
        return (tVar.f22991b - tVar.c()) + (((String) this.f2848d).length() - (this.f2847c - this.f2846b));
    }

    public boolean f(int i11) {
        CharSequence charSequence = (CharSequence) this.f2848d;
        int i12 = this.f2846b + 1;
        if (i11 > this.f2847c || i12 > i11) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i11))) {
            int i13 = i11 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i13))) {
                if (!j.d()) {
                    return false;
                }
                j jVarA = j.a();
                if (jVarA.c() != 1 || jVarA.b(charSequence, i13) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean g(int i11) {
        int i12 = this.f2846b + 1;
        if (i11 > this.f2847c || i12 > i11) {
            return false;
        }
        return c.a.A(Character.codePointBefore((CharSequence) this.f2848d, i11));
    }

    public boolean h(int i11) {
        b(i11);
        if (!((BreakIterator) this.f2849e).isBoundary(i11)) {
            return false;
        }
        if (j(i11) && j(i11 - 1) && j(i11 + 1)) {
            return false;
        }
        return i11 <= 0 || i11 >= ((CharSequence) this.f2848d).length() - 1 || !(i(i11) || i(i11 + 1));
    }

    public boolean i(int i11) {
        CharSequence charSequence = (CharSequence) this.f2848d;
        int i12 = i11 - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i12));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (m.a(unicodeBlockOf, unicodeBlock) && m.a(Character.UnicodeBlock.of(charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return m.a(Character.UnicodeBlock.of(charSequence.charAt(i11)), unicodeBlock) && m.a(Character.UnicodeBlock.of(charSequence.charAt(i12)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean j(int i11) {
        CharSequence charSequence = (CharSequence) this.f2848d;
        int i12 = this.f2846b;
        if (i11 >= this.f2847c || i12 > i11) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i11)) && !Character.isSurrogate(charSequence.charAt(i11))) {
            if (!j.d()) {
                return false;
            }
            j jVarA = j.a();
            if (jVarA.c() != 1 || jVarA.b(charSequence, i11) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean k(int i11) {
        int i12 = this.f2846b;
        if (i11 >= this.f2847c || i12 > i11) {
            return false;
        }
        return c.a.A(Character.codePointAt((CharSequence) this.f2848d, i11));
    }

    public int l(int i11) {
        b(i11);
        int iFollowing = ((BreakIterator) this.f2849e).following(i11);
        return (j(iFollowing + (-1)) && j(iFollowing) && !i(iFollowing)) ? l(iFollowing) : iFollowing;
    }

    public Object m(long j11, boolean z11) {
        Object objP = null;
        long j12 = Long.MAX_VALUE;
        while (this.f2847c > 0) {
            long j13 = j11 - ((long[]) this.f2848d)[this.f2846b];
            if (j13 < 0 && (z11 || (-j13) >= j12)) {
                break;
            }
            objP = p();
            j12 = j13;
        }
        return objP;
    }

    public synchronized Object n() {
        return this.f2847c == 0 ? null : p();
    }

    public synchronized Object o(long j11) {
        return m(j11, true);
    }

    public Object p() {
        b7.a.j(this.f2847c > 0);
        Object[] objArr = (Object[]) this.f2849e;
        int i11 = this.f2846b;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f2846b = (i11 + 1) % objArr.length;
        this.f2847c--;
        return obj;
    }

    public int q(int i11) {
        b(i11);
        int iPreceding = ((BreakIterator) this.f2849e).preceding(i11);
        return (j(iPreceding) && f(iPreceding) && !i(iPreceding)) ? q(iPreceding) : iPreceding;
    }

    public void r(int i11, int i12, String str) {
        if (i11 > i12) {
            p3.a.a("start index must be less than or equal to end index: " + i11 + " > " + i12);
        }
        if (i11 < 0) {
            p3.a.a("start must be non-negative, but was " + i11);
        }
        t tVar = (t) this.f2849e;
        if (tVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i11, 64);
            int iMin2 = Math.min(((String) this.f2848d).length() - i12, 64);
            String str2 = (String) this.f2848d;
            int i13 = i11 - iMin;
            m.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i13, i11, cArr, 0);
            String str3 = (String) this.f2848d;
            int i14 = iMax - iMin2;
            int i15 = iMin2 + i12;
            m.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i12, i15, cArr, i14);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            t tVar2 = new t(3);
            tVar2.f22991b = iMax;
            tVar2.f22994e = cArr;
            tVar2.f22992c = length;
            tVar2.f22993d = i14;
            this.f2849e = tVar2;
            this.f2846b = i13;
            this.f2847c = i15;
            return;
        }
        int i16 = this.f2846b;
        int i17 = i11 - i16;
        int i18 = i12 - i16;
        if (i17 < 0 || i18 > tVar.f22991b - tVar.c()) {
            this.f2848d = toString();
            this.f2849e = null;
            this.f2846b = -1;
            this.f2847c = -1;
            r(i11, i12, str);
            return;
        }
        int length2 = str.length() - (i18 - i17);
        if (length2 > tVar.c()) {
            int iC = length2 - tVar.c();
            int i19 = tVar.f22991b;
            do {
                i19 *= 2;
            } while (i19 - tVar.f22991b < iC);
            char[] cArr2 = new char[i19];
            l.I((char[]) tVar.f22994e, cArr2, 0, 0, tVar.f22992c);
            int i21 = tVar.f22991b;
            int i22 = tVar.f22993d;
            int i23 = i21 - i22;
            int i24 = i19 - i23;
            l.I((char[]) tVar.f22994e, cArr2, i24, i22, i23 + i22);
            tVar.f22994e = cArr2;
            tVar.f22991b = i19;
            tVar.f22993d = i24;
        }
        int i25 = tVar.f22992c;
        if (i17 < i25 && i18 <= i25) {
            int i26 = i25 - i18;
            char[] cArr3 = (char[]) tVar.f22994e;
            l.I(cArr3, cArr3, tVar.f22993d - i26, i18, i25);
            tVar.f22992c = i17;
            tVar.f22993d -= i26;
        } else if (i17 >= i25 || i18 < i25) {
            int iC2 = tVar.c() + i17;
            int iC3 = tVar.c() + i18;
            int i27 = tVar.f22993d;
            char[] cArr4 = (char[]) tVar.f22994e;
            l.I(cArr4, cArr4, tVar.f22992c, i27, iC2);
            tVar.f22992c += iC2 - i27;
            tVar.f22993d = iC3;
        } else {
            tVar.f22993d = tVar.c() + i18;
            tVar.f22992c = i17;
        }
        str.getChars(0, str.length(), (char[]) tVar.f22994e, tVar.f22992c);
        tVar.f22992c = str.length() + tVar.f22992c;
    }

    @Override // d7.e
    public d7.f s() {
        return new d7.l((String) this.f2849e, this.f2846b, this.f2847c, (u) this.f2848d);
    }

    public synchronized int t() {
        return this.f2847c;
    }

    public String toString() {
        switch (this.f2845a) {
            case 4:
                t tVar = (t) this.f2849e;
                if (tVar == null) {
                    return (String) this.f2848d;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) this.f2848d, 0, this.f2846b);
                sb2.append((char[]) tVar.f22994e, 0, tVar.f22992c);
                char[] cArr = (char[]) tVar.f22994e;
                int i11 = tVar.f22993d;
                sb2.append(cArr, i11, tVar.f22991b - i11);
                String str = (String) this.f2848d;
                sb2.append((CharSequence) str, this.f2847c, str.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public f(CharSequence charSequence, int i11, Locale locale) {
        this.f2845a = 3;
        this.f2848d = charSequence;
        if (charSequence.length() < 0) {
            p3.a.a("input start index is outside the CharSequence");
        }
        if (i11 < 0 || i11 > charSequence.length()) {
            p3.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f2849e = wordInstance;
        this.f2846b = Math.max(0, -50);
        this.f2847c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new i(charSequence, i11));
    }

    public f(int i11, int i12, float[] fArr, float[] fArr2) {
        this.f2845a = 6;
        this.f2846b = i11;
        b7.a.d(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f2848d = fArr;
        this.f2849e = fArr2;
        this.f2847c = i12;
    }

    public f(f fVar) {
        this.f2845a = 7;
        float[] fArr = (float[]) fVar.f2848d;
        this.f2846b = fArr.length / 3;
        this.f2848d = b7.a.m(fArr);
        this.f2849e = b7.a.m((float[]) fVar.f2849e);
        int i11 = fVar.f2847c;
        if (i11 == 1) {
            this.f2847c = 5;
        } else if (i11 != 2) {
            this.f2847c = 4;
        } else {
            this.f2847c = 6;
        }
    }

    public f(g gVar, int i11, int i12, y0 y0Var) {
        this.f2845a = 0;
        this.f2848d = gVar;
        this.f2846b = i11;
        this.f2847c = i12;
        this.f2849e = y0Var;
    }

    public f(int i11) {
        this.f2845a = 5;
        this.f2848d = new o[i11];
        this.f2847c = 0;
    }
}
