package v5;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import re.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53570a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f53571b;

    public y(Spannable spannable) {
        this.f53571b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f53571b;
        if (!this.f53570a) {
            if ((Build.VERSION.SDK_INT < 28 ? new e0(6) : new x(6)).g(spannable)) {
                this.f53571b = new SpannableString(spannable);
            }
        }
        this.f53570a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f53571b.charAt(i11);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f53571b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f53571b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f53571b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f53571b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f53571b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i11, int i12, Class cls) {
        return this.f53571b.getSpans(i11, i12, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f53571b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i11, int i12, Class cls) {
        return this.f53571b.nextSpanTransition(i11, i12, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f53571b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i11, int i12, int i13) {
        a();
        this.f53571b.setSpan(obj, i11, i12, i13);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i11, int i12) {
        return this.f53571b.subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f53571b.toString();
    }
}
