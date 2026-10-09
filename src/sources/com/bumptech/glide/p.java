package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import ay.k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ComponentCallbacks2, ie.i {
    public static final le.g M;
    public final ie.b H;
    public final CopyOnWriteArrayList K;
    public final le.g L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f7693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ie.g f7695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ie.o f7696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ie.m f7697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ie.p f7698f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final aj.i f7699t;

    static {
        le.g gVar = (le.g) new le.g().d(Bitmap.class);
        gVar.O = true;
        M = gVar;
        ((le.g) new le.g().d(ge.d.class)).O = true;
    }

    public p(c cVar, ie.g gVar, ie.m mVar, Context context) {
        le.g gVar2;
        ie.o oVar = new ie.o(4);
        k0 k0Var = cVar.f7612t;
        this.f7698f = new ie.p();
        aj.i iVar = new aj.i(this, 2);
        this.f7699t = iVar;
        this.f7693a = cVar;
        this.f7695c = gVar;
        this.f7697e = mVar;
        this.f7696d = oVar;
        this.f7694b = context;
        Context applicationContext = context.getApplicationContext();
        o oVar2 = new o(this, oVar);
        k0Var.getClass();
        ie.b cVar2 = o4.c.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new ie.c(applicationContext, oVar2) : new ie.k();
        this.H = cVar2;
        synchronized (cVar.H) {
            if (cVar.H.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cVar.H.add(this);
        }
        char[] cArr = pe.m.f46830a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            gVar.j(this);
        } else {
            pe.m.f().post(iVar);
        }
        gVar.j(cVar2);
        this.K = new CopyOnWriteArrayList(cVar.f7609d.f7633e);
        i iVar2 = cVar.f7609d;
        synchronized (iVar2) {
            try {
                if (iVar2.f7638j == null) {
                    le.g gVarBuild = iVar2.f7632d.build();
                    gVarBuild.O = true;
                    iVar2.f7638j = gVarBuild;
                }
                gVar2 = iVar2.f7638j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this) {
            le.g gVar3 = (le.g) gVar2.clone();
            if (gVar3.O && !gVar3.P) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            gVar3.P = true;
            gVar3.O = true;
            this.L = gVar3;
        }
    }

    @Override // ie.i
    public final synchronized void a() {
        this.f7698f.a();
        l();
    }

    public final void j(me.d dVar) {
        if (dVar == null) {
            return;
        }
        boolean zN = n(dVar);
        le.c cVarG = dVar.g();
        if (zN) {
            return;
        }
        c cVar = this.f7693a;
        synchronized (cVar.H) {
            try {
                ArrayList arrayList = cVar.H;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if (((p) obj).n(dVar)) {
                        return;
                    }
                }
                if (cVarG != null) {
                    dVar.i(null);
                    cVarG.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final n k(String str) {
        return new n(this.f7693a, this, Drawable.class, this.f7694b).z(str);
    }

    public final synchronized void l() {
        ie.o oVar = this.f7696d;
        oVar.f34405b = true;
        ArrayList arrayListE = pe.m.e((Set) oVar.f34406c);
        int size = arrayListE.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            le.c cVar = (le.c) obj;
            if (cVar.isRunning()) {
                cVar.e();
                ((HashSet) oVar.f34407d).add(cVar);
            }
        }
    }

    public final synchronized void m() {
        ie.o oVar = this.f7696d;
        int i11 = 0;
        oVar.f34405b = false;
        ArrayList arrayListE = pe.m.e((Set) oVar.f34406c);
        int size = arrayListE.size();
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            le.c cVar = (le.c) obj;
            if (!cVar.b() && !cVar.isRunning()) {
                cVar.j();
            }
        }
        ((HashSet) oVar.f34407d).clear();
    }

    public final synchronized boolean n(me.d dVar) {
        le.c cVarG = dVar.g();
        if (cVarG == null) {
            return true;
        }
        if (!this.f7696d.c(cVarG)) {
            return false;
        }
        this.f7698f.f34408a.remove(dVar);
        dVar.i(null);
        return true;
    }

    @Override // ie.i
    public final synchronized void onDestroy() {
        int i11;
        this.f7698f.onDestroy();
        synchronized (this) {
            try {
                ArrayList arrayListE = pe.m.e(this.f7698f.f34408a);
                int size = arrayListE.size();
                i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayListE.get(i12);
                    i12++;
                    j((me.d) obj);
                }
                this.f7698f.f34408a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ie.o oVar = this.f7696d;
        ArrayList arrayListE2 = pe.m.e((Set) oVar.f34406c);
        int size2 = arrayListE2.size();
        while (i11 < size2) {
            Object obj2 = arrayListE2.get(i11);
            i11++;
            oVar.c((le.c) obj2);
        }
        ((HashSet) oVar.f34407d).clear();
        this.f7695c.c(this);
        this.f7695c.c(this.H);
        pe.m.f().removeCallbacks(this.f7699t);
        c cVar = this.f7693a;
        synchronized (cVar.H) {
            if (!cVar.H.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            cVar.H.remove(this);
        }
    }

    @Override // ie.i
    public final synchronized void onStart() {
        m();
        this.f7698f.onStart();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f7696d + ", treeNode=" + this.f7697e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
    }
}
