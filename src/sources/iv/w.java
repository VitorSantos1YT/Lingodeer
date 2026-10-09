package iv;

import android.view.ViewTreeObserver;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.CourseCharacter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HwView f34853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f34854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseCharacter f34855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f34857e;

    public w(HwView hwView, ViewTreeObserver viewTreeObserver, CourseCharacter courseCharacter, boolean z11, fz.a aVar) {
        this.f34853a = hwView;
        this.f34854b = viewTreeObserver;
        this.f34855c = courseCharacter;
        this.f34856d = z11;
        this.f34857e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HwView hwView = this.f34853a;
        if (hwView.getWidth() <= 0 || hwView.getHeight() <= 0) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.f34854b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        } else {
            hwView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        a.H(hwView, this.f34855c, this.f34856d, this.f34857e);
    }
}
