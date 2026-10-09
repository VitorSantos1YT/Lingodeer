package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzaeq<ResultT, CallbackT> implements zzafc<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9867a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FirebaseApp f9869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FirebaseUser f9870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzaex f9873g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zzahd f9875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zzagw f9876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zzagd f9877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zzahn f9878l;
    public AuthCredential m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zzaaa f9879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zzahe f9880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zzagz f9881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public zzahz f9882q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9883r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaes f9868b = new zzaes(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f9874h = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza extends LifecycleCallback {
        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public final void onStop() {
            throw null;
        }
    }

    public zzaeq(int i11) {
        this.f9867a = i11;
    }

    public static /* synthetic */ void c(zzaeq zzaeqVar) {
        zzaeqVar.g();
        Preconditions.i("no success or failure set on method implementation", zzaeqVar.f9883r);
    }

    public final void b(Status status) {
        this.f9883r = true;
        this.f9873g.a(null, status);
    }

    public final void d(FirebaseApp firebaseApp) {
        Preconditions.h(firebaseApp, "firebaseApp cannot be null");
        this.f9869c = firebaseApp;
    }

    public final void e(FirebaseUser firebaseUser) {
        Preconditions.h(firebaseUser, "firebaseUser cannot be null");
        this.f9870d = firebaseUser;
    }

    public final void f(Object obj) {
        Preconditions.h(obj, "external callback cannot be null");
        this.f9871e = obj;
    }

    public abstract void g();

    public final void h(Object obj) {
        this.f9883r = true;
        this.f9873g.a(obj, null);
    }
}
