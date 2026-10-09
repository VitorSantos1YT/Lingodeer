package z6;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f58929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f58930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y6.d f58931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f58932e;

    public b(int i11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, y6.d dVar) {
        this.f58928a = i11;
        this.f58930c = handler;
        this.f58931d = dVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            this.f58929b = new a(onAudioFocusChangeListener, handler);
        } else {
            this.f58929b = onAudioFocusChangeListener;
        }
        if (i12 >= 26) {
            this.f58932e = new AudioFocusRequest.Builder(i11).setAudioAttributes((AudioAttributes) dVar.a().f52461b).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f58932e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f58928a == bVar.f58928a && Objects.equals(this.f58929b, bVar.f58929b) && Objects.equals(this.f58930c, bVar.f58930c) && Objects.equals(this.f58931d, bVar.f58931d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f58928a), this.f58929b, this.f58930c, this.f58931d, Boolean.FALSE);
    }
}
