package fu;

import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.x0;
import dt.h2;
import f0.l1;
import f0.s2;
import f0.t2;
import l1.b1;
import s0.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28116a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28120e;

    public j(String str, ClipboardManager clipboardManager, Context context, String str2) {
        this.f28117b = str;
        this.f28118c = clipboardManager;
        this.f28119d = context;
        this.f28120e = str2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s2.w wVar, vy.d dVar) {
        int i11 = this.f28116a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj = this.f28120e;
        Object obj2 = this.f28119d;
        Object obj3 = this.f28118c;
        Object obj4 = this.f28117b;
        switch (i11) {
            case 0:
                b1 b1Var = (b1) obj4;
                h2 h2Var = new h2(10, b1Var);
                bp.t tVar = new bp.t(obj2, (qy.e) obj, (Object) b1Var, (b1) obj3, 8);
                dv.e eVar = new dv.e(17);
                cr.m mVar = new cr.m(29);
                float f5 = f0.g0.f26277a;
                Object objC = t2.c(wVar, new f0.c0(eVar, tVar, h2Var, mVar, null, 0), dVar);
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                if (objC != aVar) {
                    objC = b0Var;
                }
                return objC == aVar ? objC : b0Var;
            case 1:
                h1 h1Var = new h1((rz.b0) obj2, (b1) obj4, (h0.i) obj, null);
                mt.p pVar = new mt.p(20, (b1) obj3);
                ad.a0 a0Var = s2.f26428a;
                Object objL = rz.e0.l(new x0(wVar, h1Var, pVar, new l1(wVar), (vy.d) null), dVar);
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                if (objL != aVar2) {
                    objL = b0Var;
                }
                return objL == aVar2 ? objL : b0Var;
            default:
                Object objD = s2.d(wVar, new xu.q((String) obj4, (ClipboardManager) obj3, (Context) obj2, (String) obj), null, null, dVar, 13);
                return objD == wy.a.COROUTINE_SUSPENDED ? objD : b0Var;
        }
    }

    public j(b1 b1Var, fz.a aVar, fz.a aVar2, b1 b1Var2) {
        this.f28117b = b1Var;
        this.f28119d = aVar;
        this.f28120e = aVar2;
        this.f28118c = b1Var2;
    }

    public j(rz.b0 b0Var, b1 b1Var, h0.i iVar, b1 b1Var2) {
        this.f28119d = b0Var;
        this.f28117b = b1Var;
        this.f28120e = iVar;
        this.f28118c = b1Var2;
    }
}
