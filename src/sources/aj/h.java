package aj;

import android.view.animation.Interpolator;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f751a = System.currentTimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WaveView f752b;

    public h(WaveView waveView) {
        this.f752b = waveView;
    }

    public final float a() {
        float fCurrentTimeMillis = (System.currentTimeMillis() - this.f751a) * 1.0f;
        WaveView waveView = this.f752b;
        float f5 = fCurrentTimeMillis / waveView.f21753c;
        float f11 = waveView.f21751a;
        Interpolator interpolator = waveView.M;
        m.c(interpolator);
        return p0.a(waveView.f21752b, waveView.f21751a, interpolator.getInterpolation(f5), f11);
    }
}
