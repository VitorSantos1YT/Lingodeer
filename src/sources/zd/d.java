package zd;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f59155b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f59154a = i11;
        this.f59155b = obj;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f59154a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f59155b.getClass();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i11 = this.f59154a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i11 = this.f59154a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        switch (this.f59154a) {
            case 0:
                break;
        }
        return td.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.k kVar, com.bumptech.glide.load.data.c cVar) {
        switch (this.f59154a) {
            case 0:
                try {
                    cVar.f(pe.b.a((File) this.f59155b));
                } catch (IOException e8) {
                    cVar.c(e8);
                    return;
                }
                break;
            default:
                cVar.f(this.f59155b);
                break;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
