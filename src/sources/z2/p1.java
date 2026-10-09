package z2;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements vy.h, n2, n3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ p1 f58644b = new p1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1 f58645c = new p1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p1 f58646d = new p1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s2 f58647e = new s2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58648a;

    public /* synthetic */ p1(int i11) {
        this.f58648a = i11;
    }

    @Override // z2.n2
    public fz.a a(AbstractComposeView abstractComposeView) {
        switch (this.f58648a) {
            case 1:
                l2 l2Var = new l2(abstractComposeView, 0);
                abstractComposeView.addOnAttachStateChangeListener(l2Var);
                return new d2.c(19, abstractComposeView, l2Var);
            default:
                if (!abstractComposeView.isAttachedToWindow()) {
                    kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                    cb.j jVar = new cb.j(yVar, 1, abstractComposeView);
                    abstractComposeView.addOnAttachStateChangeListener(jVar);
                    yVar.f38361a = new d2.c(20, abstractComposeView, jVar);
                    return new w2.l1(yVar, 9);
                }
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
                if (lifecycleOwner != null) {
                    return o2.a(abstractComposeView, lifecycleOwner.getLifecycle());
                }
                v2.a.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                throw new KotlinNothingValueException();
        }
    }
}
