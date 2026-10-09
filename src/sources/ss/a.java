package ss;

import app.rive.runtime.kotlin.RiveAnimationView;
import com.lingodeer.data.model.RecordingStatus;
import fz.e;
import java.util.Objects;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import l1.b1;
import rz.b0;
import vy.d;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f51775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecordingStatus f51776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f51777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f51778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b1 b1Var, RecordingStatus recordingStatus, String str, y yVar, d dVar) {
        super(2, dVar);
        this.f51775a = b1Var;
        this.f51776b = recordingStatus;
        this.f51777c = str;
        this.f51778d = yVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        return new a(this.f51775a, this.f51776b, this.f51777c, this.f51778d, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) create((b0) obj, (d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        aVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        b1 b1Var = this.f51775a;
        RiveAnimationView riveAnimationView = (RiveAnimationView) b1Var.getValue();
        if (riveAnimationView != null) {
            com.bumptech.glide.d.d(this.f51778d, b1Var);
            RecordingStatus recordingStatus = this.f51776b;
            Objects.toString(recordingStatus);
            boolean z11 = recordingStatus instanceof RecordingStatus.RecognizeError;
            String str = this.f51777c;
            if (z11 || (recordingStatus instanceof RecordingStatus.RecognizeSuccess)) {
                if (str.length() > 0) {
                    riveAnimationView.fireState("InLesson", str);
                }
            } else if (recordingStatus instanceof RecordingStatus.RecognizeShowScore) {
                if (((RecordingStatus.RecognizeShowScore) recordingStatus).getSpeechScore() >= 0.6f) {
                    riveAnimationView.fireState("InLesson", "Correct");
                } else {
                    riveAnimationView.fireState("InLesson", "Incorrect");
                }
            } else if (m.a(recordingStatus, RecordingStatus.Recording.INSTANCE)) {
                riveAnimationView.fireState("InLesson", "Listen");
            } else if (str.length() > 0) {
                riveAnimationView.fireState("InLesson", str);
            }
        }
        return qy.b0.f48488a;
    }
}
