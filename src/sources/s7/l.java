package s7;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import b7.f0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f51436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f51438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f51439d;

    public l(Context context, q qVar, Boolean bool) {
        AudioManager audioManagerF = context == null ? null : z6.c.f(context);
        if (audioManagerF == null || (bool != null && bool.booleanValue())) {
            this.f51436a = null;
            this.f51437b = false;
            this.f51438c = null;
            this.f51439d = null;
            return;
        }
        Spatializer spatializer = audioManagerF.getSpatializer();
        this.f51436a = spatializer;
        this.f51437b = spatializer.getImmersiveAudioLevel() != 0;
        k kVar = new k(qVar);
        this.f51439d = kVar;
        Looper looperMyLooper = Looper.myLooper();
        b7.a.k(looperMyLooper);
        Handler handler = new Handler(looperMyLooper);
        this.f51438c = handler;
        spatializer.addOnSpatializerStateChangedListener(new h7.u(handler, 0), kVar);
    }

    public final boolean a(y6.d dVar, y6.p pVar) {
        String str = pVar.f57291n;
        String str2 = pVar.f57291n;
        int i11 = pVar.F;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i11 == 16) {
                i11 = 12;
            }
        } else if (Objects.equals(str2, "audio/iamf")) {
            if (i11 == -1) {
                i11 = 6;
            }
        } else if (Objects.equals(str2, "audio/ac4") && (i11 == 18 || i11 == 21)) {
            i11 = 24;
        }
        int iP = f0.p(i11);
        if (iP == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iP);
        int i12 = pVar.G;
        if (i12 != -1) {
            channelMask.setSampleRate(i12);
        }
        Spatializer spatializer = this.f51436a;
        spatializer.getClass();
        return spatializer.canBeSpatialized((AudioAttributes) dVar.a().f52461b, channelMask.build());
    }

    public final boolean b() {
        Spatializer spatializer = this.f51436a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer = this.f51436a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final void d() {
        k kVar;
        Handler handler;
        Spatializer spatializer = this.f51436a;
        if (spatializer == null || (kVar = this.f51439d) == null || (handler = this.f51438c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(kVar);
        handler.removeCallbacksAndMessages(null);
    }
}
