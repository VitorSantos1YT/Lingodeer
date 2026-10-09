package h7;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import b7.f0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f31847a;

    public d(f fVar) {
        this.f31847a = fVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        f fVar = this.f31847a;
        fVar.a(c.c(fVar.f31858a, fVar.f31866i, fVar.f31865h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        f fVar = this.f31847a;
        a5.j jVar = fVar.f31865h;
        String str = f0.f3975a;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (Objects.equals(audioDeviceInfo, jVar)) {
                fVar.f31865h = null;
                break;
            }
        }
        fVar.a(c.c(fVar.f31858a, fVar.f31866i, fVar.f31865h));
    }
}
