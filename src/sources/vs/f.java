package vs;

import com.lingodeer.course.smarttips.data.model.AudioExampleType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioExampleType f54158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54159b;

    public f(AudioExampleType audioExampleType, int i11) {
        kotlin.jvm.internal.m.f(audioExampleType, "audioExampleType");
        this.f54158a = audioExampleType;
        this.f54159b = i11;
    }

    @Override // vs.m
    public final int a() {
        return this.f54159b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f54158a, fVar.f54158a) && this.f54159b == fVar.f54159b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54159b) + (this.f54158a.hashCode() * 31);
    }

    public final String toString() {
        return "AudioExample(audioExampleType=" + this.f54158a + ", id=" + this.f54159b + ")";
    }
}
