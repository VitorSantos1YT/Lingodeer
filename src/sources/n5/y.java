package n5;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f43427a = new y(1);

    @Override // fz.c
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.m.f(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.m.e(absolutePath, "file.canonicalFile.absolutePath");
        return new w0(absolutePath);
    }
}
