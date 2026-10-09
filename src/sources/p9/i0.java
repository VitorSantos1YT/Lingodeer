package p9;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f46686a;

    public i0(SeekBarPreference seekBarPreference) {
        this.f46686a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f46686a;
        if ((!seekBarPreference.f2367w0 && (i11 == 21 || i11 == 22)) || i11 == 23 || i11 == 66 || (seekBar = seekBarPreference.f2365u0) == null) {
            return false;
        }
        return seekBar.onKeyDown(i11, keyEvent);
    }
}
