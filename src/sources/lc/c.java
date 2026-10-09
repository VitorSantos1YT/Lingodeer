package lc;

import android.content.Context;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f39877b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i11) {
        super(0);
        this.f39876a = i11;
        this.f39877b = dVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f39876a) {
            case 0:
                Context context = this.f39877b.getContext();
                m.b(context, "context");
                return Float.valueOf(context.getResources().getDimension(R.dimen.md_dialog_default_corner_radius));
            default:
                return Integer.valueOf(ub.a.a0(this.f39877b, Integer.valueOf(R.attr.colorBackgroundFloating), null, 5));
        }
    }
}
