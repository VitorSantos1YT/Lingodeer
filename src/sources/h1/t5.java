package h1;

import android.net.ConnectivityManager;
import androidx.compose.ui.platform.AbstractComposeView;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(Object obj, Object obj2, Object obj3, int i11) {
        super(0);
        this.f31104a = i11;
        this.f31105b = obj;
        this.f31106c = obj2;
        this.f31107d = obj3;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = 3;
        vy.d dVar = null;
        switch (this.f31104a) {
            case 0:
                e8 e8Var = (e8) this.f31105b;
                if (((Boolean) ((fz.c) e8Var.f30211b.f44878d).invoke(f8.Hidden)).booleanValue()) {
                    rz.e0.B((rz.b0) this.f31106c, null, null, new o5(e8Var, dVar, i11), 3).invokeOnCompletion(new s5(e8Var, (fz.a) this.f31107d, 0));
                }
                return qy.b0.f48488a;
            case 1:
                if (((Boolean) ((fz.c) ((e8) this.f31105b).f30211b.f44878d).invoke(f8.Expanded)).booleanValue()) {
                    rz.e0.B((rz.b0) this.f31106c, null, null, new o5((e8) this.f31107d, dVar, 4), 3);
                }
                return Boolean.TRUE;
            case 2:
                if (((kotlin.jvm.internal.u) this.f31105b).f38357a) {
                    fb.l lVarB = fb.l.b();
                    int i12 = kb.k.f38047a;
                    lVarB.getClass();
                    ((ConnectivityManager) this.f31106c).unregisterNetworkCallback((fc.g) this.f31107d);
                }
                return qy.b0.f48488a;
            case 3:
                Object obj = kb.i.f38042b;
                a0.e eVar = (a0.e) this.f31105b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f31106c;
                kb.i iVar = (kb.i) this.f31107d;
                synchronized (obj) {
                    LinkedHashMap linkedHashMap = kb.i.f38043c;
                    linkedHashMap.remove(eVar);
                    if (linkedHashMap.isEmpty()) {
                        fb.l lVarB2 = fb.l.b();
                        int i13 = kb.k.f38047a;
                        lVarB2.getClass();
                        connectivityManager.unregisterNetworkCallback(iVar);
                        kb.i.f38041a.getClass();
                        kb.i.f38044d = null;
                        kb.i.f38045e = false;
                    }
                    break;
                }
                return qy.b0.f48488a;
            default:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.f31105b;
                abstractComposeView.removeOnAttachStateChangeListener((z2.l2) this.f31106c);
                z2.m2 listener = (z2.m2) this.f31107d;
                kotlin.jvm.internal.m.f(listener, "listener");
                android.support.v4.media.session.a.u(abstractComposeView).f36060a.remove(listener);
                return qy.b0.f48488a;
        }
    }
}
