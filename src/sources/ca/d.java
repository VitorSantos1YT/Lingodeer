package ca;

import jr.i0;
import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;
import w9.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xy.i f6765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i11, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f6762a = i11;
        switch (i11) {
            case 1:
                this.f6765d = (xy.i) cVar;
                super(2, dVar);
                break;
            default:
                this.f6765d = (xy.i) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v4, types: [fz.c, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6762a) {
            case 0:
                d dVar2 = new d(0, (fz.c) this.f6765d, dVar);
                dVar2.f6764c = obj;
                return dVar2;
            case 1:
                d dVar3 = new d(1, (fz.c) this.f6765d, dVar);
                dVar3.f6764c = obj;
                return dVar3;
            case 2:
                d dVar4 = new d((fz.e) this.f6765d, dVar, 2);
                dVar4.f6764c = obj;
                return dVar4;
            case 3:
                d dVar5 = new d((fz.e) this.f6765d, dVar, 3);
                dVar5.f6764c = obj;
                return dVar5;
            default:
                d dVar6 = new d(this.f6765d, dVar);
                dVar6.f6764c = obj;
                return dVar6;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6762a) {
            case 0:
                return ((d) create((y9.l) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 1:
                return ((d) create((y9.l) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 2:
                return ((d) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 3:
                return ((d) create((r5.b) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            default:
                return ((d) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Type inference failed for: r1v10, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r1v5, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r7v3, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r7v9, types: [fz.c, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        v vVar;
        Throwable th2;
        switch (this.f6762a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f6763b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f6763b = 1;
                Object objInvoke = this.f6765d.invoke(this);
                return objInvoke == aVar ? aVar : objInvoke;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f6763b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f6763b = 1;
                Object objInvoke2 = this.f6765d.invoke(this);
                return objInvoke2 == aVar2 ? aVar2 : objInvoke2;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f6763b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i0 i0Var = new i0((uz.j) this.f6764c, (fz.e) this.f6765d, (vy.d) null);
                    this.f6763b = 1;
                    if (e0.l(i0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f6763b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r5.b bVar = (r5.b) this.f6764c;
                    com.bumptech.glide.e.F(obj);
                    return bVar;
                }
                com.bumptech.glide.e.F(obj);
                r5.b bVarG = ((r5.b) this.f6764c).g();
                this.f6764c = bVarG;
                this.f6763b = 1;
                return this.f6765d.invoke(bVarG, this) == aVar4 ? aVar4 : bVarG;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f6763b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = (v) this.f6764c;
                    try {
                        com.bumptech.glide.e.F(obj);
                        if (vVar.f54873b.decrementAndGet() >= 0) {
                            return obj;
                        }
                        throw new IllegalStateException("Transaction was never started or was already released.");
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (vVar.f54873b.decrementAndGet() >= 0) {
                            throw th2;
                        }
                        throw new IllegalStateException("Transaction was never started or was already released.");
                    }
                }
                com.bumptech.glide.e.F(obj);
                vy.g gVar = ((rz.b0) this.f6764c).getCoroutineContext().get(v.f54871c);
                m.c(gVar);
                v vVar2 = (v) gVar;
                vVar2.f54873b.incrementAndGet();
                try {
                    ?? r9 = this.f6765d;
                    this.f6764c = vVar2;
                    this.f6763b = 1;
                    Object objInvoke3 = r9.invoke(this);
                    if (objInvoke3 == aVar5) {
                        return aVar5;
                    }
                    vVar = vVar2;
                    obj = objInvoke3;
                    if (vVar.f54873b.decrementAndGet() >= 0) {
                        return obj;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                } catch (Throwable th4) {
                    vVar = vVar2;
                    th2 = th4;
                    if (vVar.f54873b.decrementAndGet() >= 0) {
                        throw th2;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f6762a = 4;
        this.f6765d = (xy.i) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(fz.e eVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6762a = i11;
        switch (i11) {
            case 3:
                this.f6765d = (xy.i) eVar;
                super(2, dVar);
                break;
            default:
                this.f6765d = (xy.i) eVar;
                break;
        }
    }
}
