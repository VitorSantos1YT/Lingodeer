package x5;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f55789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f55790b;

    public d(TextView textView) {
        this.f55789a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        TextView textView = this.f55789a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = v5.j.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i14 == 0 && i13 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i11 != 0 || i12 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i11, i12);
                }
                return v5.j.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        v5.j jVarA = v5.j.a();
        if (this.f55790b == null) {
            this.f55790b = new c(textView, this);
        }
        jVarA.h(this.f55790b);
        return charSequence;
    }
}
