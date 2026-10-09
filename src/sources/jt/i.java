package jt;

import com.lingodeer.data.model.RecordingStatus;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f36966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36967b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, String str, vy.d dVar) {
        super(2, dVar);
        this.f36966a = gVar;
        this.f36967b = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new i(this.f36966a, this.f36967b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        i iVar = (i) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        iVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        g gVar = this.f36966a;
        l1.b1 b1Var = gVar.f36941j;
        if (gVar.f36942k.getValue() == null) {
            String str = this.f36967b;
            if (com.google.android.material.datepicker.d.D(str)) {
                new File(str).delete();
            }
            if (b1Var.getValue() instanceof RecordingStatus.RecognizeShowScore) {
                Object value = b1Var.getValue();
                kotlin.jvm.internal.m.d(value, "null cannot be cast to non-null type com.lingodeer.data.model.RecordingStatus.RecognizeShowScore");
                b1Var.setValue(RecordingStatus.RecognizeShowScore.copy$default((RecordingStatus.RecognizeShowScore) value, CropImageView.DEFAULT_ASPECT_RATIO, false, 1, null));
            }
        }
        return qy.b0.f48488a;
    }
}
