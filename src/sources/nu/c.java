package nu;

import java.util.Iterator;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f44054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f44057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f44053a = i11;
        this.f44057e = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f44053a) {
            case 0:
                return new c(this.f44057e, dVar, 0);
            default:
                return new c(this.f44057e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f44053a) {
            case 0:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:19:0x006a->B:51:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[LOOP:2: B:41:0x00f3->B:59:?, LOOP_END, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Iterator itListIterator;
        int i11;
        Iterator itListIterator2;
        b0.d dVar;
        Float f5;
        Iterator itListIterator3;
        int i12;
        Iterator itListIterator4;
        b0.d dVar2;
        Float f11;
        switch (this.f44053a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f44056d;
                e eVar = this.f44057e;
                int i14 = 0;
                if (i13 != 0) {
                    if (i13 == 1) {
                        i11 = this.f44055c;
                        itListIterator = this.f44054b;
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i15 = this.f44055c;
                        itListIterator2 = this.f44054b;
                        com.bumptech.glide.e.F(obj);
                        i14 = i15;
                    }
                    while (itListIterator2.hasNext()) {
                        dVar = (b0.d) itListIterator2.next();
                        f5 = new Float(1.0f);
                        this.f44054b = itListIterator2;
                        this.f44055c = i14;
                        this.f44056d = 2;
                        if (dVar.e(f5, this) == aVar) {
                            return aVar;
                        }
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                itListIterator = eVar.f44062a.H.listIterator();
                i11 = 0;
                while (itListIterator.hasNext()) {
                    b0.d dVar3 = (b0.d) itListIterator.next();
                    Float f12 = new Float(1.0f);
                    this.f44054b = itListIterator;
                    this.f44055c = i11;
                    this.f44056d = 1;
                    if (dVar3.e(f12, this) == aVar) {
                        return aVar;
                    }
                }
                itListIterator2 = eVar.f44062a.I.listIterator();
                while (itListIterator2.hasNext()) {
                    dVar = (b0.d) itListIterator2.next();
                    f5 = new Float(1.0f);
                    this.f44054b = itListIterator2;
                    this.f44055c = i14;
                    this.f44056d = 2;
                    if (dVar.e(f5, this) == aVar) {
                        return aVar;
                    }
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f44056d;
                e eVar2 = this.f44057e;
                int i17 = 0;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i12 = this.f44055c;
                        itListIterator3 = this.f44054b;
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i18 = this.f44055c;
                        itListIterator4 = this.f44054b;
                        com.bumptech.glide.e.F(obj);
                        i17 = i18;
                    }
                    while (itListIterator4.hasNext()) {
                        dVar2 = (b0.d) itListIterator4.next();
                        f11 = new Float(1.0f);
                        this.f44054b = itListIterator4;
                        this.f44055c = i17;
                        this.f44056d = 2;
                        if (dVar2.e(f11, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                itListIterator3 = eVar2.f44062a.H.listIterator();
                i12 = 0;
                while (itListIterator3.hasNext()) {
                    b0.d dVar4 = (b0.d) itListIterator3.next();
                    Float f13 = new Float(1.0f);
                    this.f44054b = itListIterator3;
                    this.f44055c = i12;
                    this.f44056d = 1;
                    if (dVar4.e(f13, this) == aVar2) {
                        return aVar2;
                    }
                }
                itListIterator4 = eVar2.f44062a.I.listIterator();
                while (itListIterator4.hasNext()) {
                    dVar2 = (b0.d) itListIterator4.next();
                    f11 = new Float(1.0f);
                    this.f44054b = itListIterator4;
                    this.f44055c = i17;
                    this.f44056d = 2;
                    if (dVar2.e(f11, this) == aVar2) {
                        return aVar2;
                    }
                }
                return qy.b0.f48488a;
        }
    }
}
