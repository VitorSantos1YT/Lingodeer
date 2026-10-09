package xg;

import android.os.Bundle;
import androidx.fragment.app.p0;
import fr.o0;
import kotlin.jvm.internal.m;
import l1.c3;
import l1.n;
import l1.s;
import l1.t;
import l1.w1;
import qy.b0;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f56077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f56078c;

    public /* synthetic */ g(i iVar, Bundle bundle, int i11) {
        this.f56076a = i11;
        this.f56077b = iVar;
        this.f56078c = bundle;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f56076a;
        n nVar = (n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ju.f.a(false, t1.e.d(-786647631, new g(this.f56077b, this.f56078c, 1), sVar), sVar, 48);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                s sVar2 = (s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3 c3Var = ju.f.f37369c;
                    i iVar = this.f56077b;
                    p0 p0VarRequireActivity = iVar.requireActivity();
                    m.e(p0VarRequireActivity, tcppUUQxZjFdy.DMgqyEGlzRVjVN);
                    t.b(new w1[]{c3Var.a(p0VarRequireActivity), ju.f.f37370d.a(Integer.valueOf(((o0) iVar.r()).f27733a.keyLanguage)), ju.f.f37371e.a(Integer.valueOf(((o0) iVar.r()).f27733a.locateLanguage))}, t1.e.d(1298651377, new g(iVar, this.f56078c, 2), sVar2), sVar2, 56);
                } else {
                    sVar2.W();
                }
                break;
            default:
                s sVar3 = (s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((Number) sVar3.j(ju.f.f37370d)).intValue();
                    this.f56077b.q(this.f56078c, sVar3, 0);
                } else {
                    sVar3.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
