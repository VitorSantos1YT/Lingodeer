package rd;

import bq.f;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f49090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File[] f49091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File[] f49092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f49093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f49094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f49095g;

    public b(c cVar, String str) {
        this.f49095g = cVar;
        this.f49089a = str;
        int i11 = cVar.f49102t;
        File file = cVar.f49096a;
        this.f49090b = new long[i11];
        this.f49091c = new File[i11];
        this.f49092d = new File[i11];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(i12);
            this.f49091c[i12] = new File(file, sb2.toString());
            sb2.append(".tmp");
            this.f49092d[i12] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j11 : this.f49090b) {
            sb2.append(' ');
            sb2.append(j11);
        }
        return sb2.toString();
    }
}
