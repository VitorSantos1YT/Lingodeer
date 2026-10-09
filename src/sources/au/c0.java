package au;

import android.graphics.Path;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2963d;

    public /* synthetic */ c0(g2.k kVar, int i11, int i12) {
        this.f2960a = 2;
        this.f2963d = kVar;
        this.f2961b = i11;
        this.f2962c = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        switch (this.f2960a) {
            case 0:
                int i11 = this.f2961b;
                int i12 = this.f2962c;
                String str = (String) this.f2963d;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("\n        UPDATE daily_learn_history\n        SET amount = ?,\n            base_xp = ?\n        WHERE id = ?\n        ");
                try {
                    cVarB1.g(1, i11);
                    cVarB1.g(2, i12);
                    cVarB1.b0(3, str);
                    cVarB1.r1();
                } finally {
                    cVarB1.close();
                }
                break;
            case 1:
                int i13 = this.f2961b;
                int i14 = this.f2962c;
                String str2 = (String) this.f2963d;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1("\n        UPDATE daily_learn_time_history\n        SET seconds = ?,\n            base_time = ?\n        WHERE id = ?\n        ");
                try {
                    cVarB2.g(1, i13);
                    cVarB2.g(2, i14);
                    cVarB2.b0(3, str2);
                    cVarB2.r1();
                } finally {
                    cVarB2.close();
                }
                break;
            default:
                g2.k kVar = (g2.k) this.f2963d;
                j3.z zVar = (j3.z) obj;
                j3.b bVar = zVar.f35830a;
                int iD = zVar.d(this.f2961b);
                int iD2 = zVar.d(this.f2962c);
                CharSequence charSequence = bVar.f35665e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    StringBuilder sbK = w4.c.k("start(", iD, ") or end(", iD2, ") is out of range [0..");
                    sbK.append(charSequence.length());
                    sbK.append("], or start > end!");
                    p3.a.a(sbK.toString());
                }
                Path path = new Path();
                k3.r rVar = bVar.f35664d;
                rVar.f37894f.getSelectionPath(iD, iD2, path);
                int i15 = rVar.f37896h;
                if (i15 != 0 && !path.isEmpty()) {
                    path.offset(CropImageView.DEFAULT_ASPECT_RATIO, i15);
                }
                g2.k kVar2 = new g2.k(path);
                kVar2.m((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(zVar.f35835f)) & 4294967295L));
                g2.p0.b(kVar, kVar2);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ c0(String str, int i11, int i12, int i13) {
        this.f2960a = i13;
        this.f2961b = i11;
        this.f2962c = i12;
        this.f2963d = str;
    }
}
