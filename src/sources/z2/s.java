package z2;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f58661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f58662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AndroidComposeView androidComposeView, xy.c cVar) {
        super(cVar);
        this.f58662b = androidComposeView;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f58661a = obj;
        this.f58663c |= Integer.MIN_VALUE;
        return this.f58662b.I(null, this);
    }
}
