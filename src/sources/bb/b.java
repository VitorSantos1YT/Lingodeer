package bb;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends j implements fz.c {
    @Override // fz.c
    public final Object invoke(Object obj) {
        WindowLayoutInfo p4 = (WindowLayoutInfo) obj;
        m.f(p4, "p0");
        ((MulticastConsumer) this.receiver).accept(p4);
        return b0.f48488a;
    }
}
