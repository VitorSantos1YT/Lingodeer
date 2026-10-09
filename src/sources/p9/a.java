package p9;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TwoStatePreference f46639b;

    public /* synthetic */ a(TwoStatePreference twoStatePreference, int i11) {
        this.f46638a = i11;
        this.f46639b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
        switch (this.f46638a) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f46639b;
                checkBoxPreference.a(Boolean.valueOf(z11));
                checkBoxPreference.E(z11);
                break;
            case 1:
                SwitchPreference switchPreference = (SwitchPreference) this.f46639b;
                switchPreference.a(Boolean.valueOf(z11));
                switchPreference.E(z11);
                break;
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f46639b;
                switchPreferenceCompat.a(Boolean.valueOf(z11));
                switchPreferenceCompat.E(z11);
                break;
        }
    }
}
