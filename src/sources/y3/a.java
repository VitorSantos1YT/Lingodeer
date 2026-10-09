package y3;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.List;
import qp.o2;
import w2.a0;
import y2.v;
import z4.g1;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.datastore.preferences.protobuf.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f57051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewFactoryHolder viewFactoryHolder) {
        super(1);
        this.f57051c = viewFactoryHolder;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final v1 g(v1 v1Var, List list) {
        int i11 = AndroidViewHolder.f1215f0;
        return this.f57051c.n(v1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final o2 h(g1 g1Var, o2 o2Var) {
        v vVar = (v) this.f57051c.f1225e0.f56892i0.f50086d;
        if (vVar.f57011t0.P) {
            long jB = ew.a.B(vVar.P(0L));
            int i11 = (int) (jB >> 32);
            if (i11 < 0) {
                i11 = 0;
            }
            int i12 = (int) (jB & 4294967295L);
            if (i12 < 0) {
                i12 = 0;
            }
            long jM = a0.h(vVar).m();
            int i13 = (int) (jM >> 32);
            int i14 = (int) (jM & 4294967295L);
            long j11 = vVar.f54503c;
            long jB2 = ew.a.B(vVar.P((((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L)));
            int i15 = i13 - ((int) (jB2 >> 32));
            if (i15 < 0) {
                i15 = 0;
            }
            int i16 = i14 - ((int) (4294967295L & jB2));
            int i17 = i16 >= 0 ? i16 : 0;
            if (i11 != 0 || i12 != 0 || i15 != 0 || i17 != 0) {
                return new o2(11, AndroidViewHolder.m((r4.d) o2Var.f48095b, i11, i12, i15, i17), AndroidViewHolder.m((r4.d) o2Var.f48096c, i11, i12, i15, i17));
            }
        }
        return o2Var;
    }
}
