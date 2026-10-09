package z7;

import b7.f0;
import java.math.RoundingMode;
import x7.e0;
import x7.x;
import x7.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f59011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f59012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f59015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f59018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f59019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f59021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f59022l;
    public long[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f59023n;

    public e(int i11, d dVar, e0 e0Var) {
        int i12 = dVar.f59008d;
        this.f59011a = dVar;
        int iA = dVar.a();
        boolean z11 = true;
        if (iA != 1 && iA != 2) {
            z11 = false;
        }
        b7.a.d(z11);
        int i13 = (((i11 % 10) + 48) << 8) | ((i11 / 10) + 48);
        this.f59013c = (iA == 2 ? 1667497984 : 1651965952) | i13;
        long j11 = ((long) dVar.f59006b) * 1000000;
        long j12 = dVar.f59007c;
        String str = f0.f3975a;
        this.f59015e = f0.R(i12, j11, j12, RoundingMode.DOWN);
        this.f59012b = e0Var;
        this.f59014d = iA == 2 ? i13 | 1650720768 : -1;
        this.f59022l = -1L;
        this.m = new long[512];
        this.f59023n = new int[512];
        this.f59016f = i12;
    }

    public final z a(int i11) {
        return new z(((this.f59015e * ((long) 1)) / ((long) this.f59016f)) * ((long) this.f59023n[i11]), this.m[i11]);
    }

    public final x b(long j11) {
        if (this.f59021k == 0) {
            z zVar = new z(0L, this.f59022l);
            return new x(zVar, zVar);
        }
        int i11 = (int) (j11 / ((this.f59015e * ((long) 1)) / ((long) this.f59016f)));
        int iC = f0.c(this.f59023n, i11, true, true);
        if (this.f59023n[iC] == i11) {
            z zVarA = a(iC);
            return new x(zVarA, zVarA);
        }
        z zVarA2 = a(iC);
        int i12 = iC + 1;
        return i12 < this.m.length ? new x(zVarA2, a(i12)) : new x(zVarA2, zVarA2);
    }
}
