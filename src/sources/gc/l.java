package gc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import okhttp3.Headers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f29045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorSpace f29046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc.g f29047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hc.f f29048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f29049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f29052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Headers f29053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f29054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f29055l;
    public final b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f29056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f29057o;

    public l(Context context, Bitmap.Config config, ColorSpace colorSpace, hc.g gVar, hc.f fVar, boolean z11, boolean z12, boolean z13, String str, Headers headers, p pVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f29044a = context;
        this.f29045b = config;
        this.f29046c = colorSpace;
        this.f29047d = gVar;
        this.f29048e = fVar;
        this.f29049f = z11;
        this.f29050g = z12;
        this.f29051h = z13;
        this.f29052i = str;
        this.f29053j = headers;
        this.f29054k = pVar;
        this.f29055l = nVar;
        this.m = bVar;
        this.f29056n = bVar2;
        this.f29057o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (kotlin.jvm.internal.m.a(this.f29044a, lVar.f29044a) && this.f29045b == lVar.f29045b) {
            return (Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.m.a(this.f29046c, lVar.f29046c)) && kotlin.jvm.internal.m.a(this.f29047d, lVar.f29047d) && this.f29048e == lVar.f29048e && this.f29049f == lVar.f29049f && this.f29050g == lVar.f29050g && this.f29051h == lVar.f29051h && kotlin.jvm.internal.m.a(this.f29052i, lVar.f29052i) && kotlin.jvm.internal.m.a(this.f29053j, lVar.f29053j) && kotlin.jvm.internal.m.a(this.f29054k, lVar.f29054k) && kotlin.jvm.internal.m.a(this.f29055l, lVar.f29055l) && this.m == lVar.m && this.f29056n == lVar.f29056n && this.f29057o == lVar.f29057o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f29045b.hashCode() + (this.f29044a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f29046c;
        int iE = defpackage.e.e(defpackage.e.e(defpackage.e.e((this.f29048e.hashCode() + ((this.f29047d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f29049f), 31, this.f29050g), 31, this.f29051h);
        String str = this.f29052i;
        return this.f29057o.hashCode() + ((this.f29056n.hashCode() + ((this.m.hashCode() + ((this.f29055l.f29060a.hashCode() + ((this.f29054k.f29069a.hashCode() + ((((iE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f29053j.f45042a)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
