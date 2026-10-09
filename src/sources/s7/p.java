package s7;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.Objects;
import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o {
    public final boolean H;
    public final boolean K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final boolean R;
    public final int S;
    public final boolean T;
    public final int U;
    public final boolean V;
    public final boolean W;
    public final int X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f51448f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f51449t;

    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    public p(int i11, p0 p0Var, int i12, j jVar, int i13, String str, int i14, boolean z11) {
        boolean z12;
        boolean z13;
        int i15;
        int iD;
        int i16;
        int i17;
        y6.p pVar;
        int i18;
        int i19;
        int i21;
        y6.p pVar2;
        int i22;
        int i23;
        int i24;
        super(i11, p0Var, i12);
        this.f51448f = jVar;
        boolean z14 = jVar.f51430v;
        ImmutableList immutableList = jVar.f57347i;
        ImmutableList immutableList2 = jVar.f57348j;
        int i25 = z14 ? 24 : 16;
        int i26 = 0;
        this.T = false;
        if (!z11 || (((i22 = (pVar2 = this.f51446d).f57298u) != -1 && i22 > jVar.f57339a) || ((i23 = pVar2.f57299v) != -1 && i23 > jVar.f57340b))) {
            z12 = false;
        } else {
            float f5 = pVar2.f57302y;
            if ((f5 == -1.0f || f5 <= jVar.f57341c) && ((i24 = pVar2.f57288j) == -1 || i24 <= jVar.f57342d)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        this.f51447e = z12;
        if (!z11 || (((i18 = (pVar = this.f51446d).f57298u) != -1 && i18 < 0) || ((i19 = pVar.f57299v) != -1 && i19 < 0))) {
            z13 = false;
        } else {
            float f11 = pVar.f57302y;
            if ((f11 == -1.0f || f11 >= 0) && ((i21 = pVar.f57288j) == -1 || i21 >= 0)) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        this.f51449t = z13;
        this.H = f7.e.n(i13, false);
        y6.p pVar3 = this.f51446d;
        float f12 = pVar3.f57302y;
        this.K = f12 != -1.0f && f12 >= 10.0f;
        this.L = pVar3.f57288j;
        int i27 = pVar3.f57298u;
        this.M = (i27 == -1 || (i17 = pVar3.f57299v) == -1) ? -1 : i27 * i17;
        int i28 = 0;
        while (true) {
            i15 = Integer.MAX_VALUE;
            if (i28 >= immutableList2.size()) {
                iD = 0;
                i28 = Integer.MAX_VALUE;
                break;
            } else {
                iD = q.d(this.f51446d, (String) immutableList2.get(i28), false);
                if (iD > 0) {
                    break;
                } else {
                    i28++;
                }
            }
        }
        this.O = i28;
        this.P = iD;
        int i29 = this.f51446d.f57284f;
        Ordering ordering = q.f51450k;
        this.Q = (i29 == 0 || i29 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i30 = this.f51446d.f57284f;
        this.R = i30 == 0 || (i30 & 1) != 0;
        this.S = q.d(this.f51446d, str, q.g(str) == null);
        for (int i31 = 0; i31 < immutableList.size(); i31++) {
            String str2 = this.f51446d.f57291n;
            if (str2 != null && str2.equals(immutableList.get(i31))) {
                i15 = i31;
                break;
            }
        }
        this.N = i15;
        this.V = (i13 & 384) == 128;
        this.W = (i13 & 64) == 64;
        y6.p pVar4 = this.f51446d;
        String str3 = pVar4.f57291n;
        if (str3 != null) {
            i16 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i16 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i16 = 3;
                    break;
                case "video/avc":
                    i16 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i16 = 2;
                    break;
                default:
                    i16 = 0;
                    break;
            }
        } else {
            i16 = 0;
        }
        this.X = i16;
        boolean z15 = this.f51447e;
        j jVar2 = this.f51448f;
        if ((pVar4.f57284f & 16384) == 0 && f7.e.n(i13, jVar2.f51434z) && (z15 || jVar2.f51429u)) {
            i26 = (f7.e.n(i13, false) && this.f51449t && z15 && pVar4.f57288j != -1 && (i25 & i13) != 0) ? 2 : 1;
        }
        this.U = i26;
    }

    @Override // s7.o
    public final int a() {
        return this.U;
    }

    @Override // s7.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (!this.T && !Objects.equals(this.f51446d.f57291n, pVar.f51446d.f57291n)) {
            return false;
        }
        this.f51448f.getClass();
        return this.V == pVar.V && this.W == pVar.W;
    }
}
