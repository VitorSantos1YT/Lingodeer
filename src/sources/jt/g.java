package jt;

import androidx.drawerlayout.widget.ktFt.FpIL;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.j0 f36932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.n f36933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CourseSentence f36934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f36937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.b1 f36938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.b1 f36939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.b1 f36940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.b1 f36941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1.b1 f36942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1.b1 f36943l;
    public final boolean m;

    @Override // jt.e
    public final l1.b1 a() {
        return this.f36939h;
    }

    @Override // jt.e
    public final av.j0 b() {
        return this.f36932a;
    }

    @Override // jt.e
    public final l1.b1 c() {
        return this.f36942k;
    }

    @Override // jt.e
    public final av.n d() {
        return this.f36933b;
    }

    @Override // jt.e
    public final l1.b1 e() {
        return this.f36941j;
    }

    @Override // jt.e
    public final void g(rz.b0 scope, String recorderPath) {
        kotlin.jvm.internal.m.f(scope, "scope");
        kotlin.jvm.internal.m.f(recorderPath, "recorderPath");
        if (this.m) {
            super.g(scope, recorderPath);
            return;
        }
        l1.b1 b1Var = this.f36941j;
        Object value = b1Var.getValue();
        RecordingStatus.Recording recording = RecordingStatus.Recording.INSTANCE;
        if (kotlin.jvm.internal.m.a(value, recording) || kotlin.jvm.internal.m.a(b1Var.getValue(), RecordingStatus.Recognizing.INSTANCE)) {
            return;
        }
        b1Var.setValue(recording);
        rz.e0.B(scope, null, null, new f(this, recorderPath, null), 3);
    }

    @Override // jt.e
    public final void i() {
        if (this.m) {
            super.i();
            return;
        }
        this.f36932a.f();
        this.f36941j.setValue(RecordingStatus.ReadyRecord.INSTANCE);
        this.f36938g.setValue(ht.q.SELECTED);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(av.j0 audioRecorder, av.n exoAudioPlayer, av.c azureSpeaker, CourseSentence courseSentence, String recorderPath, String wordRecorderPath, boolean z11, l1.b1 b1Var, l1.b1 audioPlayingState, l1.b1 displayWordsState, l1.b1 recordingStatusState, l1.b1 clickedCourseWordState, l1.b1 toneAssessmentResultState, boolean z12) {
        super(audioRecorder, exoAudioPlayer, azureSpeaker, recorderPath, wordRecorderPath, audioPlayingState, recordingStatusState, clickedCourseWordState);
        kotlin.jvm.internal.m.f(audioRecorder, "audioRecorder");
        kotlin.jvm.internal.m.f(exoAudioPlayer, "exoAudioPlayer");
        kotlin.jvm.internal.m.f(azureSpeaker, "azureSpeaker");
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        kotlin.jvm.internal.m.f(recorderPath, "recorderPath");
        kotlin.jvm.internal.m.f(wordRecorderPath, "wordRecorderPath");
        kotlin.jvm.internal.m.f(b1Var, FpIL.Fwl);
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(displayWordsState, "displayWordsState");
        kotlin.jvm.internal.m.f(recordingStatusState, "recordingStatusState");
        kotlin.jvm.internal.m.f(clickedCourseWordState, "clickedCourseWordState");
        kotlin.jvm.internal.m.f(toneAssessmentResultState, "toneAssessmentResultState");
        this.f36932a = audioRecorder;
        this.f36933b = exoAudioPlayer;
        this.f36934c = courseSentence;
        this.f36935d = recorderPath;
        this.f36936e = wordRecorderPath;
        this.f36937f = z11;
        this.f36938g = b1Var;
        this.f36939h = audioPlayingState;
        this.f36940i = displayWordsState;
        this.f36941j = recordingStatusState;
        this.f36942k = clickedCourseWordState;
        this.f36943l = toneAssessmentResultState;
        this.m = z12;
    }
}
