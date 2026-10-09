package ib;

import android.content.Context;
import android.content.Intent;
import fb.l;
import java.util.HashMap;
import lt.AJC.PQgum;
import ob.j;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements gb.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34295f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f34297b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34298c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f34299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f34300e;

    public b(Context context, l lVar, u uVar) {
        this.f34296a = context;
        this.f34299d = lVar;
        this.f34300e = uVar;
    }

    public static j b(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f44817a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f44818b);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02c3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Intent r12, int r13, ib.i r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.b.a(android.content.Intent, int, ib.i):void");
    }

    @Override // gb.b
    public final void e(j jVar, boolean z11) {
        synchronized (this.f34298c) {
            try {
                f fVar = (f) this.f34297b.remove(jVar);
                this.f34300e.C(jVar);
                if (fVar != null) {
                    fVar.f(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static {
        l.c(PQgum.PivkqG);
    }
}
