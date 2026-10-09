package d1;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.a f22952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f22953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f22955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xy.i f22956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(r rVar, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f22955d = rVar;
        this.f22956e = (xy.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new p(this.f22955d, this.f22956e, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [fz.e, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        r rVar;
        a00.a aVar;
        a00.a aVar2;
        Throwable th2;
        TextClassifier textClassifierA;
        Object objO;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f22954c;
        vy.d dVar = null;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                rVar = this.f22955d;
                aVar = rVar.f22979e;
                this.f22952a = aVar;
                this.f22953b = rVar;
                this.f22954c = 1;
                if (aVar.b(this) != aVar3) {
                }
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                aVar2 = this.f22952a;
                try {
                    com.bumptech.glide.e.F(obj);
                    textClassifierA = com.google.firebase.remoteconfig.a.a(obj);
                    aVar = aVar2;
                    aVar.a(null);
                    b1.c cVar = new b1.c(textClassifierA, (fz.e) this.f22956e, (vy.d) null);
                    this.f22952a = null;
                    this.f22953b = null;
                    this.f22954c = 3;
                    objO = rz.e0.O(200L, cVar, this);
                    if (objO == aVar3) {
                        return aVar3;
                    }
                    return objO;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.a(null);
                    throw th2;
                }
            }
            rVar = this.f22953b;
            a00.a aVar4 = this.f22952a;
            com.bumptech.glide.e.F(obj);
            aVar = aVar4;
            textClassifierA = rVar.f22980f;
            if (textClassifierA == null || textClassifierA.isDestroyed()) {
                av.p pVar = new av.p(rVar, dVar, 13);
                this.f22952a = aVar;
                this.f22953b = null;
                this.f22954c = 2;
                Object objO2 = rz.e0.O(300L, pVar, this);
                if (objO2 != aVar3) {
                    aVar2 = aVar;
                    obj = objO2;
                    textClassifierA = com.google.firebase.remoteconfig.a.a(obj);
                    aVar = aVar2;
                    aVar.a(null);
                    b1.c cVar2 = new b1.c(textClassifierA, (fz.e) this.f22956e, (vy.d) null);
                    this.f22952a = null;
                    this.f22953b = null;
                    this.f22954c = 3;
                    objO = rz.e0.O(200L, cVar2, this);
                    if (objO == aVar3) {
                        return objO;
                    }
                }
            } else {
                aVar.a(null);
                b1.c cVar3 = new b1.c(textClassifierA, (fz.e) this.f22956e, (vy.d) null);
                this.f22952a = null;
                this.f22953b = null;
                this.f22954c = 3;
                objO = rz.e0.O(200L, cVar3, this);
                if (objO == aVar3) {
                    return objO;
                }
            }
            return aVar3;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            aVar2.a(null);
            throw th2;
        }
    }
}
