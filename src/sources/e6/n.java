package e6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements vy.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f24984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tz.t f24985b;

    public n(AtomicReference atomicReference, tz.t tVar) {
        this.f24984a = atomicReference;
        this.f24985b = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final wy.a a(fz.e eVar, xy.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i11 = mVar.f24975c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f24975c = i11 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f24973a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = mVar.f24975c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            mVar.f24975c = 1;
            rz.m mVar2 = new rz.m(1, ue.f.x(mVar));
            mVar2.s();
            tz.t tVar = this.f24985b;
            mVar2.u(new a0.o0(tVar, 6));
            rz.l lVar = (rz.l) this.f24984a.getAndSet(mVar2);
            if (lVar != null) {
                lVar.k(null);
            }
            ((tz.s) tVar).i(eVar);
            if (mVar2.r() == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final vy.g get(vy.h hVar) {
        return ew.a.m(this, hVar);
    }

    @Override // vy.g
    public vy.h getKey() {
        return x.f25076a;
    }

    @Override // vy.i
    public final vy.i minusKey(vy.h hVar) {
        return ew.a.s(this, hVar);
    }

    @Override // vy.i
    public final vy.i plus(vy.i iVar) {
        return ew.a.w(this, iVar);
    }
}
