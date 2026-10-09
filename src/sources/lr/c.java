package lr;

import android.content.res.Resources;
import com.lingodeer.R;
import fr.j3;
import fz.e;
import g2.f0;
import h1.k7;
import h1.ua;
import j0.e2;
import j3.y0;
import kotlin.jvm.internal.m;
import l1.n;
import l1.s;
import l1.t;
import qy.b0;
import r0.f;
import z1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Resources f40233b;

    public /* synthetic */ c(int i11, int i12, Resources resources) {
        this.f40232a = i12;
        this.f40233b = resources;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40232a) {
            case 0:
                ((Integer) obj2).getClass();
                a.b(this.f40233b, (n) obj, t.M(1));
                break;
            case 1:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String string = this.f40233b.getString(R.string.sign_up);
                    m.e(string, "getString(...)");
                    ua.b(string, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 2:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k7.d(e2.e(o.f58481a, 1.0f), f.d(16), null, null, null, t1.e.d(-972317383, new uu.c(this.f40233b, 1), sVar2), sVar2, 196614, 28);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                uu.a.d(this.f40233b, (n) obj, t.M(1));
                break;
            case 4:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String string2 = this.f40233b.getString(R.string.login);
                    m.e(string2, "getString(...)");
                    ua.b(string2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131070);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            case 5:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String string3 = this.f40233b.getString(R.string.password);
                    m.e(string3, "getString(...)");
                    ua.b(string3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), f0.e(4289506488L), j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar4, 0, 0, 65534);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            case 6:
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                s sVar5 = (s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String string4 = this.f40233b.getString(R.string.email);
                    m.e(string4, "getString(...)");
                    ua.b(string4, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), f0.e(4289506488L), j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar5, 0, 0, 65534);
                } else {
                    sVar5.W();
                }
                return b0.f48488a;
            default:
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                s sVar6 = (s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String string5 = this.f40233b.getString(R.string.sign_in_sign_up);
                    m.e(string5, "getString(...)");
                    ua.b(string5, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 0, 0, 131070);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
        }
        return b0.f48488a;
    }

    public /* synthetic */ c(Resources resources, int i11) {
        this.f40232a = i11;
        this.f40233b = resources;
    }
}
