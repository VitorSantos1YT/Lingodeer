package pz;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47233b;

    public g(String error, String str, int i11) {
        switch (i11) {
            case 1:
                this.f47232a = error;
                this.f47233b = str;
                break;
            default:
                m.f(error, "error");
                this.f47232a = error;
                this.f47233b = str;
                break;
        }
    }

    @Override // pz.h
    public d toInstant() {
        throw new j00.d(this.f47232a + " when parsing an Instant from \"" + f.r(64, this.f47233b) + '\"', 1);
    }
}
