package a0;

import b0.i2;
import b0.j2;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f78a = new j2(c.K, c.L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0.i1 f79b = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0.i1 f80c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0.i1 f81d;

    static {
        long j11 = 1;
        long j12 = (j11 & 4294967295L) | (j11 << 32);
        f80c = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.j(j12), 1);
        f81d = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.l(j12), 1);
    }

    public static l1 a(i2 i2Var, int i11) {
        z1.j jVar;
        z1.h hVar = z1.c.Q;
        z1.h hVar2 = z1.c.O;
        int i12 = 1;
        b0.c0 c0VarQ = i2Var;
        if ((i11 & 1) != 0) {
            long j11 = 1;
            c0VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.l((j11 & 4294967295L) | (j11 << 32)), 1);
        }
        z1.h hVar3 = (i11 & 2) != 0 ? hVar : hVar2;
        if (kotlin.jvm.internal.m.a(hVar3, hVar2)) {
            jVar = z1.c.f58466d;
        } else {
            jVar = kotlin.jvm.internal.m.a(hVar3, hVar) ? z1.c.f58468f : z1.c.f58467e;
        }
        return b(c0VarQ, new c(i12, 17), jVar);
    }

    public static final l1 b(b0.c0 c0Var, fz.c cVar, z1.j jVar) {
        return new l1(new d2((n1) null, (a2) null, new n0(c0Var, cVar, jVar), (s1) null, (LinkedHashMap) null, 59));
    }

    public static l1 c(fz.c cVar, int i11) {
        long j11 = 1;
        b0.i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.l((j11 & 4294967295L) | (j11 << 32)), 1);
        z1.j jVar = z1.c.K;
        if ((i11 & 8) != 0) {
            cVar = c.N;
        }
        return b(i1VarQ, cVar, jVar);
    }

    public static l1 d(i2 i2Var, int i11) {
        z1.j jVar;
        z1.i iVar = z1.c.N;
        z1.i iVar2 = z1.c.L;
        int i12 = 1;
        b0.c0 c0VarQ = i2Var;
        if ((i11 & 1) != 0) {
            long j11 = 1;
            c0VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.l((j11 & 4294967295L) | (j11 << 32)), 1);
        }
        z1.i iVar3 = (i11 & 2) != 0 ? iVar : iVar2;
        if (kotlin.jvm.internal.m.a(iVar3, iVar2)) {
            jVar = z1.c.f58464b;
        } else {
            jVar = kotlin.jvm.internal.m.a(iVar3, iVar) ? z1.c.H : z1.c.f58467e;
        }
        return b(c0VarQ, new c(i12, 18), jVar);
    }

    public static l1 e(b0.c0 c0Var, int i11) {
        if ((i11 & 1) != 0) {
            c0Var = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);
        }
        return new l1(new d2(new n1(c0Var), (a2) null, (n0) null, (s1) null, (LinkedHashMap) null, 62));
    }

    public static m1 f(b0.c0 c0Var, int i11) {
        if ((i11 & 1) != 0) {
            c0Var = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);
        }
        return new m1(new d2(new n1(c0Var), (a2) null, (n0) null, (s1) null, (LinkedHashMap) null, 62));
    }

    public static l1 g(b0.c0 c0Var, float f5, int i11) {
        if ((i11 & 1) != 0) {
            c0Var = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);
        }
        if ((i11 & 2) != 0) {
            f5 = 0.0f;
        }
        return new l1(new d2((n1) null, (a2) null, (n0) null, new s1(f5, g2.z0.f28631b, c0Var), (LinkedHashMap) null, 55));
    }

    public static m1 h(b0.i1 i1Var, float f5, int i11) {
        if ((i11 & 1) != 0) {
            i1Var = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);
        }
        if ((i11 & 2) != 0) {
            f5 = 0.0f;
        }
        return new m1(new d2((n1) null, (a2) null, (n0) null, new s1(f5, g2.z0.f28631b, i1Var), (LinkedHashMap) null, 55));
    }

    public static m1 i(i2 i2Var, int i11) {
        z1.j jVar;
        z1.h hVar = z1.c.Q;
        z1.h hVar2 = z1.c.O;
        int i12 = 1;
        b0.c0 c0VarQ = i2Var;
        if ((i11 & 1) != 0) {
            long j11 = 1;
            c0VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.l((j11 & 4294967295L) | (j11 << 32)), 1);
        }
        z1.h hVar3 = (i11 & 2) != 0 ? hVar : hVar2;
        if (kotlin.jvm.internal.m.a(hVar3, hVar2)) {
            jVar = z1.c.f58466d;
        } else {
            jVar = kotlin.jvm.internal.m.a(hVar3, hVar) ? z1.c.f58468f : z1.c.f58467e;
        }
        return j(c0VarQ, new c(i12, 19), jVar);
    }

    public static final m1 j(b0.c0 c0Var, fz.c cVar, z1.j jVar) {
        return new m1(new d2((n1) null, (a2) null, new n0(c0Var, cVar, jVar), (s1) null, (LinkedHashMap) null, 59));
    }

    public static m1 k(fz.c cVar, int i11) {
        long j11 = 1;
        b0.i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.l((j11 & 4294967295L) | (j11 << 32)), 1);
        z1.j jVar = z1.c.K;
        if ((i11 & 8) != 0) {
            cVar = c.O;
        }
        return j(i1VarQ, cVar, jVar);
    }

    public static m1 l(i2 i2Var, int i11) {
        z1.j jVar;
        z1.i iVar = z1.c.N;
        z1.i iVar2 = z1.c.L;
        int i12 = 1;
        b0.c0 c0VarQ = i2Var;
        if ((i11 & 1) != 0) {
            long j11 = 1;
            c0VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.l((j11 & 4294967295L) | (j11 << 32)), 1);
        }
        z1.i iVar3 = (i11 & 2) != 0 ? iVar : iVar2;
        if (kotlin.jvm.internal.m.a(iVar3, iVar2)) {
            jVar = z1.c.f58464b;
        } else {
            jVar = kotlin.jvm.internal.m.a(iVar3, iVar) ? z1.c.H : z1.c.f58467e;
        }
        return j(c0VarQ, new c(i12, 20), jVar);
    }

    public static final l1 m(b0.c0 c0Var, fz.c cVar) {
        return new l1(new d2((n1) null, new a2(c0Var, cVar), (n0) null, (s1) null, (LinkedHashMap) null, 61));
    }

    public static l1 n(fz.c cVar) {
        long j11 = 1;
        return m(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.j((j11 & 4294967295L) | (j11 << 32)), 1), cVar);
    }

    public static final l1 o(b0.c0 c0Var, fz.c cVar) {
        return m(c0Var, new e1(cVar, 0));
    }

    public static l1 p(fz.c cVar, int i11) {
        long j11 = 1;
        b0.i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.j((j11 & 4294967295L) | (j11 << 32)), 1);
        if ((i11 & 2) != 0) {
            cVar = c.P;
        }
        return o(i1VarQ, cVar);
    }

    public static final l1 q(b0.c0 c0Var, fz.c cVar) {
        return m(c0Var, new e1(cVar, 1));
    }

    public static l1 r(fz.c cVar, int i11) {
        long j11 = 1;
        b0.i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.j((j11 & 4294967295L) | (j11 << 32)), 1);
        if ((i11 & 2) != 0) {
            cVar = c.Q;
        }
        return q(i1VarQ, cVar);
    }

    public static final m1 s(b0.c0 c0Var, fz.c cVar) {
        return new m1(new d2((n1) null, new a2(c0Var, cVar), (n0) null, (s1) null, (LinkedHashMap) null, 61));
    }

    public static m1 t(fz.c cVar) {
        long j11 = 1;
        return s(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.j((j11 & 4294967295L) | (j11 << 32)), 1), cVar);
    }

    public static m1 u(fz.c cVar, int i11) {
        long j11 = 1;
        b0.i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.j((j11 & 4294967295L) | (j11 << 32)), 1);
        if ((i11 & 2) != 0) {
            cVar = c.R;
        }
        return s(i1VarQ, new e1(cVar, 2));
    }

    public static final m1 v(b0.c0 c0Var, fz.c cVar) {
        return s(c0Var, new e1(cVar, 3));
    }

    public static m1 w(fz.c cVar, int i11) {
        long j11 = 1;
        b0.i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.j((j11 & 4294967295L) | (j11 << 32)), 1);
        if ((i11 & 2) != 0) {
            cVar = c.S;
        }
        return v(i1VarQ, cVar);
    }
}
