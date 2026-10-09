package n0;

import b0.h2;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.i0 f43009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ij.d f43010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y.j0 f43011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f43012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f43013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f43014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f43015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f43016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z1.r f43017i;

    public w() {
        long[] jArr = y.r0.f56756a;
        this.f43009a = new y.i0();
        y.j0 j0Var = y.s0.f56760a;
        this.f43011c = new y.j0();
        this.f43012d = new ArrayList();
        this.f43013e = new ArrayList();
        this.f43014f = new ArrayList();
        this.f43015g = new ArrayList();
        this.f43016h = new ArrayList();
        this.f43017i = new t(this);
    }

    public static int e(int[] iArr, e0 e0Var) {
        int i11 = e0Var.i();
        int iC = e0Var.c() + i11;
        int iMax = 0;
        while (i11 < iC) {
            int iB = e0Var.b() + iArr[i11];
            iArr[i11] = iB;
            iMax = Math.max(iMax, iB);
            i11++;
        }
        return iMax;
    }

    public final void a(int i11, Object obj) {
        hh.p0.z(this.f43009a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.f43016h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        hh.p0.z(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x008e A[EDGE_INSN: B:107:0x008e->B:33:0x008e BREAK  A[LOOP:2: B:21:0x0057->B:32:0x008b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[LOOP:2: B:21:0x0057->B:32:0x008b, LOOP_END] */
    public final void c(int i11, int i12, ArrayList arrayList, ij.d dVar, h2 h2Var, boolean z11, int i13, boolean z12, int i14, int i15) {
        ij.d dVar2 = this.f43010b;
        this.f43010b = dVar;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            e0 e0Var = (e0) arrayList.get(i16);
            int iA = e0Var.a();
            for (int i17 = 0; i17 < iA; i17++) {
                e0Var.d(i17);
            }
        }
        y.i0 i0Var = this.f43009a;
        if (i0Var.i()) {
            d();
            return;
        }
        boolean z13 = z11 || !z12;
        Object[] objArr = i0Var.f56714b;
        long[] jArr = i0Var.f56713a;
        int length = jArr.length - 2;
        char c11 = 7;
        y.j0 j0Var = this.f43011c;
        if (length >= 0) {
            int i18 = 0;
            while (true) {
                long j11 = jArr[i18];
                int i19 = i18;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i19 != length) {
                        break;
                        break;
                    }
                    i18 = i19 + 1;
                } else {
                    int i21 = 8 - ((~(i19 - length)) >>> 31);
                    long j12 = j11;
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j12 & 255) < 128) {
                            j0Var.a(objArr[(i19 << 3) + i22]);
                        }
                        j12 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    } else if (i19 != length) {
                        break;
                    } else {
                        i18 = i19 + 1;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        for (int i23 = 0; i23 < size2; i23++) {
            e0 e0Var2 = (e0) arrayList.get(i23);
            j0Var.l(e0Var2.getKey());
            int iA2 = e0Var2.a();
            for (int i24 = 0; i24 < iA2; i24++) {
                e0Var2.d(i24);
            }
            hh.p0.z(this.f43009a.k(e0Var2.getKey()));
        }
        int[] iArr = new int[i13];
        ArrayList arrayList2 = this.f43013e;
        ArrayList arrayList3 = this.f43012d;
        if (z13 && dVar2 != null) {
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    ry.p.Z(arrayList3, new v(dVar2, 2));
                }
                if (arrayList3.size() > 0) {
                    e0 e0Var3 = (e0) arrayList3.get(0);
                    e(iArr, e0Var3);
                    Object objG = i0Var.g(e0Var3.getKey());
                    kotlin.jvm.internal.m.c(objG);
                    hh.p0.z(objG);
                    e0Var3.h(0);
                    throw null;
                }
                ry.l.Q(iArr, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    ry.p.Z(arrayList2, new v(dVar2, 0));
                }
                if (arrayList2.size() > 0) {
                    e0 e0Var4 = (e0) arrayList2.get(0);
                    e(iArr, e0Var4);
                    Object objG2 = i0Var.g(e0Var4.getKey());
                    kotlin.jvm.internal.m.c(objG2);
                    hh.p0.z(objG2);
                    e0Var4.h(0);
                    throw null;
                }
                ry.l.Q(iArr, 0);
            }
        }
        Object[] objArr2 = j0Var.f56721b;
        long[] jArr2 = j0Var.f56720a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i25 = 0;
            while (true) {
                long j13 = jArr2[i25];
                char c12 = c11;
                if ((((~j13) << c12) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i26 = 8 - ((~(i25 - length2)) >>> 31);
                    long j14 = j13;
                    for (int i27 = 0; i27 < i26; i27++) {
                        if ((j14 & 255) < 128) {
                            hh.p0.z(i0Var.g(objArr2[(i25 << 3) + i27]));
                        }
                        j14 >>= 8;
                    }
                    if (i26 != 8) {
                        break;
                    }
                }
                if (i25 == length2) {
                    break;
                }
                i25++;
                c11 = c12;
            }
        }
        ArrayList arrayList4 = this.f43014f;
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                ry.p.Z(arrayList4, new v(dVar, 3));
            }
            if (arrayList4.size() > 0) {
                e0 e0Var5 = (e0) arrayList4.get(0);
                Object objG3 = i0Var.g(e0Var5.getKey());
                kotlin.jvm.internal.m.c(objG3);
                hh.p0.z(objG3);
                e(iArr, e0Var5);
                if (!z11) {
                    throw null;
                }
                ((e0) ry.m.q0(arrayList)).h(0);
                throw null;
            }
            ry.l.Q(iArr, 0);
        }
        ArrayList arrayList5 = this.f43015g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                ry.p.Z(arrayList5, new v(dVar, 1));
            }
            if (arrayList5.size() > 0) {
                e0 e0Var6 = (e0) arrayList5.get(0);
                Object objG4 = i0Var.g(e0Var6.getKey());
                kotlin.jvm.internal.m.c(objG4);
                hh.p0.z(objG4);
                e(iArr, e0Var6);
                if (!z11) {
                    throw null;
                }
                ((e0) ry.m.z0(arrayList)).h(0);
                throw null;
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        j0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[LOOP:0: B:7:0x0013->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[EDGE_INSN: B:22:0x004d->B:19:0x004d BREAK  A[LOOP:0: B:7:0x0013->B:18:0x004a], SYNTHETIC] */
    public final void d() {
        y.i0 i0Var = this.f43009a;
        if (i0Var.j()) {
            Object[] objArr = i0Var.f56715c;
            long[] jArr = i0Var.f56713a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                hh.p0.z(objArr[(i11 << 3) + i13]);
                                throw null;
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            i0Var.a();
        }
    }
}
