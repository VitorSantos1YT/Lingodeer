package w1;

import l1.f2;
import qp.m3;
import s0.u;
import x1.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k, f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f54450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f54451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f54453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f54454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f54455f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f54456t = new u(this, 18);

    public a(i iVar, e eVar, String str, Object obj, Object[] objArr) {
        this.f54450a = iVar;
        this.f54451b = eVar;
        this.f54452c = str;
        this.f54453d = obj;
        this.f54454e = objArr;
    }

    @Override // l1.f2
    public final void a() {
        d dVar = this.f54455f;
        if (dVar != null) {
            ((m3) dVar).j();
        }
    }

    public final void b() {
        String strA;
        e eVar = this.f54451b;
        if (this.f54455f != null) {
            throw new IllegalArgumentException(("entry(" + this.f54455f + ") is not null").toString());
        }
        if (eVar != null) {
            u uVar = this.f54456t;
            Object objInvoke = uVar.invoke();
            if (objInvoke == null || eVar.canBeSaved(objInvoke)) {
                this.f54455f = eVar.e(this.f54452c, uVar);
                return;
            }
            if (objInvoke instanceof n) {
                n nVar = (n) objInvoke;
                if (nVar.e() == l1.g.f39300d || nVar.e() == l1.g.f39303t || nVar.e() == l1.g.f39301e) {
                    strA = "MutableState containing " + nVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = j.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // w1.k
    public final boolean canBeSaved(Object obj) {
        e eVar = this.f54451b;
        return eVar == null || eVar.canBeSaved(obj);
    }

    @Override // l1.f2
    public final void d() {
        d dVar = this.f54455f;
        if (dVar != null) {
            ((m3) dVar).j();
        }
    }

    @Override // l1.f2
    public final void f() {
        b();
    }
}
