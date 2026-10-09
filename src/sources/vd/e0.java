package vd;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements g, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f53873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f53874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f53875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile d f53876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f53877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile zd.p f53878f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile e f53879t;

    public e0(h hVar, l lVar) {
        this.f53873a = hVar;
        this.f53874b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    @Override // vd.g
    public final boolean a() {
        boolean z11;
        if (this.f53877e == null) {
            if (this.f53876d != null) {
            }
            this.f53876d = null;
            this.f53878f = null;
            z11 = false;
            while (!z11) {
                ArrayList arrayListB = this.f53873a.b();
                int i11 = this.f53875c;
                this.f53875c = i11 + 1;
                this.f53878f = (zd.p) arrayListB.get(i11);
                if (this.f53878f == null) {
                }
            }
            return z11;
        }
        Object obj = this.f53877e;
        this.f53877e = null;
        try {
            if (d(obj)) {
                if (this.f53876d != null || !this.f53876d.a()) {
                    this.f53876d = null;
                    this.f53878f = null;
                    z11 = false;
                    while (!z11 && this.f53875c < this.f53873a.b().size()) {
                        ArrayList arrayListB2 = this.f53873a.b();
                        int i12 = this.f53875c;
                        this.f53875c = i12 + 1;
                        this.f53878f = (zd.p) arrayListB2.get(i12);
                        if (this.f53878f == null && (this.f53873a.f53894p.a(this.f53878f.f59182c.d()) || this.f53873a.c(this.f53878f.f59182c.a()) != null)) {
                            this.f53878f.f59182c.e(this.f53873a.f53893o, new qp.b(this, this.f53878f));
                            z11 = true;
                        }
                    }
                    return z11;
                }
            }
        } catch (IOException unused) {
        }
        return true;
    }

    @Override // vd.f
    public final void b(td.g gVar, Object obj, com.bumptech.glide.load.data.d dVar, td.a aVar, td.g gVar2) {
        this.f53874b.b(gVar, obj, dVar, this.f53878f.f59182c.d(), gVar);
    }

    @Override // vd.f
    public final void c(td.g gVar, Exception exc, com.bumptech.glide.load.data.d dVar, td.a aVar) {
        this.f53874b.c(gVar, exc, dVar, this.f53878f.f59182c.d());
    }

    @Override // vd.g
    public final void cancel() {
        zd.p pVar = this.f53878f;
        if (pVar != null) {
            pVar.f59182c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th2;
        int i11 = pe.h.f46822a;
        SystemClock.elapsedRealtimeNanos();
        boolean z11 = false;
        try {
            com.bumptech.glide.load.data.f fVarG = this.f53873a.f53882c.a().g(obj);
            Object objA = fVarG.a();
            td.d dVarD = this.f53873a.d(objA);
            m4 m4Var = new m4(dVarD, objA, this.f53873a.f53888i, 6);
            td.g gVar = this.f53878f.f59180a;
            h hVar = this.f53873a;
            e eVar = new e(gVar, hVar.f53892n);
            xd.a aVarA = hVar.f53887h.a();
            aVarA.i(eVar, m4Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                eVar.toString();
                obj.toString();
                dVarD.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (aVarA.j(eVar) != null) {
                this.f53879t = eVar;
                this.f53876d = new d(Collections.singletonList(this.f53878f.f59180a), this.f53873a, this);
                this.f53878f.f59182c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f53879t);
                obj.toString();
            }
            try {
                this.f53874b.b(this.f53878f.f59180a, fVarG.a(), this.f53878f.f59182c, this.f53878f.f59182c.d(), this.f53878f.f59180a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z11 = true;
                if (z11) {
                    throw th2;
                }
                this.f53878f.f59182c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }
}
