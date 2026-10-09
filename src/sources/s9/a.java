package s9;

import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import ff.h;
import kotlin.jvm.internal.m;
import mv.f0;
import ns.j;
import qy.b0;
import rz.e0;
import rz.o0;
import t9.e;
import t9.f;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f51519a;

    public a(h hVar) {
        this.f51519a = hVar;
    }

    public ListenableFuture<b0> a(t9.a deletionRequest) {
        m.f(deletionRequest, "deletionRequest");
        throw null;
    }

    public ListenableFuture<Integer> b() {
        return md.a.c(e0.f(e0.c(o0.f50940a), null, null, new f0(this, null, 25), 3));
    }

    public ListenableFuture<b0> c(Uri attributionSource, InputEvent inputEvent) {
        m.f(attributionSource, "attributionSource");
        return md.a.c(e0.f(e0.c(o0.f50940a), null, null, new rt.h(this, attributionSource, inputEvent, (d) null, 13), 3));
    }

    public ListenableFuture<b0> d(t9.d request) {
        m.f(request, "request");
        throw null;
    }

    public ListenableFuture<b0> e(Uri trigger) {
        m.f(trigger, "trigger");
        return md.a.c(e0.f(e0.c(o0.f50940a), null, null, new j(29, this, trigger, null), 3));
    }

    public ListenableFuture<b0> f(e request) {
        m.f(request, "request");
        throw null;
    }

    public ListenableFuture<b0> g(f request) {
        m.f(request, "request");
        throw null;
    }
}
