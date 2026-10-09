package s7;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.tbruyelle.rxpermissions3.BuildConfig;
import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o implements Comparable {
    public final boolean H;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f51441f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f51442t;

    /* JADX WARN: Multi-variable type inference failed */
    public m(int i11, p0 p0Var, int i12, j jVar, int i13, String str, String str2) {
        int iD;
        super(i11, p0Var, i12);
        int i14 = 0;
        this.f51441f = f7.e.n(i13, false);
        int i15 = this.f51446d.f57283e;
        int i16 = jVar.f57355r;
        ImmutableList immutableList = jVar.f57353p;
        int i17 = i15 & (~i16);
        this.f51442t = (i17 & 1) != 0;
        this.H = (i17 & 2) != 0;
        ImmutableList immutableListU = str2 != null ? ImmutableList.u(str2) : immutableList.isEmpty() ? ImmutableList.u(BuildConfig.VERSION_NAME) : immutableList;
        int i18 = 0;
        while (true) {
            if (i18 >= immutableListU.size()) {
                iD = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                iD = q.d(this.f51446d, (String) immutableListU.get(i18), false);
                if (iD > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.K = i18;
        this.L = iD;
        int i19 = str2 != null ? 1088 : 0;
        int i21 = this.f51446d.f57284f;
        Ordering ordering = q.f51450k;
        int iBitCount = (i21 == 0 || i21 != i19) ? Integer.bitCount(i19 & i21) : Integer.MAX_VALUE;
        this.M = iBitCount;
        this.O = (1088 & this.f51446d.f57284f) != 0;
        int iD2 = q.d(this.f51446d, str, q.g(str) == null);
        this.N = iD2;
        boolean z11 = iD > 0 || (immutableList.isEmpty() && iBitCount > 0) || this.f51442t || (this.H && iD2 > 0);
        if (f7.e.n(i13, jVar.f51434z) && z11) {
            i14 = 1;
        }
        this.f51440e = i14;
    }

    @Override // s7.o
    public final int a() {
        return this.f51440e;
    }

    @Override // s7.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        ComparisonChain comparisonChainC = ComparisonChain.f16669a.d(this.f51441f, mVar.f51441f).c(Integer.valueOf(this.K), Integer.valueOf(mVar.K), Ordering.c().g());
        int i11 = mVar.L;
        int i12 = this.L;
        ComparisonChain comparisonChainA = comparisonChainC.a(i12, i11);
        int i13 = mVar.M;
        int i14 = this.M;
        ComparisonChain comparisonChainA2 = comparisonChainA.a(i14, i13).d(this.f51442t, mVar.f51442t).c(Boolean.valueOf(this.H), Boolean.valueOf(mVar.H), i12 == 0 ? Ordering.c() : Ordering.c().g()).a(this.N, mVar.N);
        if (i14 == 0) {
            comparisonChainA2 = comparisonChainA2.e(this.O, mVar.O);
        }
        return comparisonChainA2.f();
    }
}
