package f7;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f26673b;

    public /* synthetic */ c(Context context, int i11) {
        this.f26672a = i11;
        this.f26673b = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        t7.i iVar;
        switch (this.f26672a) {
            case 0:
                return z6.c.f(this.f26673b);
            case 1:
                return new ob.c(this.f26673b);
            case 2:
                return new p7.o(this.f26673b, new x7.k());
            case 3:
                return new s7.q(this.f26673b, new re.q(1));
            default:
                Context context = this.f26673b;
                ImmutableList immutableList = t7.i.f52067p;
                synchronized (t7.i.class) {
                    try {
                        if (t7.i.f52073v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            t7.i.f52073v = new t7.i(applicationContext, map);
                        }
                        iVar = t7.i.f52073v;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return iVar;
        }
    }
}
