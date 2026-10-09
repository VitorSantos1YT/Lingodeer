package xu;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import rt.dd;
import rt.ja;
import rt.ka;
import rt.mb;
import rt.tf;
import ys.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56507e;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, l1.b1 b1Var, int i11) {
        this.f56503a = i11;
        this.f56504b = obj;
        this.f56505c = obj2;
        this.f56506d = obj3;
        this.f56507e = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        ja jaVar;
        ja jaVar2;
        switch (this.f56503a) {
            case 0:
                String str = (String) this.f56504b;
                ClipboardManager clipboardManager = (ClipboardManager) this.f56506d;
                Context context = (Context) this.f56507e;
                String str2 = (String) this.f56505c;
                if (!oz.q.K0(str)) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("uid", str));
                    Toast.makeText(context, str2, 0).show();
                }
                return qy.b0.f48488a;
            case 1:
                mb mbVar = (mb) this.f56504b;
                l1.b1 b1Var = (l1.b1) this.f56505c;
                l1.b1 b1Var2 = (l1.b1) this.f56506d;
                l1.b1 b1Var3 = (l1.b1) this.f56507e;
                ht.o params = (ht.o) obj;
                kotlin.jvm.internal.m.f(params, "params");
                ja jaVarG = mbVar.g(params);
                boolean z11 = false;
                if (jaVarG != null && ((ka) mbVar.i(params).getValue()).f49982b) {
                    z11 = true;
                }
                if (jaVarG == null || z11) {
                    ja jaVarJ = mbVar.j(params);
                    if (jaVarJ != null) {
                        mbVar.G(jaVarJ);
                    }
                } else {
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        ja jaVar3 = (ja) b1Var2.getValue();
                        if (!kotlin.jvm.internal.m.a(jaVar3 != null ? jaVar3.f49927a : null, jaVarG.f49927a) && (jaVar = (ja) b1Var2.getValue()) != null) {
                            mbVar.c(jaVar, "__default_bookmark_folder__");
                        }
                    }
                    b1Var3.setValue(jaVarG);
                }
                return qy.b0.f48488a;
            case 2:
                dd ddVar = (dd) this.f56504b;
                l1.b1 b1Var4 = (l1.b1) this.f56505c;
                l1.b1 b1Var5 = (l1.b1) this.f56506d;
                l1.b1 b1Var6 = (l1.b1) this.f56507e;
                ht.o params2 = (ht.o) obj;
                kotlin.jvm.internal.m.f(params2, "params");
                ja jaVarG2 = ddVar.g(params2);
                boolean z12 = false;
                if (jaVarG2 != null && ((ka) ddVar.i(params2).getValue()).f49982b) {
                    z12 = true;
                }
                if (jaVarG2 == null || z12) {
                    ja jaVarJ2 = ddVar.j(params2);
                    if (jaVarJ2 != null) {
                        ddVar.G(jaVarJ2);
                    }
                } else {
                    if (((Boolean) b1Var4.getValue()).booleanValue()) {
                        ja jaVar4 = (ja) b1Var5.getValue();
                        if (!kotlin.jvm.internal.m.a(jaVar4 != null ? jaVar4.f49927a : null, jaVarG2.f49927a) && (jaVar2 = (ja) b1Var5.getValue()) != null) {
                            ddVar.c(jaVar2, "__default_bookmark_folder__");
                        }
                    }
                    b1Var6.setValue(jaVarG2);
                }
                return qy.b0.f48488a;
            default:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f56504b;
                tf tfVar = (tf) this.f56505c;
                fz.c cVar = (fz.c) this.f56506d;
                l1.i1 i1Var = (l1.i1) this.f56507e;
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                androidx.lifecycle.compose.e eVar = new androidx.lifecycle.compose.e(tfVar, cVar, i1Var);
                if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                    i1Var.n(System.currentTimeMillis());
                }
                lifecycleOwner.getLifecycle().addObserver(eVar);
                return new m3(tfVar, cVar, lifecycleOwner, eVar, i1Var);
        }
    }

    public /* synthetic */ q(String str, ClipboardManager clipboardManager, Context context, String str2) {
        this.f56503a = 0;
        this.f56504b = str;
        this.f56506d = clipboardManager;
        this.f56507e = context;
        this.f56505c = str2;
    }
}
