package ce;

import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements vd.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6847a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6848b;

    public d0(byte[] bArr) {
        pe.f.c(bArr, "Argument must not be null");
        this.f6848b = bArr;
    }

    @Override // vd.b0
    public final void b() {
        int i11 = this.f6847a;
    }

    @Override // vd.b0
    public final int c() {
        switch (this.f6847a) {
            case 0:
                return pe.m.c((Bitmap) this.f6848b);
            case 1:
                return ((byte[]) this.f6848b).length;
            default:
                return 1;
        }
    }

    @Override // vd.b0
    public final Class d() {
        switch (this.f6847a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return ((File) this.f6848b).getClass();
        }
    }

    @Override // vd.b0
    public final Object get() {
        switch (this.f6847a) {
            case 0:
                return (Bitmap) this.f6848b;
            case 1:
                return (byte[]) this.f6848b;
            default:
                return (File) this.f6848b;
        }
    }

    public d0(File file) {
        pe.f.c(file, "Argument must not be null");
        this.f6848b = file;
    }

    public d0(Bitmap bitmap) {
        this.f6848b = bitmap;
    }

    private final void a() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
