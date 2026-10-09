package m7;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f40979a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f40980b = new i();

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    @Override // m7.r
    public int a(Object obj) {
        String str = ((n) obj).f40984a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public List b(String str, boolean z11, boolean z12) {
        return s.d(str, z11, z12);
    }
}
