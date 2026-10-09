package vz;

import a0.d0;
import qy.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.i f54335d;

    public e(int i11, tz.a aVar, uz.i iVar, vy.i iVar2) {
        super(iVar2, i11, aVar);
        this.f54335d = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[RETURN] */
    @Override // vz.d, uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        Object objCollect;
        if (this.f54333b == -3) {
            vy.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            os.a aVar = new os.a(28);
            vy.i iVar = this.f54332a;
            vy.i iVarPlus = !((Boolean) iVar.fold(bool, aVar)).booleanValue() ? context.plus(iVar) : e0.o(context, iVar, false);
            if (kotlin.jvm.internal.m.a(iVarPlus, context)) {
                Object objJ = j(jVar, dVar);
                if (objJ == wy.a.COROUTINE_SUSPENDED) {
                    return objJ;
                }
            } else {
                vy.e eVar = vy.e.f54320a;
                if (kotlin.jvm.internal.m.a(iVarPlus.get(eVar), context.get(eVar))) {
                    vy.i context2 = dVar.getContext();
                    if (!(jVar instanceof r) && !(jVar instanceof n)) {
                        jVar = new d0(jVar, context2);
                    }
                    Object objC = b.c(iVarPlus, jVar, wz.b.m(iVarPlus), new sr.d(this, null, 18), dVar);
                    if (objC == wy.a.COROUTINE_SUSPENDED) {
                        return objC;
                    }
                } else {
                    objCollect = super.collect(jVar, dVar);
                    if (objCollect == wy.a.COROUTINE_SUSPENDED) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(jVar, dVar);
            if (objCollect == wy.a.COROUTINE_SUSPENDED) {
                return objCollect;
            }
        }
        return b0.f48488a;
    }

    @Override // vz.d
    public final Object f(tz.t tVar, vy.d dVar) {
        Object objJ = j(new r(tVar), dVar);
        return objJ == wy.a.COROUTINE_SUSPENDED ? objJ : b0.f48488a;
    }

    public abstract Object j(uz.j jVar, vy.d dVar);

    @Override // vz.d
    public final String toString() {
        return this.f54335d + " -> " + super.toString();
    }
}
