package vd;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f53963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53964b = true;

    public x(Appendable appendable) {
        this.f53963a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c11) throws IOException {
        boolean z11 = this.f53964b;
        Appendable appendable = this.f53963a;
        if (z11) {
            this.f53964b = false;
            appendable.append("  ");
        }
        this.f53964b = c11 == '\n';
        appendable.append(c11);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = BuildConfig.VERSION_NAME;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
        if (charSequence == null) {
            charSequence = BuildConfig.VERSION_NAME;
        }
        boolean z11 = this.f53964b;
        Appendable appendable = this.f53963a;
        boolean z12 = false;
        if (z11) {
            this.f53964b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i12 - 1) == '\n') {
            z12 = true;
        }
        this.f53964b = z12;
        appendable.append(charSequence, i11, i12);
        return this;
    }
}
