package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements fz.c {
    public static final e H;
    public static final e K;
    public static final e L;
    public static final e M;
    public static final e N;
    public static final e O;
    public static final e P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f56844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f56845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f56846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f56847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f56848f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f56849t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56850a;

    static {
        int i11 = 1;
        f56844b = new e(i11, 0);
        f56845c = new e(i11, 1);
        f56846d = new e(i11, 2);
        f56847e = new e(i11, 3);
        f56848f = new e(i11, 4);
        f56849t = new e(i11, 5);
        H = new e(i11, 6);
        K = new e(i11, 7);
        L = new e(i11, 8);
        M = new e(i11, 9);
        N = new e(i11, 10);
        O = new e(i11, 11);
        P = new e(i11, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, int i12) {
        super(i11);
        this.f56850a = i12;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0119 A[LOOP:0: B:71:0x00e2->B:81:0x0119, LOOP_END] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f56850a) {
            case 0:
                ((c) obj).V0();
                return qy.b0.f48488a;
            case 1:
                k kVar = (k) obj;
                i0 i0Var = kVar instanceof i0 ? (i0) kVar : null;
                if (i0Var == null || !i0Var.f56904t0) {
                    return qy.b0.f48488a;
                }
                throw new IllegalStateException("Apply is called on deactivated node " + kVar);
            case 2:
                x1 x1Var = (x1) obj;
                if (x1Var.r()) {
                    q0 q0Var = x1Var.f57039b;
                    if (!q0Var.M) {
                        fz.c cVarC = x1Var.f57038a.c();
                        y.i0 i0Var2 = q0Var.P;
                        if (cVarC != null) {
                            q0Var.C0(x1Var, 9223372034707292159L, 0L);
                            q0Var.f56997t = cVarC;
                        } else if (i0Var2 != null) {
                            Object[] objArr = i0Var2.f56715c;
                            long[] jArr = i0Var2.f56713a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j11 = jArr[i11];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            if ((255 & j11) < 128) {
                                                q0Var.P0((y.j0) objArr[(i11 << 3) + i13]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i12 == 8) {
                                            if (i11 != length) {
                                                i11++;
                                            }
                                        }
                                    } else if (i11 != length) {
                                        i11++;
                                    }
                                }
                            }
                            i0Var2.a();
                        }
                    }
                }
                return qy.b0.f48488a;
            case 3:
                s1 s1Var = ((k1) obj).f56957n0;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
                return qy.b0.f48488a;
            case 4:
                k1 k1Var = (k1) obj;
                i0 i0Var3 = k1Var.Q;
                try {
                    if (k1Var.r()) {
                        k1Var.B1(true);
                        break;
                    }
                    return qy.b0.f48488a;
                } catch (Throwable th2) {
                    i0Var3.b0(th2);
                    throw null;
                }
            case 5:
                p1 p1Var = (p1) obj;
                if (p1Var.r()) {
                    p1Var.f56995a.m0();
                }
                return qy.b0.f48488a;
            case 6:
                i0 i0Var4 = (i0) obj;
                if (i0Var4.I()) {
                    i0Var4.X(false);
                }
                return qy.b0.f48488a;
            case 7:
                i0 i0Var5 = (i0) obj;
                if (i0Var5.I()) {
                    i0Var5.X(false);
                }
                return qy.b0.f48488a;
            case 8:
                i0 i0Var6 = (i0) obj;
                if (i0Var6.I()) {
                    i0Var6.V(false);
                }
                return qy.b0.f48488a;
            case 9:
                i0 i0Var7 = (i0) obj;
                if (i0Var7.I()) {
                    i0Var7.V(false);
                }
                return qy.b0.f48488a;
            case 10:
                i0 i0Var8 = (i0) obj;
                if (i0Var8.I()) {
                    i0.W(i0Var8, false, 7);
                }
                return qy.b0.f48488a;
            case 11:
                i0 i0Var9 = (i0) obj;
                if (i0Var9.I()) {
                    i0.Y(i0Var9, false, 7);
                }
                return qy.b0.f48488a;
            default:
                i0 i0Var10 = (i0) obj;
                if (i0Var10.I()) {
                    i0Var10.G();
                }
                return qy.b0.f48488a;
        }
    }
}
