package l1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f39229c;

    public a(w9.s database) {
        kotlin.jvm.internal.m.f(database, "database");
        this.f39227a = database;
        this.f39228b = new AtomicBoolean(false);
        this.f39229c = com.bumptech.glide.d.v(new s0.u(this, 23));
    }

    public la.j a() {
        ((w9.s) this.f39227a).a();
        return ((AtomicBoolean) this.f39228b).compareAndSet(false, true) ? (la.j) ((qy.q) this.f39229c).getValue() : e();
    }

    public void c() {
        ((ArrayList) this.f39229c).clear();
        this.f39228b = this.f39227a;
        g();
    }

    @Override // l1.d
    public void d(Object obj) {
        ((ArrayList) this.f39229c).add(this.f39228b);
        this.f39228b = obj;
    }

    public la.j e() {
        String strF = f();
        w9.s sVar = (w9.s) this.f39227a;
        sVar.getClass();
        sVar.a();
        sVar.b();
        return sVar.l().n0().m(strF);
    }

    public abstract String f();

    public abstract void g();

    public void i(la.j statement) {
        kotlin.jvm.internal.m.f(statement, "statement");
        if (statement == ((la.j) ((qy.q) this.f39229c).getValue())) {
            ((AtomicBoolean) this.f39228b).set(false);
        }
    }

    @Override // l1.d
    public void q() {
        this.f39228b = hh.p0.f(1, (ArrayList) this.f39229c);
    }

    @Override // l1.d
    public Object x() {
        return this.f39228b;
    }

    public a(Object obj) {
        this.f39227a = obj;
        this.f39229c = new ArrayList();
        this.f39228b = obj;
    }
}
