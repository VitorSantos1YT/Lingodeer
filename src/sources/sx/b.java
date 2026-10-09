package sx;

import com.bumptech.glide.g;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f51921b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f51920a = i11;
        this.f51921b = obj;
    }

    @Override // com.bumptech.glide.g
    public final g e(Serializable serializable) {
        switch (this.f51920a) {
            case 0:
                ((PrintStream) this.f51921b).print(serializable);
                break;
            default:
                ((PrintWriter) this.f51921b).print(serializable);
                break;
        }
        return this;
    }
}
