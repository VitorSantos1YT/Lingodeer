package z00;

import com.android.billingclient.api.c0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f58443a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f58444b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f58445c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f58446d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f58447e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f58448f = null;

    public abstract void a(c0 c0Var);

    public final void b(y yVar) {
        if (this.f58448f == null) {
            this.f58448f = new ArrayList();
        }
        this.f58448f.add(yVar);
    }

    public final void c(t tVar) {
        tVar.i();
        tVar.f(this);
        t tVar2 = this.f58445c;
        if (tVar2 == null) {
            this.f58444b = tVar;
            this.f58445c = tVar;
        } else {
            tVar2.f58447e = tVar;
            tVar.f58446d = tVar2;
            this.f58445c = tVar;
        }
    }

    public final List d() {
        ArrayList arrayList = this.f58448f;
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final void e(t tVar) {
        tVar.i();
        t tVar2 = this.f58447e;
        tVar.f58447e = tVar2;
        if (tVar2 != null) {
            tVar2.f58446d = tVar;
        }
        tVar.f58446d = this;
        this.f58447e = tVar;
        t tVar3 = this.f58443a;
        tVar.f58443a = tVar3;
        if (tVar.f58447e == null) {
            tVar3.f58445c = tVar;
        }
    }

    public void f(t tVar) {
        this.f58443a = tVar;
    }

    public final void g(List list) {
        if (list.isEmpty()) {
            this.f58448f = null;
        } else {
            this.f58448f = new ArrayList(list);
        }
    }

    public String h() {
        return BuildConfig.VERSION_NAME;
    }

    public final void i() {
        t tVar = this.f58446d;
        if (tVar != null) {
            tVar.f58447e = this.f58447e;
        } else {
            t tVar2 = this.f58443a;
            if (tVar2 != null) {
                tVar2.f58444b = this.f58447e;
            }
        }
        t tVar3 = this.f58447e;
        if (tVar3 != null) {
            tVar3.f58446d = tVar;
        } else {
            t tVar4 = this.f58443a;
            if (tVar4 != null) {
                tVar4.f58445c = tVar;
            }
        }
        this.f58443a = null;
        this.f58447e = null;
        this.f58446d = null;
    }

    public final String toString() {
        return nv.p.r(getClass().getSimpleName(), "{", h(), "}");
    }
}
