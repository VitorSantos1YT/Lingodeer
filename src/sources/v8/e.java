package v8;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f53764v = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f53765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f53766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f53767y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f53768z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f53769a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f53770b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f53779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f53780l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f53781n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f53782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f53783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f53784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f53785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f53786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f53787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f53788u;

    static {
        int iC = c(0, 0, 0, 0);
        f53765w = iC;
        int iC2 = c(0, 0, 0, 3);
        f53766x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f53767y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f53768z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static int c(int i11, int i12, int i13, int i14) {
        int i15;
        b7.a.g(i11, 4);
        b7.a.g(i12, 4);
        b7.a.g(i13, 4);
        b7.a.g(i14, 4);
        if (i14 == 0 || i14 == 1) {
            i15 = 255;
        } else if (i14 == 2) {
            i15 = 127;
        } else if (i14 != 3) {
            i15 = 255;
        } else {
            i15 = 0;
        }
        return Color.argb(i15, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0, i13 <= 1 ? 0 : 255);
    }

    public final void a(char c11) {
        SpannableStringBuilder spannableStringBuilder = this.f53770b;
        if (c11 != '\n') {
            spannableStringBuilder.append(c11);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f53769a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f53782o != -1) {
            this.f53782o = 0;
        }
        if (this.f53783p != -1) {
            this.f53783p = 0;
        }
        if (this.f53784q != -1) {
            this.f53784q = 0;
        }
        if (this.f53786s != -1) {
            this.f53786s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f53778j && arrayList.size() < 15) {
                this.f53788u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f53770b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f53782o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f53782o, length, 33);
            }
            if (this.f53783p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f53783p, length, 33);
            }
            if (this.f53784q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f53785r), this.f53784q, length, 33);
            }
            if (this.f53786s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f53787t), this.f53786s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f53769a.clear();
        this.f53770b.clear();
        this.f53782o = -1;
        this.f53783p = -1;
        this.f53784q = -1;
        this.f53786s = -1;
        this.f53788u = 0;
        this.f53771c = false;
        this.f53772d = false;
        this.f53773e = 4;
        this.f53774f = false;
        this.f53775g = 0;
        this.f53776h = 0;
        this.f53777i = 0;
        this.f53778j = 15;
        this.f53779k = 0;
        this.f53780l = 0;
        this.m = 0;
        int i11 = f53765w;
        this.f53781n = i11;
        this.f53785r = f53764v;
        this.f53787t = i11;
    }

    public final void e(boolean z11, boolean z12) {
        int i11 = this.f53782o;
        SpannableStringBuilder spannableStringBuilder = this.f53770b;
        if (i11 != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f53782o, spannableStringBuilder.length(), 33);
                this.f53782o = -1;
            }
        } else if (z11) {
            this.f53782o = spannableStringBuilder.length();
        }
        if (this.f53783p == -1) {
            if (z12) {
                this.f53783p = spannableStringBuilder.length();
            }
        } else {
            if (z12) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f53783p, spannableStringBuilder.length(), 33);
            this.f53783p = -1;
        }
    }

    public final void f(int i11, int i12) {
        int i13 = this.f53784q;
        SpannableStringBuilder spannableStringBuilder = this.f53770b;
        if (i13 != -1 && this.f53785r != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f53785r), this.f53784q, spannableStringBuilder.length(), 33);
        }
        if (i11 != f53764v) {
            this.f53784q = spannableStringBuilder.length();
            this.f53785r = i11;
        }
        if (this.f53786s != -1 && this.f53787t != i12) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f53787t), this.f53786s, spannableStringBuilder.length(), 33);
        }
        if (i12 != f53765w) {
            this.f53786s = spannableStringBuilder.length();
            this.f53787t = i12;
        }
    }
}
