package se;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {
    private static final long serialVersionUID = -2488473066578201069L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51579b;

    public a(String str, String str2) {
        this.f51578a = str;
        this.f51579b = str2;
    }

    private final Object readResolve() {
        return new b(this.f51578a, this.f51579b);
    }
}
