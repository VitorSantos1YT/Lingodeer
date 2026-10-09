package w4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f54636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f54637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f54638e;

    public /* synthetic */ e(String str, Context context, Object obj, int i11, int i12) {
        this.f54634a = i12;
        this.f54635b = str;
        this.f54636c = context;
        this.f54638e = obj;
        this.f54637d = i11;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f54634a) {
            case 0:
                Object[] objArr = {(d) this.f54638e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return g.b(this.f54635b, this.f54636c, Collections.unmodifiableList(arrayList), this.f54637d);
            default:
                try {
                    return g.b(this.f54635b, this.f54636c, (List) this.f54638e, this.f54637d);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
