package oz;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46174b;

    public m(String str, int i11) {
        this.f46173a = str;
        this.f46174b = i11;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.f46173a, this.f46174b);
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        return new o(patternCompile);
    }
}
