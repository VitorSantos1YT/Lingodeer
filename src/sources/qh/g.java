package qh;

import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.MaterialCheckable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47759b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f47758a = i11;
        this.f47759b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
        switch (this.f47758a) {
            case 0:
                m mVar = (m) this.f47759b;
                kotlin.jvm.internal.m.f(compoundButton, "<unused var>");
                if (z11) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mVar), null, null, new l(mVar, null, 0), 3);
                }
                break;
            case 1:
                m mVar2 = (m) this.f47759b;
                kotlin.jvm.internal.m.f(compoundButton, "<unused var>");
                if (z11) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mVar2), null, null, new l(mVar2, null, 1), 3);
                }
                break;
            case 2:
                m mVar3 = (m) this.f47759b;
                kotlin.jvm.internal.m.f(compoundButton, "<unused var>");
                if (z11) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(mVar3), null, null, new l(mVar3, null, 2), 3);
                }
                break;
            default:
                Chip chip = (Chip) this.f47759b;
                MaterialCheckable.OnCheckedChangeListener onCheckedChangeListener = chip.L;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.a(chip, z11);
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = chip.K;
                if (onCheckedChangeListener2 != null) {
                    onCheckedChangeListener2.onCheckedChanged(compoundButton, z11);
                }
                break;
        }
    }
}
