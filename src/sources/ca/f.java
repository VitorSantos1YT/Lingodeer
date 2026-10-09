package ca;

import qy.b0;
import w9.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f6774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xy.i f6775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(int i11, fz.c cVar, vy.d dVar, s sVar) {
        super(1, dVar);
        this.f6772a = i11;
        switch (i11) {
            case 1:
                this.f6774c = sVar;
                this.f6775d = (xy.i) cVar;
                super(1, dVar);
                break;
            default:
                this.f6774c = sVar;
                this.f6775d = (xy.i) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fz.c, xy.i] */
    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f6772a) {
            case 0:
                return new f(0, this.f6775d, dVar, this.f6774c);
            default:
                return new f(1, this.f6775d, dVar, this.f6774c);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f6772a) {
            case 0:
                break;
        }
        return ((f) create(dVar)).invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r7v6, types: [fz.c, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6772a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f6773b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                ?? r9 = this.f6775d;
                s sVar = this.f6774c;
                e eVar = new e(0, r9, null, sVar);
                this.f6773b = 1;
                Object objY = sVar.y(false, eVar, this);
                return objY == aVar ? aVar : objY;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f6773b;
                s sVar2 = this.f6774c;
                try {
                    if (i12 == 0) {
                        com.bumptech.glide.e.F(obj);
                        sVar2.c();
                        ?? r11 = this.f6775d;
                        this.f6773b = 1;
                        obj = r11.invoke(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    sVar2.x();
                    sVar2.s();
                    return obj;
                } catch (Throwable th2) {
                    sVar2.s();
                    throw th2;
                }
        }
    }
}
