package me;

import android.graphics.drawable.Drawable;
import le.i;
import pe.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public le.c f41126c;

    public b() {
        if (!m.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f41124a = Integer.MIN_VALUE;
        this.f41125b = Integer.MIN_VALUE;
    }

    @Override // me.d
    public final void d(i iVar) {
        iVar.l(this.f41124a, this.f41125b);
    }

    @Override // me.d
    public final le.c g() {
        return this.f41126c;
    }

    @Override // me.d
    public final void i(le.c cVar) {
        this.f41126c = cVar;
    }

    @Override // ie.i
    public final void a() {
    }

    @Override // ie.i
    public final void onDestroy() {
    }

    @Override // ie.i
    public final void onStart() {
    }

    @Override // me.d
    public final void b(i iVar) {
    }

    @Override // me.d
    public void c(Drawable drawable) {
    }

    @Override // me.d
    public final void f(Drawable drawable) {
    }
}
