package m6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a00.e f40909a = new a00.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f40910b = new l(this);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(fz.e eVar, xy.c cVar) throws Throwable {
        i iVar;
        a00.e eVar2;
        m mVar;
        fz.e eVar3;
        Throwable th2;
        a00.a aVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.f40896f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f40896f = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f40894d;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = iVar.f40896f;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                iVar.f40891a = this;
                iVar.f40892b = (xy.i) eVar;
                eVar2 = this.f40909a;
                iVar.f40893c = eVar2;
                iVar.f40896f = 1;
                if (eVar2.b(iVar) != obj2) {
                    mVar = this;
                    eVar3 = eVar;
                }
                return obj2;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a00.a) iVar.f40891a;
                try {
                    com.bumptech.glide.e.F(obj);
                    aVar.a(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar.a(null);
                    throw th2;
                }
            }
            a00.e eVar4 = iVar.f40893c;
            fz.e eVar5 = (fz.e) iVar.f40892b;
            mVar = (m) iVar.f40891a;
            com.bumptech.glide.e.F(obj);
            eVar2 = eVar4;
            eVar3 = eVar5;
            Object obj3 = mVar.f40910b;
            iVar.f40891a = eVar2;
            iVar.f40892b = null;
            iVar.f40893c = null;
            iVar.f40896f = 2;
            Object objInvoke = eVar3.invoke(obj3, iVar);
            if (objInvoke != obj2) {
                a00.e eVar6 = eVar2;
                obj = objInvoke;
                aVar = eVar6;
                aVar.a(null);
                return obj;
            }
            return obj2;
        } catch (Throwable th4) {
            a00.e eVar7 = eVar2;
            th2 = th4;
            aVar = eVar7;
            aVar.a(null);
            throw th2;
        }
    }
}
