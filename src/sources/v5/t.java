package v5;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f53558b = new AtomicInteger(0);

    public t(Object obj) {
        this.f53557a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f53557a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        ((TextWatcher) this.f53557a).beforeTextChanged(charSequence, i11, i12, i13);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i11, int i12) {
        if (this.f53558b.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f53557a).onSpanAdded(spannable, obj, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        if (this.f53558b.get() <= 0 || !(obj instanceof w)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i15 = i11;
                i16 = i13;
            } else {
                if (i11 > i12) {
                    i11 = 0;
                }
                if (i13 > i14) {
                    i15 = i11;
                    i16 = 0;
                } else {
                    i15 = i11;
                    i16 = i13;
                }
            }
            ((SpanWatcher) this.f53557a).onSpanChanged(spannable, obj, i15, i12, i16, i14);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i11, int i12) {
        if (this.f53558b.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f53557a).onSpanRemoved(spannable, obj, i11, i12);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        ((TextWatcher) this.f53557a).onTextChanged(charSequence, i11, i12, i13);
    }
}
