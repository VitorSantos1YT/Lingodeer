package androidx.media3.common.audio;

import z6.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public AudioProcessor$UnhandledAudioFormatException(e eVar) {
        this("Unhandled input format:", eVar);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, e eVar) {
        super(str + " " + eVar);
    }
}
