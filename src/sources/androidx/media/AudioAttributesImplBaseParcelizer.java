package androidx.media;

import sa.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2106a = aVar.f(audioAttributesImplBase.f2106a, 1);
        audioAttributesImplBase.f2107b = aVar.f(audioAttributesImplBase.f2107b, 2);
        audioAttributesImplBase.f2108c = aVar.f(audioAttributesImplBase.f2108c, 3);
        audioAttributesImplBase.f2109d = aVar.f(audioAttributesImplBase.f2109d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f2106a, 1);
        aVar.j(audioAttributesImplBase.f2107b, 2);
        aVar.j(audioAttributesImplBase.f2108c, 3);
        aVar.j(audioAttributesImplBase.f2109d, 4);
    }
}
