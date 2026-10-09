package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f2104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2105b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2104a.equals(((AudioAttributesImplApi21) obj).f2104a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2104a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2104a;
    }
}
