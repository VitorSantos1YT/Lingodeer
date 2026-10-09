package a7;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import b7.f0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f412z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f424l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f429r;

    static {
        new b(BuildConfig.VERSION_NAME, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0);
        String str = f0.f3975a;
        f405s = Integer.toString(0, 36);
        f406t = Integer.toString(17, 36);
        f407u = Integer.toString(1, 36);
        f408v = Integer.toString(2, 36);
        f409w = Integer.toString(3, 36);
        f410x = Integer.toString(18, 36);
        f411y = Integer.toString(4, 36);
        f412z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f5, int i11, int i12, float f11, int i13, int i14, float f12, float f13, float f14, boolean z11, int i15, int i16, float f15, int i17) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            b7.a.d(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f413a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f413a = charSequence.toString();
        } else {
            this.f413a = null;
        }
        this.f414b = alignment;
        this.f415c = alignment2;
        this.f416d = bitmap;
        this.f417e = f5;
        this.f418f = i11;
        this.f419g = i12;
        this.f420h = f11;
        this.f421i = i13;
        this.f422j = f13;
        this.f423k = f14;
        this.f424l = z11;
        this.m = i15;
        this.f425n = i14;
        this.f426o = f12;
        this.f427p = i16;
        this.f428q = f15;
        this.f429r = i17;
    }

    public final a a() {
        a aVar = new a();
        aVar.f388a = this.f413a;
        aVar.f389b = this.f416d;
        aVar.f390c = this.f414b;
        aVar.f391d = this.f415c;
        aVar.f392e = this.f417e;
        aVar.f393f = this.f418f;
        aVar.f394g = this.f419g;
        aVar.f395h = this.f420h;
        aVar.f396i = this.f421i;
        aVar.f397j = this.f425n;
        aVar.f398k = this.f426o;
        aVar.f399l = this.f422j;
        aVar.m = this.f423k;
        aVar.f400n = this.f424l;
        aVar.f401o = this.m;
        aVar.f402p = this.f427p;
        aVar.f403q = this.f428q;
        aVar.f404r = this.f429r;
        return aVar;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.f416d;
            if (TextUtils.equals(this.f413a, bVar.f413a) && this.f414b == bVar.f414b && this.f415c == bVar.f415c && ((bitmap = this.f416d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f417e == bVar.f417e && this.f418f == bVar.f418f && this.f419g == bVar.f419g && this.f420h == bVar.f420h && this.f421i == bVar.f421i && this.f422j == bVar.f422j && this.f423k == bVar.f423k && this.f424l == bVar.f424l && this.m == bVar.m && this.f425n == bVar.f425n && this.f426o == bVar.f426o && this.f427p == bVar.f427p && this.f428q == bVar.f428q && this.f429r == bVar.f429r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f413a, this.f414b, this.f415c, this.f416d, Float.valueOf(this.f417e), Integer.valueOf(this.f418f), Integer.valueOf(this.f419g), Float.valueOf(this.f420h), Integer.valueOf(this.f421i), Float.valueOf(this.f422j), Float.valueOf(this.f423k), Boolean.valueOf(this.f424l), Integer.valueOf(this.m), Integer.valueOf(this.f425n), Float.valueOf(this.f426o), Integer.valueOf(this.f427p), Float.valueOf(this.f428q), Integer.valueOf(this.f429r));
    }
}
