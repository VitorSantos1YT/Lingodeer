package vt;

import android.content.Context;
import qp.n2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f54212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cu.g f54213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qy.q f54214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qy.q f54215e;

    public d0(Context context, n0 n0Var, cu.g gVar) {
        this.f54211a = context;
        this.f54212b = n0Var;
        this.f54213c = gVar;
        final int i11 = 0;
        this.f54214d = com.bumptech.glide.d.v(new fz.a(this) { // from class: vt.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f54301b;

            {
                this.f54301b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return this.f54301b.a(new b0("cn_char_stroke.db", "cn_char_stroke_v4.zip"));
                    default:
                        return this.f54301b.a(new b0("jp_char_stroke.db", "jp_char_stroke_debug_v3.zip"));
                }
            }
        });
        final int i12 = 1;
        this.f54215e = com.bumptech.glide.d.v(new fz.a(this) { // from class: vt.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f54301b;

            {
                this.f54301b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return this.f54301b.a(new b0("cn_char_stroke.db", "cn_char_stroke_v4.zip"));
                    default:
                        return this.f54301b.a(new b0("jp_char_stroke.db", "jp_char_stroke_debug_v3.zip"));
                }
            }
        });
    }

    public final cu.t a(b0 b0Var) {
        return new cu.t(this.f54211a, new cu.h(b0Var.f54179a, b0Var.f54180b, new a0(this, b0Var)), this.f54213c, new a0(b0Var), new n2(23, this, b0Var), new ds.e(2, 10, null), "CharacterStrokeRepositoryImpl");
    }

    public final Object b(int i11, ry.r rVar, fz.e eVar, xy.i iVar) {
        cu.t tVar = ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i11)) ? (cu.t) this.f54214d.getValue() : (cu.t) this.f54215e.getValue();
        tVar.getClass();
        yz.f fVar = rz.o0.f50940a;
        return rz.e0.M(yz.e.f58387a, new b0.f(tVar, rVar, eVar, (vy.d) null), iVar);
    }
}
