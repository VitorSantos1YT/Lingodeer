package i00;

import com.android.billingclient.api.c0;
import com.android.billingclient.api.k0;
import g00.d1;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends ub.a implements h00.q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f33953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h00.c f33954l;
    public final a0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h00.q[] f33955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.android.billingclient.api.h f33956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h00.j f33957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f33958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f33959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f33960s;

    public x(k0 composer, h00.c cVar, a0 a0Var, h00.q[] qVarArr) {
        kotlin.jvm.internal.m.f(composer, "composer");
        this.f33953k = composer;
        this.f33954l = cVar;
        this.m = a0Var;
        this.f33955n = qVarArr;
        this.f33956o = cVar.f29917b;
        this.f33957p = cVar.f29916a;
        int iOrdinal = a0Var.ordinal();
        if (qVarArr != null) {
            h00.q qVar = qVarArr[iOrdinal];
            if (qVar == null && qVar == this) {
                return;
            }
            qVarArr[iOrdinal] = this;
        }
    }

    @Override // ub.a, f00.d
    public final void C(long j11) {
        if (this.f33958q) {
            F(String.valueOf(j11));
        } else {
            this.f33953k.k(j11);
        }
    }

    @Override // ub.a, f00.d
    public final void F(String value) {
        kotlin.jvm.internal.m.f(value, "value");
        this.f33953k.n(value);
    }

    @Override // ub.a, f00.b
    public final boolean G(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return false;
    }

    @Override // ub.a
    public final void S(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        int i12 = w.f33952a[this.m.ordinal()];
        k0 k0Var = this.f33953k;
        boolean z11 = true;
        if (i12 == 1) {
            if (!k0Var.f7546a) {
                k0Var.i(',');
            }
            k0Var.g();
            return;
        }
        if (i12 == 2) {
            if (k0Var.f7546a) {
                this.f33958q = true;
                k0Var.g();
                return;
            }
            if (i11 % 2 == 0) {
                k0Var.i(',');
                k0Var.g();
            } else {
                k0Var.i(':');
                k0Var.p();
                z11 = false;
            }
            this.f33958q = z11;
            return;
        }
        if (i12 != 3) {
            if (!k0Var.f7546a) {
                k0Var.i(',');
            }
            k0Var.g();
            j.n(descriptor, this.f33954l);
            F(descriptor.g(i11));
            k0Var.i(':');
            k0Var.p();
            return;
        }
        if (i11 == 0) {
            this.f33958q = true;
        }
        if (i11 == 1) {
            k0Var.i(',');
            k0Var.p();
            this.f33958q = false;
        }
    }

    @Override // f00.d
    public final com.android.billingclient.api.h a() {
        return this.f33956o;
    }

    @Override // h00.q
    public final h00.c b() {
        return this.f33954l;
    }

    @Override // ub.a, f00.b
    public final void c(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        a0 a0Var = this.m;
        if (a0Var.end != 0) {
            k0 k0Var = this.f33953k;
            k0Var.getClass();
            k0Var.f7546a = false;
            k0Var.i(a0Var.end);
        }
    }

    @Override // ub.a, f00.d
    public final f00.b d(e00.g descriptor) {
        h00.q qVar;
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        h00.c cVar = this.f33954l;
        a0 a0VarP = j.p(descriptor, cVar);
        char c11 = a0VarP.begin;
        k0 k0Var = this.f33953k;
        if (c11 != 0) {
            k0Var.i(c11);
            k0Var.f7546a = true;
        }
        String str = this.f33959r;
        if (str != null) {
            String strA = this.f33960s;
            if (strA == null) {
                strA = descriptor.a();
            }
            k0Var.g();
            F(str);
            k0Var.i(':');
            k0Var.getClass();
            F(strA);
            this.f33959r = null;
            this.f33960s = null;
        }
        if (this.m == a0VarP) {
            return this;
        }
        h00.q[] qVarArr = this.f33955n;
        return (qVarArr == null || (qVar = qVarArr[a0VarP.ordinal()]) == null) ? new x(k0Var, cVar, a0VarP, qVarArr) : qVar;
    }

    @Override // ub.a, f00.d
    public final void e() {
        this.f33953k.l("null");
    }

    @Override // h00.q
    public final void f(h00.m element) {
        kotlin.jvm.internal.m.f(element, "element");
        if (this.f33959r == null || (element instanceof h00.z)) {
            y(h00.o.f29939a, element);
        } else {
            j.r(element, this.f33960s);
            throw null;
        }
    }

    @Override // ub.a, f00.d
    public final void j(double d5) {
        boolean z11 = this.f33958q;
        k0 k0Var = this.f33953k;
        if (z11) {
            F(String.valueOf(d5));
        } else {
            ((c0) k0Var.f7547b).j(String.valueOf(d5));
        }
        if (Math.abs(d5) <= Double.MAX_VALUE) {
            return;
        }
        throw j.a(((c0) k0Var.f7547b).toString(), Double.valueOf(d5));
    }

    @Override // ub.a, f00.d
    public final void k(short s3) {
        if (this.f33958q) {
            F(String.valueOf((int) s3));
        } else {
            this.f33953k.m(s3);
        }
    }

    @Override // ub.a, f00.d
    public final void m(byte b3) {
        if (this.f33958q) {
            F(String.valueOf((int) b3));
        } else {
            this.f33953k.h(b3);
        }
    }

    @Override // ub.a, f00.d
    public final void o(boolean z11) {
        if (this.f33958q) {
            F(String.valueOf(z11));
        } else {
            ((c0) this.f33953k.f7547b).j(String.valueOf(z11));
        }
    }

    @Override // ub.a, f00.d
    public final void p(float f5) {
        boolean z11 = this.f33958q;
        k0 k0Var = this.f33953k;
        if (z11) {
            F(String.valueOf(f5));
        } else {
            ((c0) k0Var.f7547b).j(String.valueOf(f5));
        }
        if (Math.abs(f5) <= Float.MAX_VALUE) {
            return;
        }
        throw j.a(((c0) k0Var.f7547b).toString(), Float.valueOf(f5));
    }

    @Override // ub.a, f00.d
    public final void r(char c11) {
        F(String.valueOf(c11));
    }

    @Override // ub.a, f00.d
    public final void s(e00.g enumDescriptor, int i11) {
        kotlin.jvm.internal.m.f(enumDescriptor, "enumDescriptor");
        F(enumDescriptor.g(i11));
    }

    @Override // ub.a, f00.d
    public final f00.d u(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        boolean zA = y.a(descriptor);
        a0 a0Var = this.m;
        h00.c cVar = this.f33954l;
        k0 fVar = this.f33953k;
        if (zA) {
            if (!(fVar instanceof g)) {
                fVar = new g((c0) fVar.f7547b, this.f33958q);
            }
            return new x(fVar, cVar, a0Var, null);
        }
        if (descriptor.isInline() && descriptor.equals(h00.n.f29938a)) {
            if (!(fVar instanceof f)) {
                fVar = new f((c0) fVar.f7547b, this.f33958q);
            }
            return new x(fVar, cVar, a0Var, null);
        }
        if (this.f33959r != null) {
            this.f33960s = descriptor.a();
        }
        return this;
    }

    @Override // ub.a, f00.b
    public final void x(e00.g descriptor, int i11, c00.a serializer, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(serializer, "serializer");
        if (obj != null || this.f33957p.f29932c) {
            super.x(descriptor, i11, serializer, obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // ub.a, f00.d
    public final void y(c00.a serializer, Object obj) {
        String strH;
        kotlin.jvm.internal.m.f(serializer, "serializer");
        h00.c cVar = this.f33954l;
        h00.j jVar = cVar.f29916a;
        boolean z11 = serializer instanceof g00.b;
        if (!z11) {
            int i11 = t.f33942a[jVar.f29937h.ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                o00.a aVarE = serializer.getDescriptor().e();
                strH = (kotlin.jvm.internal.m.a(aVarE, e00.m.f24700c) || kotlin.jvm.internal.m.a(aVarE, e00.m.f24703f)) ? j.h(serializer.getDescriptor(), cVar) : null;
            }
        } else if (jVar.f29937h != h00.a.NONE) {
        }
        if (z11) {
            g00.b bVar = (g00.b) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + ((c00.c) bVar).getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            c00.a aVarS = o00.a.s(bVar, this, obj);
            if (strH != null) {
                if (serializer instanceof c00.d) {
                    e00.g descriptor = aVarS.getDescriptor();
                    kotlin.jvm.internal.m.f(descriptor, "<this>");
                    if (d1.b(descriptor).contains(strH)) {
                        throw new ClassCastException();
                    }
                }
                j.g(aVarS.getDescriptor().e());
            }
            serializer = aVarS;
        }
        if (strH != null) {
            String strA = serializer.getDescriptor().a();
            this.f33959r = strH;
            this.f33960s = strA;
        }
        serializer.serialize(this, obj);
    }

    @Override // ub.a, f00.d
    public final void z(int i11) {
        if (this.f33958q) {
            F(String.valueOf(i11));
        } else {
            this.f33953k.j(i11);
        }
    }
}
