package jt;

import com.lingodeer.data.model.RecognizeErrorType;
import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f36916a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(x0 x0Var, vy.d dVar) {
        super(2, dVar);
        this.f36916a = x0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new e1(this.f36916a, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        e1 e1Var = (e1) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        e1Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        this.f36916a.f37264j.setValue(new RecordingStatus.RecognizeError("录音文件无效", RecognizeErrorType.FILE_ERROR));
        return qy.b0.f48488a;
    }
}
