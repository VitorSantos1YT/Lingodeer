package kb;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import oz.q;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f38031b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i11, fz.a aVar) {
        super(0);
        this.f38030a = i11;
        switch (i11) {
            case 1:
                this.f38031b = (n) aVar;
                super(0);
                break;
            default:
                this.f38031b = (n) aVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fz.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v3, types: [fz.a, kotlin.jvm.internal.n] */
    @Override // fz.a
    public final Object invoke() {
        switch (this.f38030a) {
            case 0:
                this.f38031b.invoke();
                return b0.f48488a;
            default:
                File file = (File) this.f38031b.invoke();
                m.f(file, "<this>");
                String name = file.getName();
                m.e(name, "getName(...)");
                if (q.b1(name, BuildConfig.VERSION_NAME, '.').equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    m.e(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
