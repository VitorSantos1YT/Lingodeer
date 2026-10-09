package n00;

import fr.p3;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import m00.a0;
import m00.l;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f43061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f43062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f43063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f43064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f43065e;

    static {
        l lVar = l.f40723d;
        f43061a = p3.l("/");
        f43062b = p3.l("\\");
        f43063c = p3.l("/\\");
        f43064d = p3.l(".");
        f43065e = p3.l("..");
    }

    public static final int a(a0 a0Var) {
        l lVar = a0Var.f40674a;
        if (lVar.e() != 0) {
            if (lVar.k(0) != 47) {
                if (lVar.k(0) == 92) {
                    if (lVar.e() > 2 && lVar.k(1) == 92) {
                        l other = f43062b;
                        m.f(other, "other");
                        int iG = lVar.g(other.j(), 2);
                        return iG == -1 ? lVar.e() : iG;
                    }
                } else if (lVar.e() > 2 && lVar.k(1) == 58 && lVar.k(2) == 92) {
                    char cK = (char) lVar.k(0);
                    if ('a' <= cK && cK < '{') {
                        return 3;
                    }
                    if ('A' <= cK && cK < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final a0 b(a0 a0Var, a0 child, boolean z11) {
        m.f(child, "child");
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        l lVarC = c(a0Var);
        if (lVarC == null && (lVarC = c(child)) == null) {
            lVarC = f(a0.f40673b);
        }
        m00.i iVar = new m00.i();
        iVar.I(a0Var.f40674a);
        if (iVar.f40718b > 0) {
            iVar.I(lVarC);
        }
        iVar.I(child.f40674a);
        return d(iVar, z11);
    }

    public static final l c(a0 a0Var) {
        l lVar = a0Var.f40674a;
        l lVar2 = f43061a;
        if (l.h(lVar, lVar2) != -1) {
            return lVar2;
        }
        l lVar3 = a0Var.f40674a;
        l lVar4 = f43062b;
        if (l.h(lVar3, lVar4) != -1) {
            return lVar4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0129  */
    /* JADX WARN: Code duplicated, block: B:88:0x013e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120 A[EDGE_INSN: B:98:0x0120->B:81:0x0120 BREAK  A[LOOP:1: B:53:0x00bb->B:112:0x00bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x010e A[SYNTHETIC] */
    public static final a0 d(m00.i iVar, boolean z11) throws EOFException {
        l bytes;
        long j11;
        char cH;
        boolean z12;
        ArrayList arrayList;
        boolean zR;
        l lVar;
        int size;
        int i11;
        long jP;
        l lVarZ;
        l lVar2;
        m00.i iVar2 = new m00.i();
        l lVarE = null;
        int i12 = 0;
        while (true) {
            l bytes2 = f43061a;
            m.f(bytes2, "bytes");
            if (!iVar.v(0L, bytes2, bytes2.e())) {
                bytes = f43062b;
                m.f(bytes, "bytes");
                if (!iVar.v(0L, bytes, bytes.e())) {
                    break;
                }
            }
            byte b3 = iVar.readByte();
            if (lVarE == null) {
                lVarE = e(b3);
            }
            i12++;
        }
        boolean z13 = i12 >= 2 && m.a(lVarE, bytes);
        l lVar3 = f43063c;
        if (z13) {
            m.c(lVarE);
            iVar2.I(lVarE);
            iVar2.I(lVarE);
        } else {
            if (i12 <= 0) {
                long jP2 = iVar.p(lVar3);
                if (lVarE == null) {
                    lVarE = jP2 == -1 ? f(a0.f40673b) : e(iVar.h(jP2));
                }
                if (m.a(lVarE, bytes) && iVar.f40718b >= 2) {
                    j11 = -1;
                    if (iVar.h(1L) == 58 && (('a' <= (cH = (char) iVar.h(0L)) && cH < '{') || ('A' <= cH && cH < '['))) {
                        if (jP2 == 2) {
                            iVar2.K0(iVar, 3L);
                        } else {
                            iVar2.K0(iVar, 2L);
                        }
                    }
                }
                if (iVar2.f40718b > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zR = iVar.R();
                    lVar = f43064d;
                    if (!zR) {
                        break;
                    }
                    jP = iVar.p(lVar3);
                    if (jP == j11) {
                        lVarZ = iVar.z(iVar.f40718b);
                    } else {
                        lVarZ = iVar.z(jP);
                        iVar.readByte();
                    }
                    lVar2 = f43065e;
                    if (m.a(lVarZ, lVar2)) {
                        if (z12 || !arrayList.isEmpty()) {
                            if (z11 || (!z12 && (arrayList.isEmpty() || m.a(ry.m.z0(arrayList), lVar2)))) {
                                arrayList.add(lVarZ);
                            } else if (!z13 || arrayList.size() != 1) {
                                ry.m.N0(arrayList);
                            }
                        }
                    } else if (m.a(lVarZ, lVar) && !m.a(lVarZ, l.f40723d)) {
                        arrayList.add(lVarZ);
                    }
                }
                size = arrayList.size();
                for (i11 = 0; i11 < size; i11++) {
                    if (i11 > 0) {
                        iVar2.I(lVarE);
                    }
                    iVar2.I((l) arrayList.get(i11));
                }
                if (iVar2.f40718b == 0) {
                    iVar2.I(lVar);
                }
                return new a0(iVar2.z(iVar2.f40718b));
            }
            m.c(lVarE);
            iVar2.I(lVarE);
        }
        j11 = -1;
        if (iVar2.f40718b > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zR = iVar.R();
            lVar = f43064d;
            if (!zR) {
                break;
                break;
            }
            jP = iVar.p(lVar3);
            if (jP == j11) {
                lVarZ = iVar.z(iVar.f40718b);
            } else {
                lVarZ = iVar.z(jP);
                iVar.readByte();
            }
            lVar2 = f43065e;
            if (m.a(lVarZ, lVar2)) {
                if (z12) {
                }
                if (z11) {
                }
                arrayList.add(lVarZ);
            } else if (m.a(lVarZ, lVar)) {
            }
        }
        size = arrayList.size();
        while (i11 < size) {
            if (i11 > 0) {
                iVar2.I(lVarE);
            }
            iVar2.I((l) arrayList.get(i11));
        }
        if (iVar2.f40718b == 0) {
            iVar2.I(lVar);
        }
        return new a0(iVar2.z(iVar2.f40718b));
    }

    public static final l e(byte b3) {
        if (b3 == 47) {
            return f43061a;
        }
        if (b3 == 92) {
            return f43062b;
        }
        throw new IllegalArgumentException(p.j(b3, "not a directory separator: "));
    }

    public static final l f(String str) {
        if (m.a(str, "/")) {
            return f43061a;
        }
        if (m.a(str, "\\")) {
            return f43062b;
        }
        throw new IllegalArgumentException(ep.a.e("not a directory separator: ", str));
    }
}
