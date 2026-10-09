package ie;

import android.view.View;
import android.view.ViewTreeObserver;
import aw.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f34390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f34391b;

    public d(e eVar, View view) {
        this.f34391b = eVar;
        this.f34390a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        pe.m.f().post(new t(11, this, this));
    }
}
