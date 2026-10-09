package z2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f58520a = new c0();

    public final boolean onClearTranslation(View view) {
        fz.a aVar;
        kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        b2.i contentCaptureManager$ui = ((AndroidComposeView) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f3870f = b2.b.SHOW_ORIGINAL;
        y.m mVarD = contentCaptureManager$ui.d();
        Object[] objArr = mVarD.f56738c;
        long[] jArr = mVarD.f56736a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        y.i0 i0Var = ((g3.u) objArr[(i11 << 3) + i13]).f28703a.f28699d.f28691a;
                        Object objG = i0Var.g(g3.x.D);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = i0Var.g(g3.n.f28678n);
                            g3.a aVar2 = (g3.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (fz.a) aVar2.f28635b) != null) {
                            }
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final boolean onHideTranslation(View view) {
        fz.c cVar;
        kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        b2.i contentCaptureManager$ui = ((AndroidComposeView) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f3870f = b2.b.SHOW_ORIGINAL;
        y.m mVarD = contentCaptureManager$ui.d();
        Object[] objArr = mVarD.f56738c;
        long[] jArr = mVarD.f56736a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        y.i0 i0Var = ((g3.u) objArr[(i11 << 3) + i13]).f28703a.f28699d.f28691a;
                        Object objG = i0Var.g(g3.x.D);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, Boolean.TRUE)) {
                            Object objG2 = i0Var.g(g3.n.m);
                            g3.a aVar = (g3.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (fz.c) aVar.f28635b) != null) {
                            }
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final boolean onShowTranslation(View view) {
        fz.c cVar;
        kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        b2.i contentCaptureManager$ui = ((AndroidComposeView) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.f3870f = b2.b.SHOW_TRANSLATED;
        y.m mVarD = contentCaptureManager$ui.d();
        Object[] objArr = mVarD.f56738c;
        long[] jArr = mVarD.f56736a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        y.i0 i0Var = ((g3.u) objArr[(i11 << 3) + i13]).f28703a.f28699d.f28691a;
                        Object objG = i0Var.g(g3.x.D);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, Boolean.FALSE)) {
                            Object objG2 = i0Var.g(g3.n.m);
                            g3.a aVar = (g3.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (fz.c) aVar.f28635b) != null) {
                            }
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }
}
