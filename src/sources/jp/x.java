package jp;

import android.content.Context;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;
import hj.r3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36549b;

    public /* synthetic */ x(Object obj, int i11) {
        this.f36548a = i11;
        this.f36549b = obj;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
        switch (this.f36548a) {
            case 0:
                z zVar = (z) this.f36549b;
                ta.a aVar = zVar.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                TextView textView = ((r3) aVar).f33219h;
                Context contextRequireContext = zVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                textView.setText(z.y(contextRequireContext, i11));
                break;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.f36549b;
                if (z11 && (seekBarPreference.f2369y0 || !seekBarPreference.f2364t0)) {
                    seekBarPreference.F(seekBar);
                } else {
                    int i12 = i11 + seekBarPreference.f2361q0;
                    TextView textView2 = seekBarPreference.f2366v0;
                    if (textView2 != null) {
                        textView2.setText(String.valueOf(i12));
                    }
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.f36548a) {
            case 0:
                ((z) this.f36549b).R = true;
                break;
            default:
                ((SeekBarPreference) this.f36549b).f2364t0 = true;
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar p4) {
        switch (this.f36548a) {
            case 0:
                kotlin.jvm.internal.m.f(p4, "p0");
                z zVar = (z) this.f36549b;
                zVar.R = false;
                th.e eVar = zVar.O;
                if (eVar == null) {
                    kotlin.jvm.internal.m.n("exoAudioPlayer");
                    throw null;
                }
                f7.i1 i1Var = eVar.f52415b;
                kotlin.jvm.internal.m.c(i1Var);
                i1Var.l0(5, p4.getProgress());
                return;
            default:
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.f36549b;
                seekBarPreference.f2364t0 = false;
                if (p4.getProgress() + seekBarPreference.f2361q0 != seekBarPreference.f2360p0) {
                    seekBarPreference.F(p4);
                    return;
                }
                return;
        }
    }
}
