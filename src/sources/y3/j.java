package y3;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import y2.t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f57076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f57077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.q f57078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w1.e f57079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f57080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f57081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, fz.c cVar, l1.q qVar, w1.e eVar, int i11, View view) {
        super(0);
        this.f57076a = context;
        this.f57077b = cVar;
        this.f57078c = qVar;
        this.f57079d = eVar;
        this.f57080e = i11;
        this.f57081f = view;
    }

    @Override // fz.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f57081f;
        kotlin.jvm.internal.m.d(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new ViewFactoryHolder(this.f57076a, this.f57077b, this.f57078c, this.f57079d, this.f57080e, (t1) callback).getLayoutNode();
    }
}
