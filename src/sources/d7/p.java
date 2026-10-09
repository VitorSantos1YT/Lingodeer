package d7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f23255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f23256d;

    public p(f fVar) {
        fVar.getClass();
        this.f23253a = fVar;
        this.f23255c = Uri.EMPTY;
        this.f23256d = Collections.EMPTY_MAP;
    }

    @Override // d7.f
    public final void c(q qVar) {
        qVar.getClass();
        this.f23253a.c(qVar);
    }

    @Override // d7.f
    public final void close() {
        this.f23253a.close();
    }

    @Override // d7.f
    public final Map p() {
        return this.f23253a.p();
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) {
        int i13 = this.f23253a.read(bArr, i11, i12);
        if (i13 != -1) {
            this.f23254b += (long) i13;
        }
        return i13;
    }

    @Override // d7.f
    public final long u(h hVar) {
        f fVar = this.f23253a;
        this.f23255c = hVar.f23224a;
        this.f23256d = Collections.EMPTY_MAP;
        try {
            return fVar.u(hVar);
        } finally {
            Uri uriX = fVar.x();
            if (uriX != null) {
                this.f23255c = uriX;
            }
            this.f23256d = fVar.p();
        }
    }

    @Override // d7.f
    public final Uri x() {
        return this.f23253a.x();
    }
}
