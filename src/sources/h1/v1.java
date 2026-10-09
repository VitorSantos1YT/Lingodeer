package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.c3 f31180a = new l1.c3(t1.f31088b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1.c3 f31181b = new l1.c3(t1.f31089c);

    public static final long a(s1 s1Var, long j11) {
        long j12 = s1Var.f31017a;
        long j13 = s1Var.f31034q;
        if (g2.x.d(j11, j12)) {
            return s1Var.f31019b;
        }
        if (g2.x.d(j11, s1Var.f31024f)) {
            return s1Var.f31025g;
        }
        if (g2.x.d(j11, s1Var.f31028j)) {
            return s1Var.f31029k;
        }
        if (g2.x.d(j11, s1Var.f31031n)) {
            return s1Var.f31032o;
        }
        if (g2.x.d(j11, s1Var.f31040w)) {
            return s1Var.f31041x;
        }
        if (g2.x.d(j11, s1Var.f31021c)) {
            return s1Var.f31022d;
        }
        if (g2.x.d(j11, s1Var.f31026h)) {
            return s1Var.f31027i;
        }
        if (g2.x.d(j11, s1Var.f31030l)) {
            return s1Var.m;
        }
        if (g2.x.d(j11, s1Var.f31042y)) {
            return s1Var.f31043z;
        }
        if (g2.x.d(j11, s1Var.f31038u)) {
            return s1Var.f31039v;
        }
        if (g2.x.d(j11, s1Var.f31033p)) {
            return j13;
        }
        if (g2.x.d(j11, s1Var.f31035r)) {
            return s1Var.f31036s;
        }
        if (g2.x.d(j11, s1Var.D) || g2.x.d(j11, s1Var.F) || g2.x.d(j11, s1Var.G) || g2.x.d(j11, s1Var.H) || g2.x.d(j11, s1Var.I) || g2.x.d(j11, s1Var.J)) {
            return j13;
        }
        int i11 = g2.x.f28623j;
        return g2.x.f28622i;
    }

    public static final long b(long j11, l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.d0(-1680936624);
        long jA = a((s1) sVar.j(f31180a), j11);
        if (jA == 16) {
            jA = ((g2.x) sVar.j(h2.f30320a)).f28624a;
        }
        sVar.p(false);
        return jA;
    }

    public static final long c(s1 s1Var, k1.c cVar) {
        switch (u1.f31139a[cVar.ordinal()]) {
            case 1:
                return s1Var.f31031n;
            case 2:
                return s1Var.f31040w;
            case 3:
                return s1Var.f31042y;
            case 4:
                return s1Var.f31039v;
            case 5:
                return s1Var.f31023e;
            case 6:
                return s1Var.f31038u;
            case 7:
                return s1Var.f31032o;
            case 8:
                return s1Var.f31041x;
            case 9:
                return s1Var.f31043z;
            case 10:
                return s1Var.f31019b;
            case 11:
                return s1Var.f31022d;
            case 12:
                return s1Var.f31025g;
            case 13:
                return s1Var.f31027i;
            case 14:
                return s1Var.f31034q;
            case 15:
                return s1Var.f31036s;
            case 16:
                return s1Var.f31037t;
            case 17:
                return s1Var.f31029k;
            case 18:
                return s1Var.m;
            case 19:
                return s1Var.A;
            case 20:
                return s1Var.B;
            case 21:
                return s1Var.f31017a;
            case 22:
                return s1Var.f31021c;
            case 23:
                return s1Var.C;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return s1Var.f31024f;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return s1Var.f31026h;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return s1Var.f31033p;
            case 27:
                return s1Var.f31035r;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return s1Var.D;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                return s1Var.F;
            case 30:
                return s1Var.G;
            case 31:
                return s1Var.H;
            case Consts.SP /* 32 */:
                return s1Var.I;
            case 33:
                return s1Var.J;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return s1Var.E;
            case 35:
                return s1Var.f31028j;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return s1Var.f31030l;
            default:
                int i11 = g2.x.f28623j;
                return g2.x.f28622i;
        }
    }

    public static final long d(k1.c cVar, l1.n nVar) {
        return c((s1) ((l1.s) nVar).j(f31180a), cVar);
    }

    public static s1 e(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, int i11, int i12) {
        long j47 = (i11 & 1) != 0 ? k1.b.f37456t : j11;
        return new s1(j47, (i11 & 2) != 0 ? k1.b.f37447j : j12, (i11 & 4) != 0 ? k1.b.f37457u : j13, (i11 & 8) != 0 ? k1.b.f37448k : j14, (i11 & 16) != 0 ? k1.b.f37442e : j15, (i11 & 32) != 0 ? k1.b.f37459w : j16, (i11 & 64) != 0 ? k1.b.f37449l : j17, (i11 & 128) != 0 ? k1.b.f37460x : j18, (i11 & 256) != 0 ? k1.b.m : j19, (i11 & 512) != 0 ? k1.b.H : j21, (i11 & 1024) != 0 ? k1.b.f37452p : j22, (i11 & 2048) != 0 ? k1.b.I : j23, (i11 & 4096) != 0 ? k1.b.f37453q : j24, (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? k1.b.f37438a : j25, (i11 & 16384) != 0 ? k1.b.f37444g : j26, (32768 & i11) != 0 ? k1.b.f37461y : j27, (65536 & i11) != 0 ? k1.b.f37450n : j28, (131072 & i11) != 0 ? k1.b.G : j29, (262144 & i11) != 0 ? k1.b.f37451o : j30, j47, (1048576 & i11) != 0 ? k1.b.f37443f : j31, (2097152 & i11) != 0 ? k1.b.f37441d : j32, (4194304 & i11) != 0 ? k1.b.f37439b : j33, (8388608 & i11) != 0 ? k1.b.f37445h : j34, (16777216 & i11) != 0 ? k1.b.f37440c : j35, (33554432 & i11) != 0 ? k1.b.f37446i : j36, (67108864 & i11) != 0 ? k1.b.f37454r : j37, (134217728 & i11) != 0 ? k1.b.f37455s : j38, (268435456 & i11) != 0 ? k1.b.f37458v : j39, (536870912 & i11) != 0 ? k1.b.f37462z : j40, (i12 & 8) != 0 ? k1.b.F : j46, (1073741824 & i11) != 0 ? k1.b.A : j41, (i11 & Integer.MIN_VALUE) != 0 ? k1.b.B : j42, (i12 & 1) != 0 ? k1.b.C : j43, (i12 & 2) != 0 ? k1.b.D : j44, (i12 & 4) != 0 ? k1.b.E : j45);
    }
}
