package jt;

import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f36904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, vy.d dVar) {
        super(2, dVar);
        this.f36904b = eVar;
        this.f36905c = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new d(this.f36904b, this.f36905c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36903a;
        e eVar = this.f36904b;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                av.j0 j0VarB = eVar.b();
                String str = this.f36905c;
                gr.s sVar = new gr.s(eVar, 21);
                this.f36903a = 1;
                if (j0VarB.e(str, sVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            if (kotlin.jvm.internal.m.a(eVar.e().getValue(), RecordingStatus.Recording.INSTANCE)) {
                eVar.e().setValue(RecordingStatus.ReadyRecord.INSTANCE);
            }
            return qy.b0.f48488a;
        } catch (Throwable th2) {
            if (kotlin.jvm.internal.m.a(eVar.e().getValue(), RecordingStatus.Recording.INSTANCE)) {
                eVar.e().setValue(RecordingStatus.ReadyRecord.INSTANCE);
            }
            throw th2;
        }
    }
}
