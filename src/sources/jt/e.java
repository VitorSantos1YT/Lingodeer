package jt;

import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public e(av.j0 audioRecorder, av.n exoAudioPlayer, av.c azureSpeaker, String recorderPath, String wordRecorderPath, l1.b1 audioPlayingState, l1.b1 recordingStatusState, l1.b1 clickedCourseWordState) {
        kotlin.jvm.internal.m.f(audioRecorder, "audioRecorder");
        kotlin.jvm.internal.m.f(exoAudioPlayer, "exoAudioPlayer");
        kotlin.jvm.internal.m.f(azureSpeaker, "azureSpeaker");
        kotlin.jvm.internal.m.f(recorderPath, "recorderPath");
        kotlin.jvm.internal.m.f(wordRecorderPath, "wordRecorderPath");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(recordingStatusState, "recordingStatusState");
        kotlin.jvm.internal.m.f(clickedCourseWordState, "clickedCourseWordState");
    }

    public abstract l1.b1 a();

    public abstract av.j0 b();

    public abstract l1.b1 c();

    public abstract av.n d();

    public abstract l1.b1 e();

    public final void f(String recorderPath, fz.a aVar) {
        kotlin.jvm.internal.m.f(recorderPath, "recorderPath");
        h();
        a().setValue(c().getValue() != null ? ht.k.f33747e : ht.g.f33738e);
        av.n nVarD = d();
        b1.p pVar = new b1.p(16, aVar, this);
        nVarD.getClass();
        nVarD.f3172c = pVar;
        d().h(recorderPath);
    }

    public void g(rz.b0 scope, String recorderPath) {
        kotlin.jvm.internal.m.f(scope, "scope");
        kotlin.jvm.internal.m.f(recorderPath, "recorderPath");
        Object value = e().getValue();
        RecordingStatus.Recording recording = RecordingStatus.Recording.INSTANCE;
        if (kotlin.jvm.internal.m.a(value, recording) || kotlin.jvm.internal.m.a(e().getValue(), RecordingStatus.Recognizing.INSTANCE)) {
            return;
        }
        e().setValue(recording);
        rz.e0.B(scope, null, null, new d(this, recorderPath, null), 3);
    }

    public final void h() {
        d().n();
        d().a();
        a().setValue(ht.a.f33722e);
    }

    public void i() {
        b().f();
        e().setValue(RecordingStatus.Recognizing.INSTANCE);
    }
}
