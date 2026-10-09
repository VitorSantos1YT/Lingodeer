package xw;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends ew.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f56633b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f56632a = i11;
        this.f56633b = obj;
    }

    @Override // ew.a
    public final void y(String str) {
        switch (this.f56632a) {
            case 0:
                ((PrintStream) this.f56633b).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f56633b).println((Object) str);
                break;
        }
    }
}
