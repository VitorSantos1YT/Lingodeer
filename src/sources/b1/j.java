package b1;

import g3.b0;
import j3.x0;
import java.util.List;
import l1.k1;
import o3.c0;
import s0.o1;
import s0.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f3790b;

    public /* synthetic */ j(k kVar, int i11) {
        this.f3789a = i11;
        this.f3790b = kVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f3789a;
        boolean z11 = false;
        k kVar = this.f3790b;
        switch (i11) {
            case 0:
                k1 k1Var = kVar.U.f51184t;
                Boolean bool = Boolean.TRUE;
                k1Var.setValue(bool);
                kVar.U.f51183s.setValue(bool);
                k.W0(kVar.U, ((j3.h) obj).f35700b, kVar.V, kVar.W);
                return bool;
            case 1:
                List list = (List) obj;
                if (kVar.U.d() != null) {
                    o1 o1VarD = kVar.U.d();
                    kotlin.jvm.internal.m.c(o1VarD);
                    list.add(o1VarD.f51124a);
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 2:
                k.W0(kVar.U, ((j3.h) obj).f35700b, kVar.V, kVar.W);
                return Boolean.TRUE;
            default:
                j3.h hVar = (j3.h) obj;
                if (!kVar.V && kVar.W) {
                    c0 c0Var = kVar.U.f51170e;
                    if (c0Var != null) {
                        List listL = ns.o.L(new o3.h(), new o3.a(hVar, 1));
                        s0 s0Var = kVar.U;
                        ob.c cVar = s0Var.f51169d;
                        s0.w wVar = s0Var.f51186v;
                        o3.w wVarJ = cVar.j(listL);
                        c0Var.a(null, wVarJ);
                        wVar.invoke(wVarJ);
                    } else {
                        o3.w wVar2 = kVar.T;
                        String str = wVar2.f44704a.f35700b;
                        long j11 = wVar2.f44705b;
                        int i12 = x0.f35822c;
                        String string = oz.q.T0(str, (int) (j11 >> 32), (int) (j11 & 4294967295L), hVar).toString();
                        int length = hVar.f35700b.length() + ((int) (kVar.T.f44705b >> 32));
                        kVar.U.f51186v.invoke(new o3.w(string, j3.t.b(length, length), 4));
                    }
                    z11 = true;
                }
                return Boolean.valueOf(z11);
        }
    }

    public /* synthetic */ j(k kVar, b0 b0Var) {
        this.f3789a = 3;
        this.f3790b = kVar;
    }
}
