package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f33077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f33078b;

    public p0(FrameLayout frameLayout, e3 e3Var) {
        this.f33077a = frameLayout;
        this.f33078b = e3Var;
    }

    public static p0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pinyin_lesson_study, (ViewGroup) null, false);
        int i11 = R.id.fl_container;
        if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_container)) != null) {
            i11 = R.id.ll_download;
            View viewQ = fr.j3.q(viewInflate, R.id.ll_download);
            if (viewQ != null) {
                return new p0((FrameLayout) viewInflate, e3.a(viewQ));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33077a;
    }
}
