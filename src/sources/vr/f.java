package vr;

import android.view.ViewTreeObserver;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.CourseCharacter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HwView f54138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f54139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseCharacter f54140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f54141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f54142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f54143f;

    public f(HwView hwView, ViewTreeObserver viewTreeObserver, CourseCharacter courseCharacter, boolean z11, boolean z12, fz.a aVar) {
        this.f54138a = hwView;
        this.f54139b = viewTreeObserver;
        this.f54140c = courseCharacter;
        this.f54141d = z11;
        this.f54142e = z12;
        this.f54143f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HwView hwView = this.f54138a;
        if (hwView.getWidth() <= 0 || hwView.getHeight() <= 0) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.f54139b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        } else {
            hwView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        g.b(hwView, this.f54140c, this.f54141d, this.f54142e, this.f54143f);
    }
}
