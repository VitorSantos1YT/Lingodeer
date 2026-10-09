package ni;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import ay.k0;
import cf.x;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.c0;
import com.android.billingclient.api.n;
import com.android.billingclient.api.o;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dv.u0;
import fr.x4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import km.s0;
import kr.w;
import l.s;
import n9.q;
import ob.u;
import ry.r;
import rz.e0;
import rz.o0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.h1;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ViewModel {
    public final r0 S;
    public final com.android.billingclient.api.d U;
    public final AtomicBoolean V;
    public final AtomicBoolean W;
    public final q X;
    public final i1 Y;
    public final i1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f43831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f43832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f43833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ur.a f43834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f43835e = x0.c(r.f50854a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f43836f = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i1 f43837t = x0.c(1);
    public final i1 H = x0.c(null);
    public final i1 K = x0.c(null);
    public final i1 L = x0.c(null);
    public final i1 M = x0.c(null);
    public final i1 N = x0.c(null);
    public final i1 O = x0.c(null);
    public final i1 P = x0.c(i.f43811e);
    public final i1 Q = x0.c(new qy.l(0, 0));
    public final i1 R = x0.c(new qy.l(0, 0));
    public String T = BuildConfig.VERSION_NAME;

    public m(h1 h1Var, vt.c cVar, u0 u0Var, n0 n0Var, ur.a aVar) {
        this.f43831a = h1Var;
        this.f43832b = cVar;
        this.f43833c = u0Var;
        this.f43834d = aVar;
        vy.d dVar = null;
        this.S = x0.A(((x4) h1Var).f27974g, ViewModelKt.getViewModelScope(this), a1.a(2), Boolean.FALSE);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.V = atomicBoolean;
        this.W = new AtomicBoolean(false);
        this.X = new q(29, false);
        String strF = FirebaseRemoteConfig.d().f("android_up_billing_model");
        if (!LingoSkillApplication.f21666c.equals("default") && oz.q.v0("release", "debug", false)) {
            strF = LingoSkillApplication.f21666c;
        }
        strF.equals("S_D_1");
        i1 i1VarC = x0.c(c.f43806a);
        this.Y = i1VarC;
        this.Z = i1VarC;
        if (this.U == null) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            kotlin.jvm.internal.m.c(lingoSkillApplication);
            com.android.billingclient.api.c cVar2 = new com.android.billingclient.api.c(lingoSkillApplication);
            cVar2.f7468c = new a(this);
            cVar2.f7467b = new k0(6);
            this.U = cVar2.a();
        }
        com.android.billingclient.api.d dVar2 = this.U;
        if (dVar2 == null) {
            kotlin.jvm.internal.m.n("billingClient");
            throw null;
        }
        if (!dVar2.r() && !atomicBoolean.get()) {
            atomicBoolean.set(true);
            com.android.billingclient.api.d dVar3 = this.U;
            if (dVar3 == null) {
                kotlin.jvm.internal.m.n("billingClient");
                throw null;
            }
            dVar3.f(new s(this, 3));
        }
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new b(this, dVar, 0), 3);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new s0(this, dVar, 9), 3);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x013e A[PHI: r21
      0x013e: PHI (r21v2 java.lang.CharSequence) = (r21v7 java.lang.CharSequence), (r21v1 java.lang.CharSequence), (r21v11 java.lang.CharSequence) binds: [B:38:0x00ae, B:51:0x0103, B:18:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.android.billingclient.api.c0] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    public final void a(Activity activity, o productDetails, String source) {
        String str;
        CharSequence charSequence;
        Object obj;
        ?? r9;
        ?? r21;
        u uVar;
        com.android.billingclient.api.h hVarE;
        CharSequence charSequence2;
        Object obj2;
        n nVar;
        kotlin.jvm.internal.m.f(activity, "activity");
        kotlin.jvm.internal.m.f(productDetails, "productDetails");
        String str2 = productDetails.f7564c;
        kotlin.jvm.internal.m.f(source, "source");
        this.T = source;
        ArrayList arrayList = productDetails.f7569h;
        String str3 = BuildConfig.VERSION_NAME;
        if (arrayList == null || (nVar = (n) ry.m.q0(arrayList)) == null || (str = nVar.f7560a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        kotlin.jvm.internal.m.e(str2, "getProductId(...)");
        boolean z11 = false;
        boolean zV0 = oz.q.v0(str2, "premiumplus_year", false);
        ArrayList arrayList2 = this.f43836f;
        if (zV0) {
            int size = arrayList2.size();
            int i11 = 0;
            do {
                if (i11 >= size) {
                    charSequence2 = null;
                    obj2 = null;
                    break;
                } else {
                    obj2 = arrayList2.get(i11);
                    i11++;
                    charSequence2 = null;
                }
            } while (kotlin.jvm.internal.m.a(((Purchase) obj2).b().get(0), str2));
            Purchase purchase = (Purchase) obj2;
            charSequence = charSequence2;
            if (purchase != null) {
                String strA = purchase.a();
                boolean z12 = (TextUtils.isEmpty(strA) && TextUtils.isEmpty(charSequence2)) ? false : true;
                boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
                if (z12 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!z12 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c0 c0Var = new c0((char) 0, 2);
                c0Var.f7471c = strA;
                c0Var.f7470b = 5;
                r9 = c0Var;
                r21 = charSequence2;
            } else {
                r9 = charSequence;
                r21 = charSequence;
            }
        } else {
            charSequence = null;
            r21 = 0;
            charSequence = null;
            if (oz.q.v0(str2, "premiumplus_month", false)) {
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i12);
                    i12++;
                    Purchase purchase2 = (Purchase) obj;
                    if (!kotlin.jvm.internal.m.a(purchase2.b().get(0), str2)) {
                        Object obj3 = purchase2.b().get(0);
                        kotlin.jvm.internal.m.e(obj3, "get(...)");
                        if (oz.q.v0((CharSequence) obj3, "_1_", false)) {
                            break;
                        }
                        Object obj4 = purchase2.b().get(0);
                        kotlin.jvm.internal.m.e(obj4, "get(...)");
                        if (oz.q.v0((CharSequence) obj4, "premium_month", false)) {
                            break;
                        }
                    }
                }
                Purchase purchase3 = (Purchase) obj;
                if (purchase3 != null) {
                    String strA2 = purchase3.a();
                    boolean z13 = (TextUtils.isEmpty(strA2) && TextUtils.isEmpty(null)) ? false : true;
                    boolean zIsEmpty2 = TextUtils.isEmpty(null);
                    if (z13 && !zIsEmpty2) {
                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    }
                    if (!z13 && zIsEmpty2) {
                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    }
                    c0 c0Var2 = new c0((char) 0, 2);
                    c0Var2.f7471c = strA2;
                    c0Var2.f7470b = 5;
                    r9 = c0Var2;
                } else {
                    r9 = charSequence;
                    r21 = charSequence;
                }
            } else {
                r9 = charSequence;
                r21 = charSequence;
            }
        }
        int i13 = 3;
        if (kotlin.jvm.internal.m.a(productDetails.f7565d, "subs")) {
            uVar = new u(i13, z11);
            uVar.F(productDetails);
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            uVar.f44892c = str;
        } else {
            uVar = new u(i13, z11);
            uVar.F(productDetails);
        }
        if (((o) uVar.f44891b) == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        List listK = ns.o.K(new com.android.billingclient.api.f(uVar));
        if (r9 != 0) {
            ob.i iVar = new ob.i(3);
            com.android.billingclient.api.g gVar = new com.android.billingclient.api.g();
            gVar.f7506b = 0;
            gVar.f7505a = true;
            iVar.f44816e = gVar;
            iVar.f44815d = new ArrayList(listK);
            com.android.billingclient.api.g gVar2 = new com.android.billingclient.api.g();
            gVar2.f7507c = (String) r9.f7471c;
            gVar2.f7506b = r9.f7470b;
            iVar.f44816e = gVar2;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            iVar.f44813b = x.n().globalUID;
            String str4 = x.n().uid;
            if (str4 != null) {
                str3 = str4;
            }
            iVar.f44814c = str3;
            hVarE = iVar.e();
        } else {
            ob.i iVar2 = new ob.i(3);
            com.android.billingclient.api.g gVar3 = new com.android.billingclient.api.g();
            gVar3.f7506b = 0;
            gVar3.f7505a = true;
            iVar2.f44816e = gVar3;
            iVar2.f44815d = new ArrayList(listK);
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            iVar2.f44813b = x.n().globalUID;
            String str5 = x.n().uid;
            if (str5 != null) {
                str3 = str5;
            }
            iVar2.f44814c = str3;
            hVarE = iVar2.e();
        }
        this.W.set(true);
        com.android.billingclient.api.d dVar = this.U;
        if (dVar == null) {
            kotlin.jvm.internal.m.n("billingClient");
            throw r21;
        }
        dVar.r();
        com.android.billingclient.api.j jVarC = dVar.c(activity, hVarE);
        kotlin.jvm.internal.m.e(jVarC, "launchBillingFlow(...)");
        kotlin.jvm.internal.m.e(jVarC.f7521c, "getDebugMessage(...)");
    }

    public final void b(List list) {
        if (list != null) {
            list.size();
        }
        i1 i1Var = this.f43835e;
        if (list != null) {
            i1Var.getClass();
            i1Var.l(null, list);
        } else {
            i1Var.getClass();
            i1Var.l(null, r.f50854a);
        }
    }

    public final Object c(String str, List list, xy.i iVar) {
        yz.f fVar = o0.f50940a;
        return e0.M(yz.e.f58387a, new w(23, list, this, str, (vy.d) null), iVar);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.X.f();
        com.android.billingclient.api.d dVar = this.U;
        if (dVar == null) {
            kotlin.jvm.internal.m.n("billingClient");
            throw null;
        }
        if (dVar.r()) {
            dVar.b();
        }
    }
}
