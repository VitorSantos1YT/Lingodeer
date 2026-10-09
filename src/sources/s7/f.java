package s7;

import android.content.res.Resources;
import android.text.TextUtils;
import b7.f0;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.Objects;
import y6.p0;
import y6.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o implements Comparable {
    public final j H;
    public final boolean K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final int Q;
    public final int R;
    public final boolean S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f51417f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f51418t;

    /* JADX WARN: Code duplicated, block: B:109:0x016f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:86:0x012f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0138  */
    /* JADX WARN: Code duplicated, block: B:90:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    public f(int i11, p0 p0Var, int i12, j jVar, int i13, boolean z11, e eVar, int i14) {
        int i15;
        int iD;
        boolean z12;
        int iD2;
        boolean z13;
        boolean z14;
        boolean z15;
        r0 r0Var;
        super(i11, p0Var, i12);
        this.H = jVar;
        boolean z16 = jVar.f51432x;
        ImmutableList immutableList = jVar.f57351n;
        ImmutableList immutableList2 = jVar.f57349k;
        int i16 = z16 ? 24 : 16;
        int i17 = 0;
        this.O = false;
        this.f51418t = q.g(this.f51446d.f57282d);
        this.K = f7.e.n(i13, false);
        int i18 = 0;
        while (true) {
            i15 = Integer.MAX_VALUE;
            if (i18 >= immutableList2.size()) {
                iD = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                iD = q.d(this.f51446d, (String) immutableList2.get(i18), false);
                if (iD > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.M = i18;
        this.L = iD;
        int i19 = this.f51446d.f57284f;
        this.N = (i19 == 0 || i19 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        y6.p pVar = this.f51446d;
        int i21 = pVar.f57284f;
        this.P = i21 == 0 || (i21 & 1) != 0;
        this.S = (pVar.f57283e & 1) != 0;
        String str = pVar.f57291n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z12 = true;
                    break;
                default:
                    z12 = false;
                    break;
            }
        } else {
            z12 = false;
        }
        this.Z = z12;
        int i22 = pVar.F;
        this.T = i22;
        this.U = pVar.G;
        int i23 = pVar.f57288j;
        this.V = i23;
        this.f51417f = (i23 == -1 || i23 <= jVar.m) && (i22 == -1 || i22 <= jVar.f57350l) && eVar.apply(pVar);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i24 = 0; i24 < strArrSplit.length; i24++) {
            strArrSplit[i24] = f0.L(strArrSplit[i24]);
        }
        int i25 = 0;
        while (true) {
            if (i25 < strArrSplit.length) {
                iD2 = q.d(this.f51446d, strArrSplit[i25], false);
                if (iD2 <= 0) {
                    i25++;
                }
            } else {
                iD2 = 0;
                i25 = Integer.MAX_VALUE;
            }
        }
        this.Q = i25;
        this.R = iD2;
        for (int i26 = 0; i26 < immutableList.size(); i26++) {
            String str2 = this.f51446d.f57291n;
            if (str2 != null && str2.equals(immutableList.get(i26))) {
                i15 = i26;
                this.W = i15;
                if ((i13 & 384) == 128) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.X = z13;
                if ((i13 & 64) == 64) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.Y = z14;
                boolean z17 = this.f51417f;
                j jVar2 = this.H;
                z15 = jVar2.f51434z;
                r0Var = jVar2.f57352o;
                if (f7.e.n(i13, z15) && (z17 || jVar2.f51431w)) {
                    r0Var.getClass();
                    if (f7.e.n(i13, false) || !z17 || this.f51446d.f57288j == -1 || ((!jVar2.A && z11) || (i16 & i13) == 0)) {
                        i17 = 1;
                    } else {
                        i17 = 2;
                    }
                }
                this.f51416e = i17;
            }
        }
        this.W = i15;
        if ((i13 & 384) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.X = z13;
        if ((i13 & 64) == 64) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.Y = z14;
        boolean z18 = this.f51417f;
        j jVar3 = this.H;
        z15 = jVar3.f51434z;
        r0Var = jVar3.f57352o;
        if (f7.e.n(i13, z15)) {
            r0Var.getClass();
            if (f7.e.n(i13, false)) {
                i17 = 1;
            } else {
                i17 = 1;
            }
        }
        this.f51416e = i17;
    }

    @Override // s7.o
    public final int a() {
        return this.f51416e;
    }

    @Override // s7.o
    public final boolean b(o oVar) {
        int i11;
        String str;
        f fVar = (f) oVar;
        y6.p pVar = fVar.f51446d;
        this.H.getClass();
        y6.p pVar2 = this.f51446d;
        int i12 = pVar2.F;
        if (i12 == -1 || i12 != pVar.F) {
            return false;
        }
        return (this.O || ((str = pVar2.f57291n) != null && TextUtils.equals(str, pVar.f57291n))) && (i11 = pVar2.G) != -1 && i11 == pVar.G && this.X == fVar.X && this.Y == fVar.Y;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z11 = this.K;
        boolean z12 = this.f51417f;
        Ordering orderingG = (z12 && z11) ? q.f51450k : q.f51450k.g();
        ComparisonChain comparisonChain = ComparisonChain.f16669a;
        boolean z13 = fVar.K;
        int i11 = fVar.V;
        ComparisonChain comparisonChainC = comparisonChain.d(z11, z13).c(Integer.valueOf(this.M), Integer.valueOf(fVar.M), Ordering.c().g()).a(this.L, fVar.L).a(this.N, fVar.N).d(this.S, fVar.S).d(this.P, fVar.P).c(Integer.valueOf(this.Q), Integer.valueOf(fVar.Q), Ordering.c().g()).a(this.R, fVar.R).d(z12, fVar.f51417f).c(Integer.valueOf(this.W), Integer.valueOf(fVar.W), Ordering.c().g());
        this.H.getClass();
        ComparisonChain comparisonChainC2 = comparisonChainC.d(this.X, fVar.X).d(this.Y, fVar.Y).d(this.Z, fVar.Z).c(Integer.valueOf(this.T), Integer.valueOf(fVar.T), orderingG).c(Integer.valueOf(this.U), Integer.valueOf(fVar.U), orderingG);
        if (Objects.equals(this.f51418t, fVar.f51418t)) {
            comparisonChainC2 = comparisonChainC2.c(Integer.valueOf(this.V), Integer.valueOf(i11), orderingG);
        }
        return comparisonChainC2.f();
    }
}
