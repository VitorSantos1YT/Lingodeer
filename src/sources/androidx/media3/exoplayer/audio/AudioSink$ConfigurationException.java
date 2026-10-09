package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2124a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, p pVar) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.f2124a = pVar;
    }

    public AudioSink$ConfigurationException(String str, p pVar) {
        super(str);
        this.f2124a = pVar;
    }
}
