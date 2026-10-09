package z2;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f58604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2.i0 f58605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f58606f;

    public l(AndroidComposeView androidComposeView, y2.i0 i0Var, AndroidComposeView androidComposeView2) {
        this.f58604d = androidComposeView;
        this.f58605e = i0Var;
        this.f58606f = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // z4.b
    public final void d(View view, a5.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
        this.f58810a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.f58604d;
        x xVar = androidComposeView.f1164c0;
        if (xVar.v()) {
            gVar.y(false);
        }
        y2.i0 i0Var = this.f58605e;
        y2.i0 i0VarW = i0Var.w();
        while (true) {
            if (i0VarW == null) {
                i0VarW = null;
                break;
            } else if (i0VarW.f56892i0.g(8)) {
                break;
            } else {
                i0VarW = i0VarW.w();
            }
        }
        Integer numValueOf = i0VarW != null ? Integer.valueOf(i0VarW.f56880b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().a().f28702g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        gVar.f381b = iIntValue;
        AndroidComposeView androidComposeView2 = this.f58606f;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i11 = i0Var.f56880b;
        int iD = xVar.f58711e0.d(i11);
        if (iD != -1) {
            AndroidViewHolder androidViewHolderC = g0.C(androidComposeView.getAndroidViewsHandler$ui(), iD);
            if (androidViewHolderC != null) {
                accessibilityNodeInfo.setTraversalBefore(androidViewHolderC);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iD);
            }
            AndroidComposeView.b(androidComposeView, i11, accessibilityNodeInfo, xVar.f58714g0);
        }
        int iD2 = xVar.f58713f0.d(i11);
        if (iD2 != -1) {
            AndroidViewHolder androidViewHolderC2 = g0.C(androidComposeView.getAndroidViewsHandler$ui(), iD2);
            if (androidViewHolderC2 != null) {
                accessibilityNodeInfo.setTraversalAfter(androidViewHolderC2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iD2);
            }
            AndroidComposeView.b(androidComposeView, i11, accessibilityNodeInfo, xVar.f58715h0);
        }
    }
}
