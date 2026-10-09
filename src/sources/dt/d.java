package dt;

import android.net.Uri;
import com.lingodeer.data.model.RecordingStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f23718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.l f23721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecordingStatus f23722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ht.q f23723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fz.c f23726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fz.a f23727j;

    public d(Uri videoUri, long j11, Object questionInstanceKey, ht.l audioPlayingState, RecordingStatus recordingStatus, ht.q courseTestState, boolean z11, boolean z12, fz.c onVideoPlayingStateChanged, fz.a getAudioTime) {
        kotlin.jvm.internal.m.f(videoUri, "videoUri");
        kotlin.jvm.internal.m.f(questionInstanceKey, "questionInstanceKey");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(onVideoPlayingStateChanged, "onVideoPlayingStateChanged");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        this.f23718a = videoUri;
        this.f23719b = j11;
        this.f23720c = questionInstanceKey;
        this.f23721d = audioPlayingState;
        this.f23722e = recordingStatus;
        this.f23723f = courseTestState;
        this.f23724g = z11;
        this.f23725h = z12;
        this.f23726i = onVideoPlayingStateChanged;
        this.f23727j = getAudioTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f23718a, dVar.f23718a) && this.f23719b == dVar.f23719b && kotlin.jvm.internal.m.a(this.f23720c, dVar.f23720c) && kotlin.jvm.internal.m.a(this.f23721d, dVar.f23721d) && kotlin.jvm.internal.m.a(this.f23722e, dVar.f23722e) && this.f23723f == dVar.f23723f && this.f23724g == dVar.f23724g && this.f23725h == dVar.f23725h && kotlin.jvm.internal.m.a(this.f23726i, dVar.f23726i) && kotlin.jvm.internal.m.a(this.f23727j, dVar.f23727j);
    }

    public final int hashCode() {
        int iHashCode = (this.f23721d.hashCode() + ((this.f23720c.hashCode() + defpackage.e.f(this.f23719b, this.f23718a.hashCode() * 31, 31)) * 31)) * 31;
        RecordingStatus recordingStatus = this.f23722e;
        return this.f23727j.hashCode() + ((this.f23726i.hashCode() + defpackage.e.e(defpackage.e.e((this.f23723f.hashCode() + ((iHashCode + (recordingStatus == null ? 0 : recordingStatus.hashCode())) * 31)) * 31, 31, this.f23724g), 31, this.f23725h)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeTitleSharedState(videoUri=");
        sb2.append(this.f23718a);
        sb2.append(", videoExternalStopSignal=");
        sb2.append(this.f23719b);
        sb2.append(", questionInstanceKey=");
        sb2.append(this.f23720c);
        sb2.append(", audioPlayingState=");
        sb2.append(this.f23721d);
        sb2.append(", recordingStatus=");
        sb2.append(this.f23722e);
        sb2.append(", courseTestState=");
        sb2.append(this.f23723f);
        b7.e0.z(", isSentenceLearn=", ", isSpeakingPractice=", sb2, this.f23724g, this.f23725h);
        sb2.append(", onVideoPlayingStateChanged=");
        sb2.append(this.f23726i);
        sb2.append(", getAudioTime=");
        sb2.append(this.f23727j);
        sb2.append(")");
        return sb2.toString();
    }
}
