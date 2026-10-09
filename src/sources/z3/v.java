package z3;

import androidx.compose.ui.window.PopupLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f58792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f58793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3.k f58794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f58795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f58796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlin.jvm.internal.x xVar, PopupLayout popupLayout, v3.k kVar, long j11, long j12) {
        super(0);
        this.f58792a = xVar;
        this.f58793b = popupLayout;
        this.f58794c = kVar;
        this.f58795d = j11;
        this.f58796e = j12;
    }

    @Override // fz.a
    public final Object invoke() {
        PopupLayout popupLayout = this.f58793b;
        this.f58792a.f38360a = popupLayout.getPositionProvider().b(this.f58794c, this.f58795d, popupLayout.getParentLayoutDirection(), this.f58796e);
        return qy.b0.f48488a;
    }
}
