package e9;

import a0.b2;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import fb.g0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements x7.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.w f25182c = new b7.w(new byte[9400], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f25183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f25184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u8.i f25185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f25186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f25187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f25188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f25189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c8.b f25190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x7.o f25191l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25195q;

    public d0(int i11, u8.i iVar, b7.b0 b0Var, b2 b2Var) {
        this.f25184e = b2Var;
        this.f25180a = i11;
        this.f25185f = iVar;
        this.f25181b = Collections.singletonList(b0Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f25187h = sparseBooleanArray;
        this.f25188i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f25186g = sparseArray;
        this.f25183d = new SparseIntArray();
        this.f25189j = new y(1);
        this.f25191l = x7.o.I;
        this.f25195q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (f0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new c0(new ob.c(this)));
    }

    @Override // x7.m
    public final boolean c(x7.n nVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f25182c.f4039a;
        x7.j jVar = (x7.j) nVar;
        jVar.f(bArr, 0, 940, false);
        for (int i11 = 0; i11 < 188; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= 5) {
                    jVar.d(i11, false);
                    return true;
                }
                if (bArr[(i12 * 188) + i11] != 71) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    @Override // x7.m
    public final void e(x7.o oVar) {
        if ((this.f25180a & 1) == 0) {
            oVar = new bq.f(oVar, this.f25185f);
        }
        this.f25191l = oVar;
    }

    @Override // x7.m
    public final void f(long j11, long j12) {
        c8.b bVar;
        long j13;
        SparseArray sparseArray = this.f25186g;
        List list = this.f25181b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b7.b0 b0Var = (b7.b0) list.get(i11);
            synchronized (b0Var) {
                j13 = b0Var.f3955b;
            }
            boolean z11 = j13 == -9223372036854775807L;
            if (!z11) {
                long jD = b0Var.d();
                z11 = (jD == -9223372036854775807L || jD == 0 || jD == j12) ? false : true;
            }
            if (z11) {
                b0Var.e(j12);
            }
        }
        if (j12 != 0 && (bVar = this.f25190k) != null) {
            bVar.d(j12);
        }
        this.f25182c.F(0);
        this.f25183d.clear();
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            ((f0) sparseArray.valueAt(i12)).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [e9.f0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // x7.m
    public final int g(x7.n nVar, kw.b bVar) {
        x7.n nVar2;
        int i11;
        ?? r9;
        ?? r11;
        f0 f0Var;
        boolean z11;
        long length = nVar.getLength();
        if (this.f25192n) {
            long j11 = -9223372036854775807L;
            y yVar = this.f25189j;
            if (length != -1 && !yVar.f25441d) {
                int i12 = this.f25195q;
                b7.b0 b0Var = yVar.f25439b;
                b7.w wVar = yVar.f25440c;
                if (i12 <= 0) {
                    yVar.a(nVar);
                    return 0;
                }
                if (yVar.f25443f) {
                    if (yVar.f25445h == -9223372036854775807L) {
                        yVar.a(nVar);
                        return 0;
                    }
                    if (yVar.f25442e) {
                        long j12 = yVar.f25444g;
                        if (j12 == -9223372036854775807L) {
                            yVar.a(nVar);
                            return 0;
                        }
                        yVar.f25446i = b0Var.c(yVar.f25445h) - b0Var.b(j12);
                        yVar.a(nVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, nVar.getLength());
                    long j13 = 0;
                    if (nVar.getPosition() != j13) {
                        bVar.f38845a = j13;
                        return 1;
                    }
                    wVar.F(iMin);
                    nVar.r();
                    nVar.A(wVar.f4039a, 0, iMin);
                    int i13 = wVar.f4041c;
                    for (int i14 = wVar.f4040b; i14 < i13; i14++) {
                        if (wVar.f4039a[i14] == 71) {
                            long jY = g0.y(wVar, i14, i12);
                            if (jY != -9223372036854775807L) {
                                j11 = jY;
                                break;
                            }
                        }
                    }
                    yVar.f25444g = j11;
                    yVar.f25442e = true;
                    return 0;
                }
                long length2 = nVar.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j14 = length2 - ((long) iMin2);
                if (nVar.getPosition() != j14) {
                    bVar.f38845a = j14;
                    return 1;
                }
                wVar.F(iMin2);
                nVar.r();
                nVar.A(wVar.f4039a, 0, iMin2);
                int i15 = wVar.f4040b;
                int i16 = wVar.f4041c;
                for (int i17 = i16 - 188; i17 >= i15; i17--) {
                    byte[] bArr = wVar.f4039a;
                    int i18 = 0;
                    for (int i19 = -4; i19 <= 4; i19++) {
                        int i21 = (i19 * 188) + i17;
                        if (i21 >= i15 && i21 < i16 && bArr[i21] == 71) {
                            i18++;
                            if (i18 == 5) {
                                long jY2 = g0.y(wVar, i17, i12);
                                if (jY2 == -9223372036854775807L) {
                                    break;
                                }
                                j11 = jY2;
                                break;
                            }
                        } else {
                            i18 = 0;
                        }
                    }
                }
                yVar.f25445h = j11;
                yVar.f25443f = true;
                return 0;
            }
            if (this.f25193o) {
                i11 = 1;
                z11 = false;
            } else {
                this.f25193o = true;
                long j15 = yVar.f25446i;
                if (j15 != -9223372036854775807L) {
                    i11 = 1;
                    z11 = false;
                    c8.b bVar2 = new c8.b(new re.g0(12), new ij.d(this.f25195q, yVar.f25439b), j15, 1 + j15, 0L, length, 188L, 940);
                    this.f25190k = bVar2;
                    this.f25191l.q(bVar2.f6720a);
                } else {
                    z11 = false;
                    i11 = 1;
                    this.f25191l.q(new x7.q(j15));
                }
            }
            if (this.f25194p) {
                this.f25194p = z11;
                f(0L, 0L);
                if (nVar.getPosition() != 0) {
                    bVar.f38845a = 0L;
                    return i11;
                }
            }
            c8.b bVar3 = this.f25190k;
            if (bVar3 != null && bVar3.f6722c != null) {
                return bVar3.b(nVar, bVar);
            }
            nVar2 = nVar;
            r9 = z11;
        } else {
            nVar2 = nVar;
            i11 = 1;
            r9 = 0;
        }
        b7.w wVar2 = this.f25182c;
        byte[] bArr2 = wVar2.f4039a;
        if (9400 - wVar2.f4040b < 188) {
            int iA = wVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, wVar2.f4040b, bArr2, r9, iA);
            }
            wVar2.G(bArr2, iA);
        }
        while (true) {
            int iA2 = wVar2.a();
            ?? r12 = this.f25186g;
            if (iA2 >= 188) {
                int i22 = wVar2.f4040b;
                int i23 = wVar2.f4041c;
                byte[] bArr3 = wVar2.f4039a;
                while (i22 < i23 && bArr3[i22] != 71) {
                    i22++;
                }
                wVar2.I(i22);
                int i24 = i22 + 188;
                int i25 = wVar2.f4041c;
                if (i24 > i25) {
                    return r9;
                }
                int iJ = wVar2.j();
                if ((8388608 & iJ) != 0) {
                    wVar2.I(i24);
                    return r9;
                }
                ?? r13 = (4194304 & iJ) != 0 ? 1 : r9;
                int i26 = (2096896 & iJ) >> 8;
                ?? r14 = (iJ & 32) != 0 ? 1 : r9;
                if ((iJ & 16) != 0) {
                    f0Var = (f0) r12.get(i26);
                } else {
                    r11 = 0;
                }
                if (r11 == 0) {
                    r11 = f0Var;
                    wVar2.I(i24);
                    return r9;
                }
                int i27 = iJ & 15;
                SparseIntArray sparseIntArray = this.f25183d;
                int i28 = sparseIntArray.get(i26, i27 - 1);
                sparseIntArray.put(i26, i27);
                if (i28 == i27) {
                    r11 = f0Var;
                    wVar2.I(i24);
                    return r9;
                }
                if (i27 != ((i28 + 1) & 15)) {
                    r11 = f0Var;
                    r11.a();
                }
                if (r14 != 0) {
                    int iW = wVar2.w();
                    r13 = (r13 == true ? 1 : 0) | ((wVar2.w() & 64) != 0 ? 2 : r9);
                    wVar2.J(iW - 1);
                }
                boolean z12 = this.f25192n;
                if (z12 || !this.f25188i.get(i26, r9)) {
                    wVar2.H(i24);
                    r11.c(r13, wVar2);
                    wVar2.H(i25);
                }
                if (!z12 && this.f25192n && length != -1) {
                    this.f25194p = true;
                }
                wVar2.I(i24);
                return r9;
            }
            int i29 = wVar2.f4041c;
            int i30 = nVar2.read(bArr2, i29, 9400 - i29);
            if (i30 == -1) {
                for (?? r15 = r9; r15 < r12.size(); r15++) {
                    f0 f0Var2 = (f0) r12.valueAt(r15);
                    if (f0Var2 instanceof x) {
                        x xVar = (x) f0Var2;
                        if (xVar.f25428c == 3 && xVar.f25435j == -1) {
                            xVar.c(i11, new b7.w());
                        }
                    }
                    i11 = 1;
                }
                return -1;
            }
            wVar2.H(i29 + i30);
            i11 = 1;
        }
    }

    @Override // x7.m
    public final void release() {
    }
}
