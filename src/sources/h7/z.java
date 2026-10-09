package h7;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import b7.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements o {
    public final AudioTrack a(j jVar, y6.d dVar, int i11, Context context) {
        int i12 = Build.VERSION.SDK_INT;
        int i13 = jVar.f31878b;
        int i14 = jVar.f31879c;
        int i15 = jVar.f31877a;
        String str = f0.f3975a;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(jVar.f31880d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) dVar.a().f52461b).setAudioFormat(new AudioFormat.Builder().setSampleRate(i13).setChannelMask(i14).setEncoding(i15).build()).setTransferMode(1).setBufferSizeInBytes(jVar.f31882f).setSessionId(i11);
        if (i12 >= 29) {
            sessionId.setOffloadedPlayback(jVar.f31881e);
        }
        if (i12 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
