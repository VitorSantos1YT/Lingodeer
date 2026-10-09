package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.lingodeer.R;
import p9.c;
import p9.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter A0;
    public Spinner B0;
    public final c C0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.C0 = new c(this, 0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.A0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f2311v0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public final void G(CharSequence[] charSequenceArr) {
        this.f2311v0 = charSequenceArr;
        ArrayAdapter arrayAdapter = this.A0;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = this.f2311v0;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        ArrayAdapter arrayAdapter = this.A0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g0 g0Var) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) g0Var.itemView.findViewById(R.id.spinner);
        this.B0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.A0);
        this.B0.setOnItemSelectedListener(this.C0);
        Spinner spinner2 = this.B0;
        String str = this.f2313x0;
        if (str == null || (charSequenceArr = this.f2312w0) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.n(g0Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void o() {
        this.B0.performClick();
    }
}
