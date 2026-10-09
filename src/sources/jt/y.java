package jt;

import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f37269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar, vy.d dVar) {
        super(2, dVar);
        this.f37269a = vVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new y(this.f37269a, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        yVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        v vVar = this.f37269a;
        l1.b1 b1Var = vVar.f37214e;
        l1.b1 b1Var2 = vVar.f37226r;
        if (((Boolean) b1Var2.getValue()).booleanValue()) {
            if (b1Var.getValue() instanceof RecordingStatus.Recording) {
                vVar.f37210a.f();
                b1Var.setValue(RecordingStatus.ReadyRecord.INSTANCE);
            }
            b1Var2.setValue(Boolean.FALSE);
        }
        return qy.b0.f48488a;
    }
}
