package xd;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements qe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f56014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qe.e f56015b = new qe.e();

    public e(MessageDigest messageDigest) {
        this.f56014a = messageDigest;
    }

    @Override // qe.b
    public final qe.e a() {
        return this.f56015b;
    }
}
