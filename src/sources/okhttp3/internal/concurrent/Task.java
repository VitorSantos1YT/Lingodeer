package okhttp3.internal.concurrent;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TaskQueue f45216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45217d;

    public Task(String name, boolean z11) {
        m.f(name, "name");
        this.f45214a = name;
        this.f45215b = z11;
        this.f45217d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f45214a;
    }
}
