package f0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends xy.h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f26182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f26183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f26184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.e f26185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(fz.c cVar, fz.a aVar, fz.a aVar2, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f26182c = cVar;
        this.f26183d = aVar;
        this.f26184e = aVar2;
        this.f26185f = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        a0 a0Var = new a0(this.f26182c, this.f26183d, this.f26184e, this.f26185f, dVar);
        a0Var.f26181b = obj;
        return a0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((s2.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007d, B:35:0x0085, B:37:0x0094, B:39:0x00a0, B:40:0x00a3, B:41:0x00a6, B:42:0x00ac, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        s2.b bVar;
        s2.t tVar;
        s2.b bVar2;
        ?? r9;
        int size;
        int i11;
        s2.t tVar2;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f26180a;
        fz.a aVar2 = this.f26184e;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                bVar = (s2.b) this.f26181b;
                this.f26181b = bVar;
                this.f26180a = 1;
                obj = s2.b(bVar, (2 & 1) != 0, s2.m.Main, this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i12 == 1) {
                bVar = (s2.b) this.f26181b;
                com.bumptech.glide.e.F(obj);
            } else {
                if (i12 == 2) {
                    bVar = (s2.b) this.f26181b;
                    com.bumptech.glide.e.F(obj);
                    tVar = (s2.t) obj;
                    if (tVar != null) {
                        this.f26182c.invoke(new f2.b(tVar.f51345c));
                        long j11 = tVar.f51343a;
                        b0.p1 p1Var = new b0.p1(16, this.f26185f);
                        this.f26181b = bVar;
                        this.f26180a = 3;
                        obj = g0.g(bVar, j11, p1Var, this);
                        if (obj != aVar) {
                            bVar2 = bVar;
                        }
                        return aVar;
                    }
                    return qy.b0.f48488a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (s2.b) this.f26181b;
                com.bumptech.glide.e.F(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                r9 = ((s2.k0) bVar2).f51327f.W.f51328a;
                size = r9.size();
                for (i11 = 0; i11 < size; i11++) {
                    tVar2 = (s2.t) r9.get(i11);
                    if (s2.s.b(tVar2)) {
                        tVar2.a();
                    }
                }
                this.f26183d.invoke();
            } else {
                aVar2.invoke();
            }
            return qy.b0.f48488a;
            long j12 = ((s2.t) obj).f51343a;
            this.f26181b = bVar;
            this.f26180a = 2;
            obj = g0.c(bVar, j12, this);
            if (obj != aVar) {
                tVar = (s2.t) obj;
                if (tVar != null) {
                    this.f26182c.invoke(new f2.b(tVar.f51345c));
                    long j13 = tVar.f51343a;
                    b0.p1 p1Var2 = new b0.p1(16, this.f26185f);
                    this.f26181b = bVar;
                    this.f26180a = 3;
                    obj = g0.g(bVar, j13, p1Var2, this);
                    if (obj != aVar) {
                        bVar2 = bVar;
                        if (((Boolean) obj).booleanValue()) {
                            r9 = ((s2.k0) bVar2).f51327f.W.f51328a;
                            size = r9.size();
                            while (i11 < size) {
                                tVar2 = (s2.t) r9.get(i11);
                                if (s2.s.b(tVar2)) {
                                    tVar2.a();
                                }
                            }
                            this.f26183d.invoke();
                        } else {
                            aVar2.invoke();
                        }
                    }
                }
                return qy.b0.f48488a;
            }
            return aVar;
        } catch (CancellationException e8) {
            aVar2.invoke();
            throw e8;
        }
    }
}
