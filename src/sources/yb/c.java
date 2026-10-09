package yb;

import java.io.Closeable;
import oz.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f57575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f57576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f57577c;

    public c(e eVar, b bVar) {
        this.f57577c = eVar;
        this.f57575a = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f57576b) {
            return;
        }
        this.f57576b = true;
        e eVar = this.f57577c;
        synchronized (eVar) {
            b bVar = this.f57575a;
            int i11 = bVar.f57573h - 1;
            bVar.f57573h = i11;
            if (i11 == 0 && bVar.f57571f) {
                o oVar = e.S;
                eVar.p(bVar);
            }
        }
    }
}
