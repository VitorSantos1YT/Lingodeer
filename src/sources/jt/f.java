package jt;

import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f36919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, vy.d dVar) {
        super(2, dVar);
        this.f36919b = gVar;
        this.f36920c = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new f(this.f36919b, this.f36920c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        g gVar = this.f36919b;
        l1.b1 b1Var = gVar.f36938g;
        l1.b1 b1Var2 = gVar.f36941j;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36918a;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                av.j0 j0Var = gVar.f36932a;
                String str = this.f36920c;
                bt.s sVar = new bt.s(gVar, 1);
                this.f36918a = 1;
                if (j0Var.e(str, sVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            if (kotlin.jvm.internal.m.a(b1Var2.getValue(), RecordingStatus.Recording.INSTANCE)) {
                b1Var2.setValue(RecordingStatus.ReadyRecord.INSTANCE);
                b1Var.setValue(ht.q.SELECTED);
            }
            return qy.b0.f48488a;
        } catch (Throwable th2) {
            if (kotlin.jvm.internal.m.a(b1Var2.getValue(), RecordingStatus.Recording.INSTANCE)) {
                b1Var2.setValue(RecordingStatus.ReadyRecord.INSTANCE);
                b1Var.setValue(ht.q.SELECTED);
            }
            throw th2;
        }
    }
}
