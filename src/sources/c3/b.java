package c3;

import a2.s;
import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import b2.l;
import hd.d;
import java.util.Objects;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f6518b;

    public b(ContentCaptureSession contentCaptureSession, View view) {
        this.f6517a = contentCaptureSession;
        this.f6518b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionL = a.l(this.f6517a);
            s sVarR = f.r(this.f6518b);
            Objects.requireNonNull(sVarR);
            contentCaptureSessionL.notifyViewsDisappeared(a10.b.c(sVarR.f318a), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j11) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionL = a.l(this.f6517a);
        s sVarR = f.r(this.f6518b);
        Objects.requireNonNull(sVarR);
        return contentCaptureSessionL.newAutofillId(a10.b.c(sVarR.f318a), j11);
    }

    public final d c(AutofillId autofillId, long j11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new d(a.l(this.f6517a).newVirtualViewStructure(autofillId, j11), 6);
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.l(this.f6517a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.l(this.f6517a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.f6517a).notifyViewTextChanged(autofillId, str);
        }
    }
}
