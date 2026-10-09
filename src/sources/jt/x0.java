package jt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av.j0 f37255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av.n f37256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CourseSentence f37257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f37260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.b1 f37261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.b1 f37262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.b1 f37263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.b1 f37264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1.b1 f37265k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(av.j0 audioRecorder, av.n exoAudioPlayer, av.c azureSpeaker, CourseSentence courseSentence, String recorderPath, String wordRecorderPath, boolean z11, l1.b1 courseTestState, l1.b1 audioPlayingState, l1.b1 displayWordsState, l1.b1 recordingStatusState, l1.b1 clickedCourseWordState) {
        super(audioRecorder, exoAudioPlayer, azureSpeaker, recorderPath, wordRecorderPath, audioPlayingState, recordingStatusState, clickedCourseWordState);
        kotlin.jvm.internal.m.f(audioRecorder, "audioRecorder");
        kotlin.jvm.internal.m.f(exoAudioPlayer, "exoAudioPlayer");
        kotlin.jvm.internal.m.f(azureSpeaker, "azureSpeaker");
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        kotlin.jvm.internal.m.f(recorderPath, "recorderPath");
        kotlin.jvm.internal.m.f(wordRecorderPath, "wordRecorderPath");
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(displayWordsState, "displayWordsState");
        kotlin.jvm.internal.m.f(recordingStatusState, "recordingStatusState");
        kotlin.jvm.internal.m.f(clickedCourseWordState, "clickedCourseWordState");
        this.f37255a = audioRecorder;
        this.f37256b = exoAudioPlayer;
        this.f37257c = courseSentence;
        this.f37258d = recorderPath;
        this.f37259e = wordRecorderPath;
        this.f37260f = z11;
        this.f37261g = courseTestState;
        this.f37262h = audioPlayingState;
        this.f37263i = displayWordsState;
        this.f37264j = recordingStatusState;
        this.f37265k = clickedCourseWordState;
    }

    @Override // jt.e
    public final l1.b1 a() {
        return this.f37262h;
    }

    @Override // jt.e
    public final av.j0 b() {
        return this.f37255a;
    }

    @Override // jt.e
    public final l1.b1 c() {
        return this.f37265k;
    }

    @Override // jt.e
    public final av.n d() {
        return this.f37256b;
    }

    @Override // jt.e
    public final l1.b1 e() {
        return this.f37264j;
    }
}
