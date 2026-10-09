package jt;

import com.lingodeer.data.model.RecognizeErrorType;
import com.lingodeer.data.model.RecordingStatus;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f36891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f36892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(List list, v vVar, String str, vy.d dVar) {
        super(2, dVar);
        this.f36891a = list;
        this.f36892b = vVar;
        this.f36893c = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new b0(this.f36891a, this.f36892b, this.f36893c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var2 = qy.b0.f48488a;
        b0Var.invokeSuspend(b0Var2);
        return b0Var2;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        List list = this.f36891a;
        boolean zIsEmpty = list.isEmpty();
        v vVar = this.f36892b;
        if (zIsEmpty) {
            vVar.f37214e.setValue(new RecordingStatus.RecognizeError("识别结果为空", RecognizeErrorType.AUDIO_QUALITY_ERROR));
        } else {
            vVar.f37214e.setValue(new RecordingStatus.RecognizeSuccess(this.f36893c, list));
        }
        return qy.b0.f48488a;
    }
}
