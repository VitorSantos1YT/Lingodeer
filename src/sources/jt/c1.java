package jt;

import com.lingodeer.data.model.RecognizeErrorType;
import com.lingodeer.data.model.RecordingStatus;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f36899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f36900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(List list, x0 x0Var, String str, vy.d dVar) {
        super(2, dVar);
        this.f36899a = list;
        this.f36900b = x0Var;
        this.f36901c = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new c1(this.f36899a, this.f36900b, this.f36901c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        c1 c1Var = (c1) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        c1Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        List list = this.f36899a;
        boolean zIsEmpty = list.isEmpty();
        x0 x0Var = this.f36900b;
        if (zIsEmpty) {
            x0Var.f37264j.setValue(new RecordingStatus.RecognizeError("识别结果为空", RecognizeErrorType.AUDIO_QUALITY_ERROR));
        } else {
            x0Var.f37264j.setValue(new RecordingStatus.RecognizeSuccess(this.f36901c, list));
        }
        return qy.b0.f48488a;
    }
}
