package p7;

import android.util.SparseArray;
import b0.p2;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements x7.e0 {
    public y6.p A;
    public y6.p B;
    public boolean D;
    public long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f46538a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k7.g f46541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7.c f46542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f46543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y6.p f46544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hd.b f46545h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f46552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f46553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f46554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f46555s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f46559w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f46562z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7.e f46539b = new l7.e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46546i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f46547j = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f46548k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f46550n = new long[1000];
    public int[] m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f46549l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x7.d0[] f46551o = new x7.d0[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij.d f46540c = new ij.d(new nf.f(8));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f46556t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f46557u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f46558v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f46561y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f46560x = true;
    public boolean C = true;

    public y0(t7.g gVar, k7.g gVar2, k7.c cVar) {
        this.f46541d = gVar2;
        this.f46542e = cVar;
        this.f46538a = new w0(gVar);
    }

    @Override // x7.e0
    public final void a(b7.w wVar, int i11, int i12) {
        while (true) {
            w0 w0Var = this.f46538a;
            if (i11 <= 0) {
                w0Var.getClass();
                return;
            }
            int iC = w0Var.c(i11);
            p2 p2Var = w0Var.f46527f;
            t7.a aVar = (t7.a) p2Var.f3638c;
            wVar.h(aVar.f52049a, ((int) (w0Var.f46528g - p2Var.f3636a)) + aVar.f52050b, iC);
            i11 -= iC;
            long j11 = w0Var.f46528g + ((long) iC);
            w0Var.f46528g = j11;
            p2 p2Var2 = w0Var.f46527f;
            if (j11 == p2Var2.f3637b) {
                w0Var.f46527f = (p2) p2Var2.f3639d;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:10:0x002b, B:14:0x0037, B:19:0x0049, B:21:0x0062, B:25:0x007c, B:24:0x007a), top: B:35:0x002b }] */
    @Override // x7.e0
    public final void b(y6.p pVar) {
        y6.p pVar2;
        if (this.E == 0 || pVar.f57296s == Long.MAX_VALUE) {
            pVar2 = pVar;
        } else {
            y6.o oVarA = pVar.a();
            oVarA.f57269r = pVar.f57296s + this.E;
            pVar2 = new y6.p(oVarA);
        }
        boolean z11 = false;
        this.f46562z = false;
        this.A = pVar;
        synchronized (this) {
            try {
                this.f46561y = false;
                if (!Objects.equals(pVar2, this.B)) {
                    if (((SparseArray) this.f46540c.f34422c).size() == 0) {
                        this.B = pVar2;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f46540c.f34422c;
                        if (((x0) sparseArray.valueAt(sparseArray.size() - 1)).f46536a.equals(pVar2)) {
                            SparseArray sparseArray2 = (SparseArray) this.f46540c.f34422c;
                            this.B = ((x0) sparseArray2.valueAt(sparseArray2.size() - 1)).f46536a;
                        } else {
                            this.B = pVar2;
                        }
                    }
                    boolean z12 = this.C;
                    y6.p pVar3 = this.B;
                    this.C = z12 & y6.d0.a(pVar3.f57291n, pVar3.f57289k);
                    this.D = false;
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        s0 s0Var = this.f46543f;
        if (s0Var == null || !z11) {
            return;
        }
        s0Var.S.post(s0Var.Q);
    }

    @Override // x7.e0
    public final int c(y6.h hVar, int i11, boolean z11) throws EOFException {
        w0 w0Var = this.f46538a;
        int iC = w0Var.c(i11);
        p2 p2Var = w0Var.f46527f;
        t7.a aVar = (t7.a) p2Var.f3638c;
        int i12 = hVar.read(aVar.f52049a, ((int) (w0Var.f46528g - p2Var.f3636a)) + aVar.f52050b, iC);
        if (i12 == -1) {
            if (z11) {
                return -1;
            }
            throw new EOFException();
        }
        long j11 = w0Var.f46528g + ((long) i12);
        w0Var.f46528g = j11;
        p2 p2Var2 = w0Var.f46527f;
        if (j11 == p2Var2.f3637b) {
            w0Var.f46527f = (p2) p2Var2.f3639d;
        }
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:26:0x0052, B:28:0x0056, B:32:0x006c, B:35:0x0073, B:39:0x007b, B:44:0x00b6, B:67:0x0131, B:69:0x013a, B:46:0x00d1, B:48:0x00da, B:50:0x00e2, B:52:0x00f7, B:56:0x0100, B:57:0x0105, B:59:0x010b, B:63:0x0119, B:65:0x011e, B:66:0x012e, B:49:0x00e0), top: B:74:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00da A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:26:0x0052, B:28:0x0056, B:32:0x006c, B:35:0x0073, B:39:0x007b, B:44:0x00b6, B:67:0x0131, B:69:0x013a, B:46:0x00d1, B:48:0x00da, B:50:0x00e2, B:52:0x00f7, B:56:0x0100, B:57:0x0105, B:59:0x010b, B:63:0x0119, B:65:0x011e, B:66:0x012e, B:49:0x00e0), top: B:74:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:26:0x0052, B:28:0x0056, B:32:0x006c, B:35:0x0073, B:39:0x007b, B:44:0x00b6, B:67:0x0131, B:69:0x013a, B:46:0x00d1, B:48:0x00da, B:50:0x00e2, B:52:0x00f7, B:56:0x0100, B:57:0x0105, B:59:0x010b, B:63:0x0119, B:65:0x011e, B:66:0x012e, B:49:0x00e0), top: B:74:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7 A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:26:0x0052, B:28:0x0056, B:32:0x006c, B:35:0x0073, B:39:0x007b, B:44:0x00b6, B:67:0x0131, B:69:0x013a, B:46:0x00d1, B:48:0x00da, B:50:0x00e2, B:52:0x00f7, B:56:0x0100, B:57:0x0105, B:59:0x010b, B:63:0x0119, B:65:0x011e, B:66:0x012e, B:49:0x00e0), top: B:74:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:59:0x010b A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:26:0x0052, B:28:0x0056, B:32:0x006c, B:35:0x0073, B:39:0x007b, B:44:0x00b6, B:67:0x0131, B:69:0x013a, B:46:0x00d1, B:48:0x00da, B:50:0x00e2, B:52:0x00f7, B:56:0x0100, B:57:0x0105, B:59:0x010b, B:63:0x0119, B:65:0x011e, B:66:0x012e, B:49:0x00e0), top: B:74:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:26:0x0052, B:28:0x0056, B:32:0x006c, B:35:0x0073, B:39:0x007b, B:44:0x00b6, B:67:0x0131, B:69:0x013a, B:46:0x00d1, B:48:0x00da, B:50:0x00e2, B:52:0x00f7, B:56:0x0100, B:57:0x0105, B:59:0x010b, B:63:0x0119, B:65:0x011e, B:66:0x012e, B:49:0x00e0), top: B:74:0x0052 }] */
    @Override // x7.e0
    public final void d(long j11, int i11, int i12, int i13, x7.d0 d0Var) {
        k7.g gVar;
        k7.f fVar;
        ij.d dVar;
        int i14;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z11;
        boolean z12;
        if (this.f46562z) {
            y6.p pVar = this.A;
            b7.a.k(pVar);
            b(pVar);
        }
        int i15 = i11 & 1;
        boolean z13 = i15 != 0;
        if (this.f46560x) {
            if (!z13) {
                return;
            } else {
                this.f46560x = false;
            }
        }
        long j12 = j11 + this.E;
        if (this.C) {
            if (j12 < this.f46556t) {
                return;
            }
            if (i15 == 0) {
                if (!this.D) {
                    b7.a.B("Overriding unexpected non-sync sample for format: " + this.B);
                    this.D = true;
                }
                i11 |= 1;
            }
        }
        long j13 = (this.f46538a.f46528g - ((long) i12)) - ((long) i13);
        synchronized (this) {
            try {
                int i16 = this.f46552p;
                if (i16 > 0) {
                    int iN = n(i16 - 1);
                    b7.a.d(this.f46548k[iN] + ((long) this.f46549l[iN]) <= j13);
                }
                this.f46559w = (536870912 & i11) != 0;
                this.f46558v = Math.max(this.f46558v, j12);
                int iN2 = n(this.f46552p);
                this.f46550n[iN2] = j12;
                this.f46548k[iN2] = j13;
                this.f46549l[iN2] = i12;
                this.m[iN2] = i11;
                this.f46551o[iN2] = d0Var;
                this.f46547j[iN2] = 0;
                if (((SparseArray) this.f46540c.f34422c).size() == 0) {
                    y6.p pVar2 = this.B;
                    pVar2.getClass();
                    gVar = this.f46541d;
                    if (gVar != null) {
                        gVar.getClass();
                        fVar = k7.f.f37959a;
                    } else {
                        fVar = k7.f.f37959a;
                    }
                    dVar = this.f46540c;
                    i14 = this.f46553q + this.f46552p;
                    x0 x0Var = new x0(pVar2, fVar);
                    sparseArray = (SparseArray) dVar.f34422c;
                    if (dVar.f34421b == -1) {
                        if (sparseArray.size() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        b7.a.j(z12);
                        dVar.f34421b = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i14 >= iKeyAt) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        b7.a.d(z11);
                        if (iKeyAt == i14) {
                            ((nf.f) dVar.f34423d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i14, x0Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f46540c.f34422c;
                    if (!((x0) sparseArray2.valueAt(sparseArray2.size() - 1)).f46536a.equals(this.B)) {
                        y6.p pVar3 = this.B;
                        pVar3.getClass();
                        gVar = this.f46541d;
                        if (gVar != null) {
                            gVar.getClass();
                            fVar = k7.f.f37959a;
                        } else {
                            fVar = k7.f.f37959a;
                        }
                        dVar = this.f46540c;
                        i14 = this.f46553q + this.f46552p;
                        x0 x0Var2 = new x0(pVar3, fVar);
                        sparseArray = (SparseArray) dVar.f34422c;
                        if (dVar.f34421b == -1) {
                            if (sparseArray.size() == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            b7.a.j(z12);
                            dVar.f34421b = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i14 >= iKeyAt) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            b7.a.d(z11);
                            if (iKeyAt == i14) {
                                ((nf.f) dVar.f34423d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i14, x0Var2);
                    }
                }
                int i17 = this.f46552p + 1;
                this.f46552p = i17;
                int i18 = this.f46546i;
                if (i17 == i18) {
                    int i19 = i18 + 1000;
                    long[] jArr = new long[i19];
                    long[] jArr2 = new long[i19];
                    long[] jArr3 = new long[i19];
                    int[] iArr = new int[i19];
                    int[] iArr2 = new int[i19];
                    x7.d0[] d0VarArr = new x7.d0[i19];
                    int i21 = this.f46554r;
                    int i22 = i18 - i21;
                    System.arraycopy(this.f46548k, i21, jArr2, 0, i22);
                    System.arraycopy(this.f46550n, this.f46554r, jArr3, 0, i22);
                    System.arraycopy(this.m, this.f46554r, iArr, 0, i22);
                    System.arraycopy(this.f46549l, this.f46554r, iArr2, 0, i22);
                    System.arraycopy(this.f46551o, this.f46554r, d0VarArr, 0, i22);
                    System.arraycopy(this.f46547j, this.f46554r, jArr, 0, i22);
                    int i23 = this.f46554r;
                    System.arraycopy(this.f46548k, 0, jArr2, i22, i23);
                    System.arraycopy(this.f46550n, 0, jArr3, i22, i23);
                    System.arraycopy(this.m, 0, iArr, i22, i23);
                    System.arraycopy(this.f46549l, 0, iArr2, i22, i23);
                    System.arraycopy(this.f46551o, 0, d0VarArr, i22, i23);
                    System.arraycopy(this.f46547j, 0, jArr, i22, i23);
                    this.f46548k = jArr2;
                    this.f46550n = jArr3;
                    this.m = iArr;
                    this.f46549l = iArr2;
                    this.f46551o = d0VarArr;
                    this.f46547j = jArr;
                    this.f46554r = 0;
                    this.f46546i = i19;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long e(int i11) {
        this.f46557u = Math.max(this.f46557u, l(i11));
        this.f46552p -= i11;
        int i12 = this.f46553q + i11;
        this.f46553q = i12;
        int i13 = this.f46554r + i11;
        this.f46554r = i13;
        int i14 = this.f46546i;
        if (i13 >= i14) {
            this.f46554r = i13 - i14;
        }
        int i15 = this.f46555s - i11;
        this.f46555s = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f46555s = 0;
        }
        ij.d dVar = this.f46540c;
        SparseArray sparseArray = (SparseArray) dVar.f34422c;
        while (i16 < sparseArray.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < sparseArray.keyAt(i17)) {
                break;
            }
            ((nf.f) dVar.f34423d).accept(sparseArray.valueAt(i16));
            sparseArray.removeAt(i16);
            int i18 = dVar.f34421b;
            if (i18 > 0) {
                dVar.f34421b = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f46552p != 0) {
            return this.f46548k[this.f46554r];
        }
        int i19 = this.f46554r;
        if (i19 == 0) {
            i19 = this.f46546i;
        }
        int i21 = i19 - 1;
        return this.f46548k[i21] + ((long) this.f46549l[i21]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void f(long j11, boolean z11) throws Throwable {
        Throwable th2;
        w0 w0Var = this.f46538a;
        synchronized (this) {
            try {
                try {
                    int i11 = this.f46552p;
                    long jE = -1;
                    if (i11 != 0) {
                        long[] jArr = this.f46550n;
                        int i12 = this.f46554r;
                        if (j11 >= jArr[i12]) {
                            if (z11) {
                                try {
                                    int i13 = this.f46555s;
                                    if (i13 != i11) {
                                        i11 = i13 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int iJ = j(i12, i11, j11, false);
                            if (iJ != -1) {
                                jE = e(iJ);
                            }
                        }
                    }
                    w0Var.b(jE);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void g() {
        long jE;
        w0 w0Var = this.f46538a;
        synchronized (this) {
            int i11 = this.f46552p;
            jE = i11 == 0 ? -1L : e(i11);
        }
        w0Var.b(jE);
    }

    public final void h(long j11) {
        if (this.f46552p == 0) {
            return;
        }
        b7.a.d(j11 > k());
        int i11 = this.f46552p;
        int iN = n(i11 - 1);
        while (i11 > this.f46555s && this.f46550n[iN] >= j11) {
            i11--;
            iN--;
            if (iN == -1) {
                iN = this.f46546i - 1;
            }
        }
        i(this.f46553q + i11);
    }

    public final void i(int i11) {
        long j11;
        int i12 = this.f46553q;
        int i13 = this.f46552p;
        int i14 = (i12 + i13) - i11;
        boolean z11 = false;
        b7.a.d(i14 >= 0 && i14 <= i13 - this.f46555s);
        int i15 = this.f46552p - i14;
        this.f46552p = i15;
        this.f46558v = Math.max(this.f46557u, l(i15));
        if (i14 == 0 && this.f46559w) {
            z11 = true;
        }
        this.f46559w = z11;
        ij.d dVar = this.f46540c;
        SparseArray sparseArray = (SparseArray) dVar.f34422c;
        for (int size = sparseArray.size() - 1; size >= 0 && i11 < sparseArray.keyAt(size); size--) {
            ((nf.f) dVar.f34423d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        dVar.f34421b = sparseArray.size() > 0 ? Math.min(dVar.f34421b, sparseArray.size() - 1) : -1;
        int i16 = this.f46552p;
        if (i16 != 0) {
            int iN = n(i16 - 1);
            j11 = this.f46548k[iN] + ((long) this.f46549l[iN]);
        } else {
            j11 = 0;
        }
        w0 w0Var = this.f46538a;
        int i17 = w0Var.f46523b;
        b7.a.d(j11 <= w0Var.f46528g);
        w0Var.f46528g = j11;
        if (j11 != 0) {
            p2 p2Var = w0Var.f46525d;
            if (j11 != p2Var.f3636a) {
                while (w0Var.f46528g > p2Var.f3637b) {
                    p2Var = (p2) p2Var.f3639d;
                }
                p2 p2Var2 = (p2) p2Var.f3639d;
                p2Var2.getClass();
                w0Var.a(p2Var2);
                p2 p2Var3 = new p2(p2Var.f3637b, i17);
                p2Var.f3639d = p2Var3;
                if (w0Var.f46528g == p2Var.f3637b) {
                    p2Var = p2Var3;
                }
                w0Var.f46527f = p2Var;
                if (w0Var.f46526e == p2Var2) {
                    w0Var.f46526e = p2Var3;
                    return;
                }
                return;
            }
        }
        w0Var.a(w0Var.f46525d);
        p2 p2Var4 = new p2(w0Var.f46528g, i17);
        w0Var.f46525d = p2Var4;
        w0Var.f46526e = p2Var4;
        w0Var.f46527f = p2Var4;
    }

    public final int j(int i11, int i12, long j11, boolean z11) {
        int i13 = -1;
        for (int i14 = 0; i14 < i12; i14++) {
            long j12 = this.f46550n[i11];
            if (j12 > j11) {
                break;
            }
            if (!z11 || (this.m[i11] & 1) != 0) {
                if (j12 == j11) {
                    return i14;
                }
                i13 = i14;
            }
            i11++;
            if (i11 == this.f46546i) {
                i11 = 0;
            }
        }
        return i13;
    }

    public final synchronized long k() {
        return Math.max(this.f46557u, l(this.f46555s));
    }

    public final long l(int i11) {
        long jMax = Long.MIN_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int iN = n(i11 - 1);
        for (int i12 = 0; i12 < i11; i12++) {
            jMax = Math.max(jMax, this.f46550n[iN]);
            if ((this.m[iN] & 1) != 0) {
                return jMax;
            }
            iN--;
            if (iN == -1) {
                iN = this.f46546i - 1;
            }
        }
        return jMax;
    }

    public final int m() {
        return this.f46553q + this.f46555s;
    }

    public final int n(int i11) {
        int i12 = this.f46554r + i11;
        int i13 = this.f46546i;
        return i12 < i13 ? i12 : i12 - i13;
    }

    public final synchronized int o(long j11, boolean z11) {
        try {
            try {
                int iN = n(this.f46555s);
                int i11 = this.f46555s;
                int i12 = this.f46552p;
                if (!(i11 != i12) || j11 < this.f46550n[iN]) {
                    return 0;
                }
                if (j11 > this.f46558v && z11) {
                    return i12 - i11;
                }
                int iJ = j(iN, i12 - i11, j11, true);
                if (iJ == -1) {
                    return 0;
                }
                return iJ;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized boolean p(boolean z11) {
        y6.p pVar;
        boolean z12 = false;
        if (this.f46555s != this.f46552p) {
            if (((x0) this.f46540c.g(m())).f46536a != this.f46544g) {
                return true;
            }
            return q(n(this.f46555s));
        }
        if (z11 || this.f46559w || ((pVar = this.B) != null && pVar != this.f46544g)) {
            z12 = true;
        }
        return z12;
    }

    public final boolean q(int i11) {
        hd.b bVar = this.f46545h;
        if (bVar == null || bVar.r() == 4) {
            return true;
        }
        if ((this.m[i11] & 1073741824) != 0) {
            return false;
        }
        this.f46545h.getClass();
        return false;
    }

    public final void r(y6.p pVar, ob.e eVar) {
        y6.p pVar2;
        y6.p pVar3 = this.f46544g;
        boolean z11 = pVar3 == null;
        y6.l lVar = pVar3 == null ? null : pVar3.f57295r;
        this.f46544g = pVar;
        y6.l lVar2 = pVar.f57295r;
        k7.g gVar = this.f46541d;
        if (gVar != null) {
            int iB = gVar.b(pVar);
            y6.o oVarA = pVar.a();
            oVarA.N = iB;
            pVar2 = new y6.p(oVarA);
        } else {
            pVar2 = pVar;
        }
        eVar.f44805c = pVar2;
        eVar.f44804b = this.f46545h;
        if (gVar == null) {
            return;
        }
        if (z11 || !Objects.equals(lVar, lVar2)) {
            hd.b bVar = this.f46545h;
            k7.c cVar = this.f46542e;
            hd.b bVarD = gVar.d(cVar, pVar);
            this.f46545h = bVarD;
            eVar.f44804b = bVarD;
            if (bVar != null) {
                bVar.x(cVar);
            }
        }
    }

    public final int s(ob.e eVar, e7.d dVar, int i11, boolean z11) {
        int i12;
        l7.e eVar2 = this.f46539b;
        w0 w0Var = this.f46538a;
        boolean z12 = (i11 & 2) != 0;
        synchronized (this) {
            dVar.f25116f = false;
            i12 = -3;
            if (this.f46555s != this.f46552p) {
                y6.p pVar = ((x0) this.f46540c.g(m())).f46536a;
                if (z12 || pVar != this.f46544g) {
                    r(pVar, eVar);
                    i12 = -5;
                } else {
                    int iN = n(this.f46555s);
                    if (q(iN)) {
                        dVar.f6652b = this.m[iN];
                        if (this.f46555s == this.f46552p - 1 && (z11 || this.f46559w)) {
                            dVar.a(536870912);
                        }
                        dVar.f25117t = this.f46550n[iN];
                        eVar2.f39780a = this.f46549l[iN];
                        eVar2.f39781b = this.f46548k[iN];
                        eVar2.f39782c = this.f46551o[iN];
                        i12 = -4;
                    } else {
                        dVar.f25116f = true;
                    }
                }
            } else if (z11 || this.f46559w) {
                dVar.f6652b = 4;
                dVar.f25117t = Long.MIN_VALUE;
                i12 = -4;
            } else {
                y6.p pVar2 = this.B;
                if (pVar2 != null && (z12 || pVar2 != this.f46544g)) {
                    r(pVar2, eVar);
                    i12 = -5;
                }
            }
        }
        if (i12 == -4 && !dVar.e(4)) {
            boolean z13 = (i11 & 1) != 0;
            if ((i11 & 4) == 0) {
                if (z13) {
                    w0.f(w0Var.f46526e, dVar, eVar2, w0Var.f46524c);
                } else {
                    w0Var.f46526e = w0.f(w0Var.f46526e, dVar, eVar2, w0Var.f46524c);
                }
            }
            if (!z13) {
                this.f46555s++;
            }
        }
        return i12;
    }

    public final void t(boolean z11) {
        w0 w0Var = this.f46538a;
        w0Var.a(w0Var.f46525d);
        p2 p2Var = w0Var.f46525d;
        int i11 = w0Var.f46523b;
        b7.a.j(((t7.a) p2Var.f3638c) == null);
        p2Var.f3636a = 0L;
        p2Var.f3637b = i11;
        p2 p2Var2 = w0Var.f46525d;
        w0Var.f46526e = p2Var2;
        w0Var.f46527f = p2Var2;
        w0Var.f46528g = 0L;
        w0Var.f46522a.b();
        this.f46552p = 0;
        this.f46553q = 0;
        this.f46554r = 0;
        this.f46555s = 0;
        this.f46560x = true;
        this.f46556t = Long.MIN_VALUE;
        this.f46557u = Long.MIN_VALUE;
        this.f46558v = Long.MIN_VALUE;
        this.f46559w = false;
        ij.d dVar = this.f46540c;
        SparseArray sparseArray = (SparseArray) dVar.f34422c;
        for (int i12 = 0; i12 < sparseArray.size(); i12++) {
            ((nf.f) dVar.f34423d).accept(sparseArray.valueAt(i12));
        }
        dVar.f34421b = -1;
        sparseArray.clear();
        if (z11) {
            this.A = null;
            this.B = null;
            this.f46561y = true;
            this.C = true;
        }
    }

    public final synchronized boolean u(int i11) {
        synchronized (this) {
            this.f46555s = 0;
            w0 w0Var = this.f46538a;
            w0Var.f46526e = w0Var.f46525d;
        }
        int i12 = this.f46553q;
        if (i11 >= i12 && i11 <= this.f46552p + i12) {
            this.f46556t = Long.MIN_VALUE;
            this.f46555s = i11 - i12;
            return true;
        }
        return false;
    }

    public final synchronized boolean v(long j11, boolean z11) throws Throwable {
        Throwable th2;
        y0 y0Var;
        long j12;
        int iJ;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f46555s = 0;
                        w0 w0Var = this.f46538a;
                        w0Var.f46526e = w0Var.f46525d;
                        int iN = n(0);
                        int i11 = this.f46555s;
                        int i12 = this.f46552p;
                        if (!(i11 != i12) || j11 < this.f46550n[iN] || (j11 > this.f46558v && !z11)) {
                            return false;
                        }
                        if (this.C) {
                            iJ = i12 - i11;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= iJ) {
                                    if (!z11) {
                                        iJ = -1;
                                        break;
                                    }
                                    break;
                                }
                                try {
                                    if (this.f46550n[iN] >= j11) {
                                        iJ = i13;
                                        break;
                                    }
                                    iN++;
                                    if (iN == this.f46546i) {
                                        iN = 0;
                                    }
                                    i13++;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            y0Var = this;
                            j12 = j11;
                        } else {
                            y0Var = this;
                            j12 = j11;
                            iJ = y0Var.j(iN, i12 - i11, j12, true);
                        }
                        if (iJ == -1) {
                            return false;
                        }
                        y0Var.f46556t = j12;
                        y0Var.f46555s += iJ;
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th2 = th;
                }
                th2 = th;
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void w(int i11) {
        boolean z11;
        if (i11 >= 0) {
            try {
                if (this.f46555s + i11 <= this.f46552p) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            z11 = false;
        }
        b7.a.d(z11);
        this.f46555s += i11;
    }
}
