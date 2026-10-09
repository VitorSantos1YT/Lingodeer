package cc;

import gc.l;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6825a;

    public a(boolean z11) {
        this.f6825a = z11;
    }

    @Override // cc.b
    public final String a(Object obj, l lVar) {
        File file = (File) obj;
        if (!this.f6825a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
