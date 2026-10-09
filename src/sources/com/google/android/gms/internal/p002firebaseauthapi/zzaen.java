package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.zzad;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaen extends zzafb implements zzafv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaeh f9860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaeg f9861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzafk f9862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzaek f9863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FirebaseApp f9864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzaem f9866g;

    public zzaen(FirebaseApp firebaseApp, zzaek zzaekVar) {
        zzafw zzafwVar;
        zzafw zzafwVar2;
        this.f9864e = firebaseApp;
        firebaseApp.b();
        String str = firebaseApp.f17716c.f17731a;
        this.f9865f = str;
        firebaseApp.b();
        firebaseApp.f17716c.getClass();
        this.f9863d = zzaekVar;
        this.f9862c = null;
        this.f9860a = null;
        this.f9861b = null;
        String strA = zzafu.a("firebear.secureToken");
        if (TextUtils.isEmpty(strA)) {
            e eVar = zzaft.f9913a;
            synchronized (eVar) {
                zzafwVar2 = (zzafw) eVar.get(str);
            }
            if (zzafwVar2 != null) {
                throw null;
            }
            strA = "https://securetoken.googleapis.com/v1";
        }
        if (this.f9862c == null) {
            this.f9862c = new zzafk(strA, g());
        }
        String strA2 = zzafu.a("firebear.identityToolkit");
        if (TextUtils.isEmpty(strA2)) {
            zzaft.b(str);
            strA2 = "https://www.googleapis.com/identitytoolkit/v3/relyingparty";
        }
        if (this.f9860a == null) {
            this.f9860a = new zzaeh(strA2, g());
        }
        String strA3 = zzafu.a("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strA3)) {
            e eVar2 = zzaft.f9913a;
            synchronized (eVar2) {
                zzafwVar = (zzafw) eVar2.get(str);
            }
            if (zzafwVar != null) {
                throw null;
            }
            strA3 = "https://identitytoolkit.googleapis.com/v2";
        }
        if (this.f9861b == null) {
            this.f9861b = new zzaeg(strA3, g());
        }
        ((zzad) firebaseApp.c(zzad.class)).getClass();
        e eVar3 = zzaft.f9914b;
        synchronized (eVar3) {
            try {
                if (eVar3.containsKey(str)) {
                    ((List) eVar3.get(str)).add(new WeakReference(this));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(this));
                    eVar3.put(str, arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(zzagr zzagrVar, zzafd zzafdVar) {
        String str = this.f9865f;
        zzafk zzafkVar = this.f9862c;
        zzafg.a(zzafkVar.a("/token", str), zzagrVar, zzafdVar, new zzahd(), zzafkVar.f9852b);
    }

    public final void b(zzagu zzaguVar, zzafd zzafdVar) {
        String str = this.f9865f;
        zzaeh zzaehVar = this.f9860a;
        zzafg.a(zzaehVar.a("/getAccountInfo", str), zzaguVar, zzafdVar, new zzagt(), zzaehVar.f9852b);
    }

    public final void c(zzaht zzahtVar, zzafd zzafdVar) {
        String str = this.f9865f;
        zzaeh zzaehVar = this.f9860a;
        zzafg.a(zzaehVar.a("/setAccountInfo", str), zzahtVar, zzafdVar, new zzahw(), zzaehVar.f9852b);
    }

    public final void d(zzahy zzahyVar, zzafd zzafdVar) {
        String str = this.f9865f;
        zzaeh zzaehVar = this.f9860a;
        zzafg.a(zzaehVar.a("/signupNewUser", str), zzahyVar, zzafdVar, new zzahx(), zzaehVar.f9852b);
    }

    public final void e(zzaij zzaijVar, zzafd zzafdVar) {
        Preconditions.g(zzaijVar);
        String str = this.f9865f;
        zzaeh zzaehVar = this.f9860a;
        zzafg.a(zzaehVar.a("/verifyAssertion", str), zzaijVar, zzafdVar, new zzail(), zzaehVar.f9852b);
    }

    public final void f(zzais zzaisVar, zzafd zzafdVar) {
        Preconditions.g(zzaisVar);
        String str = this.f9865f;
        zzaeh zzaehVar = this.f9860a;
        zzafg.a(zzaehVar.a("/verifyPhoneNumber", str), zzaisVar, zzafdVar, new zzair(), zzaehVar.f9852b);
    }

    public final zzaem g() {
        if (this.f9866g == null) {
            String strB = this.f9863d.b();
            FirebaseApp firebaseApp = this.f9864e;
            firebaseApp.b();
            this.f9866g = new zzaem(firebaseApp.f17714a, firebaseApp, strB);
        }
        return this.f9866g;
    }
}
