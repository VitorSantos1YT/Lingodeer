package mi;

import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import ay.k0;
import com.android.billingclient.api.d;
import com.android.billingclient.api.e;
import com.android.billingclient.api.j;
import com.android.billingclient.api.r;
import com.lingo.lingoskill.LingoSkillApplication;
import fr.p3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;
import n9.q;
import rz.b1;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements DefaultLifecycleObserver, r, e {
    public static final p3 K = new p3(22);
    public static volatile c L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41155a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f41160f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData f41156b = new MutableLiveData();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f41157c = new MutableLiveData();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f41158d = new MutableLiveData();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData f41159e = new MutableLiveData(Boolean.FALSE);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f41161t = new AtomicBoolean(false);
    public final q H = new q(29, false);

    public c(LingoSkillApplication lingoSkillApplication) {
        this.f41155a = lingoSkillApplication;
    }

    public final void a() {
        this.H.f();
        try {
            if (e().r()) {
                e().b();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        L = null;
    }

    @Override // com.android.billingclient.api.e
    public final void b(j billingResult) {
        m.f(billingResult, "billingResult");
        this.f41161t.set(false);
        int i11 = billingResult.f7519a;
        m.e(billingResult.f7521c, "getDebugMessage(...)");
        MutableLiveData mutableLiveData = this.f41159e;
        if (i11 == 0) {
            this.f41157c.postValue(Boolean.TRUE);
            mutableLiveData.postValue(Boolean.FALSE);
        } else if (m.a(mutableLiveData.getValue(), Boolean.FALSE)) {
            mutableLiveData.postValue(Boolean.TRUE);
        }
    }

    @Override // com.android.billingclient.api.r
    public final void d(j billingResult, List list) {
        m.f(billingResult, "billingResult");
        int i11 = billingResult.f7519a;
        m.e(billingResult.f7521c, "getDebugMessage(...)");
        this.f41158d.setValue(Integer.valueOf(i11));
        if (i11 != 0) {
            return;
        }
        if (list == null) {
            f(null);
        } else {
            f(list);
        }
    }

    public final d e() {
        d dVar = this.f41160f;
        if (dVar != null) {
            return dVar;
        }
        m.n("billingClient");
        throw null;
    }

    public final void f(List list) {
        if (xt.b.f56283e) {
            return;
        }
        if (list != null) {
            list.size();
        }
        if (list == null) {
            this.f41156b.postValue(null);
        } else {
            e0.B(b1.f50869a, null, null, new b(list, this, (vy.d) null), 3);
        }
    }

    public final void g() {
        if (!e().r()) {
            AtomicBoolean atomicBoolean = this.f41161t;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            e().f(this);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final w wVar = new w();
        d dVarE = e();
        com.android.billingclient.api.b bVar = new com.android.billingclient.api.b();
        bVar.f7461a = "subs";
        final int i11 = 0;
        dVarE.e(bVar.b(), new com.android.billingclient.api.q() { // from class: mi.a
            @Override // com.android.billingclient.api.q
            public final void a(j billingResult, List purchaseList) {
                switch (i11) {
                    case 0:
                        m.f(billingResult, "billingResult");
                        m.f(purchaseList, "purchaseList");
                        ArrayList arrayList2 = arrayList;
                        arrayList2.addAll(purchaseList);
                        w wVar2 = wVar;
                        int i12 = wVar2.f38359a + 1;
                        wVar2.f38359a = i12;
                        if (i12 == 2) {
                            boolean zIsEmpty = arrayList2.isEmpty();
                            c cVar = this;
                            if (!zIsEmpty) {
                                cVar.f(arrayList2);
                            } else {
                                cVar.f(null);
                            }
                        }
                        break;
                    default:
                        m.f(billingResult, "billingResult");
                        m.f(purchaseList, "purchaseList");
                        ArrayList arrayList3 = arrayList;
                        arrayList3.addAll(purchaseList);
                        w wVar3 = wVar;
                        int i13 = wVar3.f38359a + 1;
                        wVar3.f38359a = i13;
                        if (i13 == 2) {
                            boolean zIsEmpty2 = arrayList3.isEmpty();
                            c cVar2 = this;
                            if (!zIsEmpty2) {
                                cVar2.f(arrayList3);
                            } else {
                                cVar2.f(null);
                            }
                        }
                        break;
                }
            }
        });
        d dVarE2 = e();
        com.android.billingclient.api.b bVar2 = new com.android.billingclient.api.b();
        bVar2.f7461a = "inapp";
        final int i12 = 1;
        dVarE2.e(bVar2.b(), new com.android.billingclient.api.q() { // from class: mi.a
            @Override // com.android.billingclient.api.q
            public final void a(j billingResult, List purchaseList) {
                switch (i12) {
                    case 0:
                        m.f(billingResult, "billingResult");
                        m.f(purchaseList, "purchaseList");
                        ArrayList arrayList2 = arrayList;
                        arrayList2.addAll(purchaseList);
                        w wVar2 = wVar;
                        int i13 = wVar2.f38359a + 1;
                        wVar2.f38359a = i13;
                        if (i13 == 2) {
                            boolean zIsEmpty = arrayList2.isEmpty();
                            c cVar = this;
                            if (!zIsEmpty) {
                                cVar.f(arrayList2);
                            } else {
                                cVar.f(null);
                            }
                        }
                        break;
                    default:
                        m.f(billingResult, "billingResult");
                        m.f(purchaseList, "purchaseList");
                        ArrayList arrayList3 = arrayList;
                        arrayList3.addAll(purchaseList);
                        w wVar3 = wVar;
                        int i14 = wVar3.f38359a + 1;
                        wVar3.f38359a = i14;
                        if (i14 == 2) {
                            boolean zIsEmpty2 = arrayList3.isEmpty();
                            c cVar2 = this;
                            if (!zIsEmpty2) {
                                cVar2.f(arrayList3);
                            } else {
                                cVar2.f(null);
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        m.f(owner, "owner");
        super.onCreate(owner);
        if (this.f41160f == null) {
            com.android.billingclient.api.c cVar = new com.android.billingclient.api.c(this.f41155a);
            cVar.f7468c = this;
            cVar.f7467b = new k0(6);
            this.f41160f = cVar.a();
        }
        if (e().r() || this.f41161t.get()) {
            return;
        }
        this.f41161t.set(true);
        e().f(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        m.f(owner, "owner");
        super.onDestroy(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        m.f(owner, "owner");
        super.onPause(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        m.f(owner, "owner");
        super.onResume(owner);
        if (e().r()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f41161t;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        e().f(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        m.f(owner, "owner");
        super.onStart(owner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        m.f(owner, "owner");
        super.onStop(owner);
    }

    @Override // com.android.billingclient.api.e
    public final void c() {
    }
}
