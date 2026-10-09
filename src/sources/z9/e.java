package z9;

import kotlin.NoWhenBranchMatchedException;
import w9.w;
import w9.x;
import xy.i;
import y9.l;
import y9.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f59041a;

    public e(a aVar) {
        this.f59041a = aVar;
    }

    @Override // w9.m
    public final Object a(String str, fz.c cVar, xy.c cVar2) {
        h hVarB1 = this.f59041a.B1(str);
        try {
            Object objInvoke = cVar.invoke(hVarB1);
            hz.b.h(hVarB1, null);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                hz.b.h(hVarB1, th2);
                throw th3;
            }
        }
    }

    @Override // w9.x
    public final Object b(w wVar, fz.e eVar, i iVar) {
        return e(wVar, eVar, iVar);
    }

    @Override // y9.t
    public final ja.a c() {
        return this.f59041a;
    }

    @Override // w9.x
    public final Object d(i iVar) {
        return Boolean.valueOf(this.f59041a.f59033a.U0());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(w wVar, fz.e eVar, xy.c cVar) throws Throwable {
        d dVar;
        Throwable th2;
        ka.a aVar;
        e eVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f59040e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f59040e = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f59038c;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = dVar.f59040e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            ka.a aVar2 = this.f59041a.f59033a;
            aVar2.U0();
            int i13 = c.f59035a[wVar.ordinal()];
            if (i13 == 1) {
                aVar2.P();
            } else if (i13 == 2) {
                aVar2.f0();
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.j();
            }
            try {
                Object lVar = new l(this, 1);
                dVar.f59036a = this;
                dVar.f59037b = aVar2;
                dVar.f59040e = 1;
                Object objInvoke = eVar.invoke(lVar, dVar);
                if (objInvoke == obj2) {
                    return obj2;
                }
                obj = objInvoke;
                aVar = aVar2;
                eVar2 = this;
            } catch (Throwable th3) {
                th2 = th3;
                aVar = aVar2;
                eVar2 = this;
                aVar.r();
                if (!aVar.U0()) {
                    eVar2.getClass();
                }
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = dVar.f59037b;
            eVar2 = dVar.f59036a;
            try {
                com.bumptech.glide.e.F(obj);
            } catch (Throwable th4) {
                th2 = th4;
                aVar.r();
                if (!aVar.U0()) {
                    eVar2.getClass();
                }
                throw th2;
            }
        }
        aVar.o();
        aVar.r();
        if (!aVar.U0()) {
            eVar2.getClass();
        }
        return obj;
    }
}
