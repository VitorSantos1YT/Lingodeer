package ac;

import android.webkit.MimeTypeMap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import m00.a0;
import m00.o;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f536a;

    public i(File file) {
        this.f536a = file;
    }

    @Override // ac.h
    public final Object a(vy.d dVar) {
        String str = a0.f40673b;
        File file = this.f536a;
        xb.n nVar = new xb.n(p20.c.n(file), o.f40737a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        kotlin.jvm.internal.m.e(name, "getName(...)");
        return new n(nVar, singleton.getMimeTypeFromExtension(q.b1(name, BuildConfig.VERSION_NAME, '.')), xb.e.DISK);
    }
}
