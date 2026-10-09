package androidx.media;

import android.media.AudioAttributes;
import sa.a;
import sa.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2104a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f2104a, 1);
        audioAttributesImplApi21.f2105b = aVar.f(audioAttributesImplApi21.f2105b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2104a;
        aVar.i(1);
        ((b) aVar).f51524e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f2105b, 2);
    }
}
