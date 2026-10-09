package bs;

import dt.Xk.wuoM;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5132b;

    public g(boolean z11, String str) {
        this.f5131a = z11;
        this.f5132b = str;
    }

    public static g a(g gVar, boolean z11, String currentPlayingAudioPath) {
        gVar.getClass();
        gVar.getClass();
        m.f(currentPlayingAudioPath, "currentPlayingAudioPath");
        return new g(z11, currentPlayingAudioPath);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5131a == gVar.f5131a && this.f5132b.equals(gVar.f5132b);
    }

    public final int hashCode() {
        return this.f5132b.hashCode() + defpackage.e.e(Boolean.hashCode(this.f5131a) * 31, 31, false);
    }

    public final String toString() {
        return "ToneIntroductionState(isAudioPlaying=" + this.f5131a + wuoM.OUgzxxExU + this.f5132b + ")";
    }
}
