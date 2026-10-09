package f00;

import com.android.billingclient.api.h;
import e00.g;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface d {
    void C(long j11);

    b D(g gVar, int i11);

    void F(String str);

    h a();

    b d(g gVar);

    void e();

    default void h(c00.a serializer, Object obj) {
        m.f(serializer, "serializer");
        if (serializer.getDescriptor().c()) {
            y(serializer, obj);
        } else if (obj == null) {
            e();
        } else {
            y(serializer, obj);
        }
    }

    void j(double d5);

    void k(short s3);

    void m(byte b3);

    void o(boolean z11);

    void p(float f5);

    void r(char c11);

    void s(g gVar, int i11);

    d u(g gVar);

    void y(c00.a aVar, Object obj);

    void z(int i11);
}
