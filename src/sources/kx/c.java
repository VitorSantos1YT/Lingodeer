package kx;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f38883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38884c;

    public c(int i11, ThreadFactory threadFactory) {
        this.f38882a = i11;
        this.f38883b = new d[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f38883b[i12] = new d(threadFactory);
        }
    }
}
