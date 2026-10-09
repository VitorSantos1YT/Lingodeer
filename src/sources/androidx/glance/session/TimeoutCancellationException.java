package androidx.glance.session;

import ep.a;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2023b;

    public TimeoutCancellationException(String str, int i11) {
        super(str);
        this.f2022a = str;
        this.f2023b = i11;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2022a;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeoutCancellationException(");
        sb2.append(this.f2022a);
        sb2.append(", ");
        return a.j(sb2, this.f2023b, ')');
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
