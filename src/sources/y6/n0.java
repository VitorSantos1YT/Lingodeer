package y6;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f57236q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x f57237r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f57239b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f57241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f57242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f57243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f57244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f57246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t f57247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f57248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f57249l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f57250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f57251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f57252p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f57238a = f57236q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f57240c = f57237r;

    static {
        kw.b bVar = new kw.b();
        ImmutableMap.k();
        ImmutableList.s();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListS = ImmutableList.s();
        j7.t tVar = new j7.t();
        v vVar = v.f57368a;
        Uri uri = Uri.EMPTY;
        f57237r = new x("androidx.media3.common.Timeline", new s(bVar), uri != null ? new u(uri, null, null, list, immutableListS, -9223372036854775807L) : null, new t(tVar), a0.B, vVar);
        w4.c.s(1, 2, 3, 4, 5);
        w4.c.s(6, 7, 8, 9, 10);
        b7.f0.G(11);
        b7.f0.G(12);
        b7.f0.G(13);
    }

    public final boolean a() {
        return this.f57247j != null;
    }

    public final void b(x xVar, Object obj, long j11, long j12, long j13, boolean z11, boolean z12, t tVar, long j14, long j15, int i11, long j16) {
        this.f57238a = f57236q;
        this.f57240c = xVar != null ? xVar : f57237r;
        if (xVar != null) {
            u uVar = xVar.f57373b;
        }
        this.f57239b = null;
        this.f57241d = obj;
        this.f57242e = j11;
        this.f57243f = j12;
        this.f57244g = j13;
        this.f57245h = z11;
        this.f57246i = z12;
        this.f57247j = tVar;
        this.f57249l = j14;
        this.m = j15;
        this.f57250n = 0;
        this.f57251o = i11;
        this.f57252p = j16;
        this.f57248k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n0.class.equals(obj.getClass())) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Objects.equals(this.f57238a, n0Var.f57238a) && Objects.equals(this.f57240c, n0Var.f57240c) && Objects.equals(this.f57241d, n0Var.f57241d) && Objects.equals(this.f57247j, n0Var.f57247j) && this.f57242e == n0Var.f57242e && this.f57243f == n0Var.f57243f && this.f57244g == n0Var.f57244g && this.f57245h == n0Var.f57245h && this.f57246i == n0Var.f57246i && this.f57248k == n0Var.f57248k && this.f57249l == n0Var.f57249l && this.m == n0Var.m && this.f57250n == n0Var.f57250n && this.f57251o == n0Var.f57251o && this.f57252p == n0Var.f57252p;
    }

    public final int hashCode() {
        int iHashCode = (this.f57240c.hashCode() + ((this.f57238a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f57241d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        t tVar = this.f57247j;
        int iHashCode3 = (iHashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31;
        long j11 = this.f57242e;
        int i11 = (iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f57243f;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f57244g;
        int i13 = (((((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f57245h ? 1 : 0)) * 31) + (this.f57246i ? 1 : 0)) * 31) + (this.f57248k ? 1 : 0)) * 31;
        long j14 = this.f57249l;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.m;
        int i15 = (((((i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + this.f57250n) * 31) + this.f57251o) * 31;
        long j16 = this.f57252p;
        return i15 + ((int) (j16 ^ (j16 >>> 32)));
    }
}
