package jt;

import com.lingodeer.data.model.RecognizeErrorType;
import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f36906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(v vVar, vy.d dVar) {
        super(2, dVar);
        this.f36906a = vVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new d0(this.f36906a, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        d0Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        this.f36906a.f37214e.setValue(new RecordingStatus.RecognizeError("录音文件无效", RecognizeErrorType.FILE_ERROR));
        return qy.b0.f48488a;
    }
}
