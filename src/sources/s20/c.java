package s20;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f51378b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f51377a = i11;
        this.f51378b = obj;
    }

    @Override // s20.b
    public final String a() {
        switch (this.f51377a) {
            case 0:
                return ((File) this.f51378b).getAbsolutePath();
            default:
                return (String) this.f51378b;
        }
    }

    @Override // s20.b
    public final InputStream b() {
        switch (this.f51377a) {
            case 0:
                return new FileInputStream((File) this.f51378b);
            default:
                return new FileInputStream((String) this.f51378b);
        }
    }
}
