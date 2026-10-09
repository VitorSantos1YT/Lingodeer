package h4;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31800a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f31801b = Float.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31802c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31803d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f31804e;

    public x(MotionLayout motionLayout) {
        this.f31804e = motionLayout;
    }

    public final void a() {
        float f5;
        com.android.billingclient.api.c0 c0Var;
        Object obj;
        int i11 = this.f31802c;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f12 = 1.0f;
        MotionLayout motionLayout = this.f31804e;
        if (i11 == -1 && this.f31803d == -1) {
            f5 = 1.0f;
        } else {
            if (i11 == -1) {
                int i12 = this.f31803d;
                if (motionLayout.isAttachedToWindow()) {
                    v vVar = motionLayout.f1272b1;
                    HashMap map = motionLayout.f1278f0;
                    d0 d0Var = motionLayout.S;
                    if (d0Var != null && (c0Var = d0Var.f31584b) != null) {
                        int i13 = motionLayout.f1269a0;
                        float f13 = -1;
                        j4.w wVar = (j4.w) ((SparseArray) c0Var.f7471c).get(i12);
                        if (wVar != null) {
                            ArrayList arrayList = wVar.f36053b;
                            int i14 = wVar.f36054c;
                            if (f13 != -1.0f && f13 != -1.0f) {
                                int size = arrayList.size();
                                int i15 = 0;
                                j4.x xVar = null;
                                while (true) {
                                    if (i15 >= size) {
                                        if (xVar != null) {
                                            i13 = xVar.f36059e;
                                            break;
                                        } else {
                                            i13 = i14;
                                            break;
                                        }
                                    }
                                    Object obj2 = arrayList.get(i15);
                                    i15++;
                                    j4.x xVar2 = (j4.x) obj2;
                                    if (xVar2.a(f13, f13)) {
                                        if (i13 == xVar2.f36059e) {
                                            break;
                                        } else {
                                            xVar = xVar2;
                                        }
                                    }
                                }
                            } else if (i14 != i13) {
                                int size2 = arrayList.size();
                                int i16 = 0;
                                do {
                                    if (i16 >= size2) {
                                        i13 = i14;
                                        break;
                                    } else {
                                        obj = arrayList.get(i16);
                                        i16++;
                                    }
                                } while (i13 != ((j4.x) obj).f36059e);
                            }
                        } else {
                            i13 = i12;
                        }
                        if (i13 != -1) {
                            i12 = i13;
                        }
                    }
                    int i17 = motionLayout.f1269a0;
                    if (i17 != i12) {
                        if (motionLayout.W == i12) {
                            motionLayout.r(CropImageView.DEFAULT_ASPECT_RATIO);
                        } else if (motionLayout.f1271b0 == i12) {
                            motionLayout.r(1.0f);
                        } else {
                            motionLayout.f1271b0 = i12;
                            if (i17 != -1) {
                                motionLayout.E(i17, i12);
                                motionLayout.r(1.0f);
                                motionLayout.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
                                motionLayout.r(1.0f);
                                motionLayout.X0 = null;
                            } else {
                                motionLayout.f1291r0 = false;
                                motionLayout.f1285l0 = 1.0f;
                                motionLayout.f1282i0 = CropImageView.DEFAULT_ASPECT_RATIO;
                                motionLayout.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
                                motionLayout.f1284k0 = motionLayout.getNanoTime();
                                motionLayout.f1279g0 = motionLayout.getNanoTime();
                                motionLayout.f1286m0 = false;
                                motionLayout.T = null;
                                motionLayout.f1281h0 = motionLayout.S.c() / 1000.0f;
                                motionLayout.W = -1;
                                motionLayout.S.n(-1, motionLayout.f1271b0);
                                SparseArray sparseArray = new SparseArray();
                                int childCount = motionLayout.getChildCount();
                                map.clear();
                                for (int i18 = 0; i18 < childCount; i18++) {
                                    View childAt = motionLayout.getChildAt(i18);
                                    map.put(childAt, new q(childAt));
                                    sparseArray.put(childAt.getId(), (q) map.get(childAt));
                                }
                                motionLayout.f1287n0 = true;
                                vVar.e(null, motionLayout.S.b(i12));
                                motionLayout.C();
                                vVar.a();
                                int childCount2 = motionLayout.getChildCount();
                                int i19 = 0;
                                while (i19 < childCount2) {
                                    View childAt2 = motionLayout.getChildAt(i19);
                                    q qVar = (q) map.get(childAt2);
                                    if (qVar != null) {
                                        a0 a0Var = qVar.f31752f;
                                        a0Var.f31553c = CropImageView.DEFAULT_ASPECT_RATIO;
                                        a0Var.f31554d = CropImageView.DEFAULT_ASPECT_RATIO;
                                        a0Var.e(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                                        o oVar = qVar.f31754h;
                                        oVar.getClass();
                                        childAt2.getX();
                                        childAt2.getY();
                                        childAt2.getWidth();
                                        childAt2.getHeight();
                                        oVar.f31740c = childAt2.getVisibility();
                                        oVar.f31742e = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                                        oVar.f31743f = childAt2.getElevation();
                                        oVar.f31744t = childAt2.getRotation();
                                        oVar.H = childAt2.getRotationX();
                                        oVar.f31738a = childAt2.getRotationY();
                                        oVar.K = childAt2.getScaleX();
                                        oVar.L = childAt2.getScaleY();
                                        oVar.M = childAt2.getPivotX();
                                        oVar.N = childAt2.getPivotY();
                                        oVar.O = childAt2.getTranslationX();
                                        oVar.P = childAt2.getTranslationY();
                                        oVar.Q = childAt2.getTranslationZ();
                                    }
                                    i19++;
                                    f12 = f12;
                                }
                                f5 = f12;
                                int width = motionLayout.getWidth();
                                int height = motionLayout.getHeight();
                                if (motionLayout.F0 != null) {
                                    for (int i21 = 0; i21 < childCount; i21++) {
                                        q qVar2 = (q) map.get(motionLayout.getChildAt(i21));
                                        if (qVar2 != null) {
                                            motionLayout.S.f(qVar2);
                                        }
                                    }
                                    ArrayList arrayList2 = motionLayout.F0;
                                    int size3 = arrayList2.size();
                                    int i22 = 0;
                                    while (i22 < size3) {
                                        Object obj3 = arrayList2.get(i22);
                                        i22++;
                                        ((MotionHelper) obj3).r(motionLayout, map);
                                    }
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        q qVar3 = (q) map.get(motionLayout.getChildAt(i23));
                                        if (qVar3 != null) {
                                            qVar3.i(motionLayout.getNanoTime(), width, height);
                                        }
                                    }
                                } else {
                                    for (int i24 = 0; i24 < childCount; i24++) {
                                        q qVar4 = (q) map.get(motionLayout.getChildAt(i24));
                                        if (qVar4 != null) {
                                            motionLayout.S.f(qVar4);
                                            qVar4.i(motionLayout.getNanoTime(), width, height);
                                        }
                                    }
                                }
                                c0 c0Var2 = motionLayout.S.f31585c;
                                float f14 = c0Var2 != null ? c0Var2.f31573i : 0.0f;
                                if (f14 != CropImageView.DEFAULT_ASPECT_RATIO) {
                                    float fMin = Float.MAX_VALUE;
                                    float fMax = -3.4028235E38f;
                                    for (int i25 = 0; i25 < childCount; i25++) {
                                        a0 a0Var2 = ((q) map.get(motionLayout.getChildAt(i25))).f31753g;
                                        float f15 = a0Var2.f31556f + a0Var2.f31555e;
                                        fMin = Math.min(fMin, f15);
                                        fMax = Math.max(fMax, f15);
                                    }
                                    for (int i26 = 0; i26 < childCount; i26++) {
                                        q qVar5 = (q) map.get(motionLayout.getChildAt(i26));
                                        a0 a0Var3 = qVar5.f31753g;
                                        float f16 = a0Var3.f31555e;
                                        float f17 = a0Var3.f31556f;
                                        qVar5.f31759n = f5 / (f5 - f14);
                                        qVar5.m = f14 - ((((f16 + f17) - fMin) * f14) / (fMax - fMin));
                                    }
                                }
                                motionLayout.f1282i0 = CropImageView.DEFAULT_ASPECT_RATIO;
                                motionLayout.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
                                motionLayout.f1287n0 = true;
                                motionLayout.invalidate();
                            }
                        }
                    }
                } else {
                    if (motionLayout.W0 == null) {
                        motionLayout.W0 = new x(motionLayout);
                    }
                    motionLayout.W0.f31803d = i12;
                }
                f5 = 1.0f;
            } else {
                f5 = 1.0f;
                int i27 = this.f31803d;
                if (i27 == -1) {
                    motionLayout.D(i11);
                } else {
                    motionLayout.E(i11, i27);
                }
            }
            motionLayout.setState(z.SETUP);
        }
        if (Float.isNaN(this.f31801b)) {
            if (Float.isNaN(this.f31800a)) {
                return;
            }
            motionLayout.setProgress(this.f31800a);
            return;
        }
        float f18 = this.f31800a;
        float f19 = this.f31801b;
        if (motionLayout.isAttachedToWindow()) {
            motionLayout.setProgress(f18);
            motionLayout.setState(z.MOVING);
            motionLayout.V = f19;
            if (f19 != CropImageView.DEFAULT_ASPECT_RATIO) {
                if (f19 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    f11 = f5;
                }
                motionLayout.r(f11);
            } else if (f18 != CropImageView.DEFAULT_ASPECT_RATIO && f18 != f5) {
                if (f18 > 0.5f) {
                    f11 = f5;
                }
                motionLayout.r(f11);
            }
        } else {
            if (motionLayout.W0 == null) {
                motionLayout.W0 = new x(motionLayout);
            }
            x xVar3 = motionLayout.W0;
            xVar3.f31800a = f18;
            xVar3.f31801b = f19;
        }
        this.f31800a = Float.NaN;
        this.f31801b = Float.NaN;
        this.f31802c = -1;
        this.f31803d = -1;
    }
}
