package x5;

import android.text.Editable;
import v5.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f55782a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f55783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f55784c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f55784c;
        return cls != null ? new u(cls, charSequence) : super.newEditable(charSequence);
    }
}
