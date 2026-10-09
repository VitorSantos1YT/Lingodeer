package oc;

import android.view.View;
import android.widget.EditText;
import aw.t;
import fz.c;
import kotlin.jvm.internal.n;
import lc.d;
import lc.h;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f44898b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i11) {
        super(1);
        this.f44897a = i11;
        this.f44898b = dVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f44897a) {
            case 0:
                d.b(this.f44898b, Integer.valueOf(((View) obj).getMeasuredWidth()));
                break;
            case 1:
                d dVar = this.f44898b;
                EditText editTextK = vc.a.k(dVar);
                editTextK.post(new t(editTextK, dVar, false, 18));
                break;
            default:
                android.support.v4.media.session.a.r(this.f44898b, h.POSITIVE).setEnabled(((CharSequence) obj).length() > 0);
                break;
        }
        return b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, androidx.lifecycle.viewmodel.compose.a aVar) {
        super(1);
        this.f44897a = 2;
        this.f44898b = dVar;
    }
}
