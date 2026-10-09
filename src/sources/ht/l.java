package ht;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f33750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f33751d;

    public /* synthetic */ l(List list, int i11, float f5) {
        this(list, i11, f5, -1L);
    }

    public int a() {
        return this.f33749b;
    }

    public long b() {
        return this.f33751d;
    }

    public float c() {
        return this.f33750c;
    }

    public List d() {
        return this.f33748a;
    }

    public l(List list, int i11, float f5, long j11) {
        this.f33748a = list;
        this.f33749b = i11;
        this.f33750c = f5;
        this.f33751d = j11;
    }
}
