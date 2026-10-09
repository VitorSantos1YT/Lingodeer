package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1133a;

    public ComposeRuntimeError(String str) {
        this.f1133a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f1133a;
    }
}
