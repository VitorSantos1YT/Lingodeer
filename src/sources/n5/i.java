package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a00.a f43286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f43287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f43288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f43289d;

    public i(a00.a aVar, kotlin.jvm.internal.u uVar, kotlin.jvm.internal.y yVar, v vVar) {
        this.f43286a = aVar;
        this.f43287b = uVar;
        this.f43288c = yVar;
        this.f43289d = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(b0.g gVar, xy.c cVar) throws Throwable {
        h hVar;
        a00.a aVar;
        v vVar;
        kotlin.jvm.internal.u uVar;
        kotlin.jvm.internal.y yVar;
        fz.e eVar;
        a00.a aVar2;
        a00.a aVar3;
        v vVar2;
        Object obj;
        kotlin.jvm.internal.y yVar2;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.H;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.H = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj2 = hVar.f43280f;
        wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
        int i12 = hVar.H;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj2);
                hVar.f43275a = gVar;
                aVar = this.f43286a;
                hVar.f43276b = aVar;
                kotlin.jvm.internal.u uVar2 = this.f43287b;
                hVar.f43277c = uVar2;
                kotlin.jvm.internal.y yVar3 = this.f43288c;
                hVar.f43278d = yVar3;
                vVar = this.f43289d;
                hVar.f43279e = vVar;
                hVar.H = 1;
                if (aVar.b(hVar) != aVar4) {
                    uVar = uVar2;
                    yVar = yVar3;
                    eVar = gVar;
                }
                return aVar4;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = hVar.f43277c;
                    yVar2 = (kotlin.jvm.internal.y) hVar.f43276b;
                    aVar2 = (a00.a) hVar.f43275a;
                    try {
                        com.bumptech.glide.e.F(obj2);
                        yVar2.f38361a = obj;
                        yVar = yVar2;
                        Object obj3 = yVar.f38361a;
                        aVar2.a(null);
                        return obj3;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.a(null);
                        throw th;
                    }
                }
                vVar2 = (v) hVar.f43277c;
                yVar = (kotlin.jvm.internal.y) hVar.f43276b;
                aVar3 = (a00.a) hVar.f43275a;
                try {
                    com.bumptech.glide.e.F(obj2);
                    if (!kotlin.jvm.internal.m.a(obj2, yVar.f38361a)) {
                        hVar.f43275a = aVar3;
                        hVar.f43276b = yVar;
                        hVar.f43277c = obj2;
                        hVar.H = 3;
                        if (vVar2.j(obj2, false, hVar) != aVar4) {
                            obj = obj2;
                            yVar2 = yVar;
                            aVar2 = aVar3;
                            yVar2.f38361a = obj;
                            yVar = yVar2;
                        }
                        return aVar4;
                    }
                    aVar2 = aVar3;
                    Object obj4 = yVar.f38361a;
                    aVar2.a(null);
                    return obj4;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2 = aVar3;
                    aVar2.a(null);
                    throw th;
                }
            }
            v vVar3 = hVar.f43279e;
            yVar = hVar.f43278d;
            uVar = (kotlin.jvm.internal.u) hVar.f43277c;
            a00.a aVar5 = (a00.a) hVar.f43276b;
            fz.e eVar2 = (fz.e) hVar.f43275a;
            com.bumptech.glide.e.F(obj2);
            vVar = vVar3;
            eVar = eVar2;
            aVar = aVar5;
            if (uVar.f38357a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = yVar.f38361a;
            hVar.f43275a = aVar;
            hVar.f43276b = yVar;
            hVar.f43277c = vVar;
            hVar.f43278d = null;
            hVar.f43279e = null;
            hVar.H = 2;
            Object objInvoke = eVar.invoke(obj5, hVar);
            if (objInvoke != aVar4) {
                aVar3 = aVar;
                obj2 = objInvoke;
                vVar2 = vVar;
                if (!kotlin.jvm.internal.m.a(obj2, yVar.f38361a)) {
                    hVar.f43275a = aVar3;
                    hVar.f43276b = yVar;
                    hVar.f43277c = obj2;
                    hVar.H = 3;
                    if (vVar2.j(obj2, false, hVar) != aVar4) {
                        obj = obj2;
                        yVar2 = yVar;
                        aVar2 = aVar3;
                        yVar2.f38361a = obj;
                        yVar = yVar2;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = yVar.f38361a;
                aVar2.a(null);
                return obj6;
            }
            return aVar4;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.a(null);
            throw th;
        }
    }
}
