package qc;

import android.content.Context;
import android.graphics.Color;
import com.lingodeer.R;
import kotlin.jvm.internal.n;
import vc.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f47699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, int i11) {
        super(0);
        this.f47698a = i11;
        this.f47699b = context;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47698a) {
            case 0:
                return Integer.valueOf(c.c(this.f47699b, null, Integer.valueOf(R.attr.colorPrimary), null, 10));
            default:
                int iC = c.c(this.f47699b, null, Integer.valueOf(R.attr.colorPrimary), null, 10);
                return Integer.valueOf(Color.argb((int) (255 * 0.12f), Color.red(iC), Color.green(iC), Color.blue(iC)));
        }
    }
}
