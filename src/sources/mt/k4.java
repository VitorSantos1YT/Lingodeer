package mt;

import android.graphics.DashPathEffect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.data.model.SRSStatus;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k4 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f41594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41595c;

    public /* synthetic */ k4(long j11, ReviewVisibilityMode reviewVisibilityMode) {
        this.f41593a = 4;
        this.f41594b = j11;
        this.f41595c = reviewVisibilityMode;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View viewInflate;
        int i11 = this.f41593a;
        long j11 = this.f41594b;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f41595c;
        switch (i11) {
            case 0:
                sy.c cVar = (sy.c) obj2;
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                float f5 = 1;
                float fE0 = Canvas.e0(f5);
                if (cVar.b() > 1) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.d() >> 32));
                    float fB = fIntBitsToFloat / (cVar.b() * 2);
                    float f11 = 2;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / f11)) & 4294967295L);
                    float f12 = fIntBitsToFloat - fB;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / f11)) & 4294967295L);
                    long j12 = this.f41594b;
                    Canvas.f0(j12, jFloatToRawIntBits, jFloatToRawIntBits2, (480 & 8) != 0 ? 0.0f : fE0, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                    Canvas.f0(j12, (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / f11)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat - Canvas.e0(32))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / f11)) & 4294967295L), (480 & 8) != 0 ? 0.0f : fE0, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : new g2.l(new DashPathEffect(new float[]{Canvas.e0(f5), Canvas.e0(f11)}, Canvas.e0(f11))), 3);
                }
                return b0Var;
            case 1:
                b0.d dVar = (b0.d) obj;
                ((nu.e) obj2).f44062a.g((((long) Float.floatToRawIntBits(((Number) dVar.d()).floatValue() * Float.intBitsToFloat((int) (j11 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(((Number) dVar.d()).floatValue() * Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L));
                return b0Var;
            case 2:
                ot.i2 suggestion = (ot.i2) obj;
                kotlin.jvm.internal.m.f(suggestion, "suggestion");
                SRSStatus sRSStatus = (SRSStatus) ((LinkedHashMap) obj2).get(suggestion.f45854a);
                if (sRSStatus == null) {
                    return null;
                }
                long nextReviewTime = suggestion.f45856c.getNextReviewTime();
                if (sRSStatus.isExcludedFromReview()) {
                    return null;
                }
                long nextReviewTime2 = sRSStatus.getNextReviewTime();
                long j13 = this.f41594b;
                if (nextReviewTime2 <= j13 || nextReviewTime >= sRSStatus.getNextReviewTime()) {
                    return null;
                }
                return SRSStatus.copy$default(sRSStatus, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, nextReviewTime, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, j13, true, null, 1308671, null);
            case 3:
                final qh.m mVar = (qh.m) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                if (mVar.N == null) {
                    PopupWindow popupWindow = new PopupWindow(-1, -1);
                    popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: qh.i
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            View view = mVar.getView();
                            kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
                            com.bumptech.glide.e.m((ViewGroup) view);
                        }
                    });
                    if (j11 == 3) {
                        LayoutInflater layoutInflaterFrom = LayoutInflater.from(mVar.requireContext());
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        viewInflate = layoutInflaterFrom.inflate(ry.l.D(new Integer[]{2, 13}, Integer.valueOf(cf.x.n().keyLanguage)) ? R.layout.fragment_word_choose_game_teach_kr : R.layout.fragment_word_choose_game_teach_jp, (ViewGroup) null, false);
                    } else {
                        int i12 = R.layout.fragment_word_spell_game_teach_kr;
                        if (j11 == 2) {
                            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(mVar.requireContext());
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            if (!ry.l.D(new Integer[]{2, 13}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                i12 = R.layout.fragment_word_spell_game_teach_jp;
                            }
                            viewInflate = layoutInflaterFrom2.inflate(i12, (ViewGroup) null, false);
                        } else if (j11 == 1) {
                            LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(mVar.requireContext());
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            viewInflate = layoutInflaterFrom3.inflate(ry.l.D(new Integer[]{2, 13}, Integer.valueOf(cf.x.n().keyLanguage)) ? R.layout.fragment_word_listen_game_teach_kr : R.layout.fragment_word_listen_game_teach_jp, (ViewGroup) null, false);
                        } else {
                            viewInflate = LayoutInflater.from(mVar.requireContext()).inflate(R.layout.fragment_word_spell_game_teach_kr, (ViewGroup) null, false);
                        }
                    }
                    popupWindow.setContentView(viewInflate);
                    View viewFindViewById = popupWindow.getContentView().findViewById(R.id.btn_start);
                    kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                    bq.z.b(viewFindViewById, new qh.j(popupWindow, 0));
                    View contentView = popupWindow.getContentView();
                    kotlin.jvm.internal.m.e(contentView, "getContentView(...)");
                    bq.z.b(contentView, new qh.j(popupWindow, 1));
                    popupWindow.setFocusable(true);
                    if (((ImageView) popupWindow.getContentView().findViewById(R.id.iv_hand)) != null) {
                        android.support.v4.media.session.a.K(((ImageView) popupWindow.getContentView().findViewById(R.id.iv_hand)).getBackground());
                    }
                    mVar.N = popupWindow;
                }
                bq.f fVar = new bq.f(mVar.requireContext());
                View view = mVar.getView();
                kotlin.jvm.internal.m.d(view, "null cannot be cast to non-null type android.view.ViewGroup");
                fVar.l((ViewGroup) view);
                PopupWindow popupWindow2 = mVar.N;
                if (popupWindow2 != null) {
                    popupWindow2.showAtLocation(mVar.getView(), 17, 0, 0);
                }
                return b0Var;
            case 4:
                SRSStatus it = (SRSStatus) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return SRSStatus.copy$default(it, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, this.f41594b, true, (ReviewVisibilityMode) obj2, 262143, null);
            case 5:
                s0.s0 s0Var = (s0.s0) obj2;
                i2.d dVar2 = (i2.d) obj;
                if (((Boolean) s0Var.f51183s.getValue()).booleanValue() || ((Boolean) s0Var.f51184t.getValue()).booleanValue()) {
                    i2.d.U(dVar2, this.f41594b, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 126);
                }
                return b0Var;
            case 6:
                tg.y0 y0Var = (tg.y0) obj2;
                tg.w0 layoutResult = (tg.w0) obj;
                kotlin.jvm.internal.m.f(layoutResult, "layoutResult");
                final ArrayList arrayList = layoutResult.f52389a;
                final ArrayList arrayList2 = layoutResult.f52390b;
                g2.x xVar = y0Var.f52399c;
                kotlin.jvm.internal.m.c(xVar);
                long j14 = xVar.f28624a;
                final long j15 = j14 != 16 ? j14 : j11;
                final float fFloatValue = y0Var.f52400d.floatValue();
                return d2.h.d(z1.o.f58481a, new fz.c() { // from class: tg.s0
                    @Override // fz.c
                    public final Object invoke(Object obj3) {
                        long j16;
                        float f13;
                        i2.d drawBehind = (i2.d) obj3;
                        kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                        ArrayList arrayList3 = arrayList;
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (true) {
                            j16 = j15;
                            f13 = fFloatValue;
                            if (i13 >= size) {
                                break;
                            }
                            int i14 = i13 + 1;
                            float fFloatValue2 = ((Number) arrayList3.get(i13)).floatValue();
                            drawBehind.f0(j16, (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), (480 & 8) != 0 ? 0.0f : f13, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                            i13 = i14;
                        }
                        ArrayList arrayList4 = arrayList2;
                        int size2 = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj4 = arrayList4.get(i15);
                            i15++;
                            float fFloatValue3 = ((Number) obj4).floatValue();
                            drawBehind = drawBehind;
                            drawBehind.f0(j16, (((long) Float.floatToRawIntBits(fFloatValue3)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fFloatValue3) << 32), (480 & 8) != 0 ? 0.0f : f13, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                        }
                        return qy.b0.f48488a;
                    }
                });
            default:
                y2.k0 drawWithContent = (y2.k0) obj;
                kotlin.jvm.internal.m.f(drawWithContent, "$this$drawWithContent");
                drawWithContent.a();
                i2.b bVar = drawWithContent.f56937a;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.d() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.d() & 4294967295L));
                float fE1 = drawWithContent.e0(12);
                float f13 = 2;
                float fE2 = drawWithContent.e0(f13);
                float f14 = fE2 / f13;
                float f15 = fIntBitsToFloat2 - f14;
                int i13 = ys.f1.f57997a[((ys.z0) obj2).ordinal()];
                long j16 = this.f41594b;
                if (i13 == 1) {
                    g2.k kVarA = g2.o.a();
                    kVarA.g(f14, fIntBitsToFloat3);
                    kVarA.f(f14, fE1);
                    float f16 = f14 + fE1;
                    kVarA.i(f14, f14, f16, f14);
                    kVarA.f(f15 - fE1, f14);
                    kVarA.i(f15, f14, f15, f16);
                    kVarA.f(f15, fIntBitsToFloat3);
                    i2.d.o0(drawWithContent, kVarA, j16, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(fE2, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                } else if (i13 == 2) {
                    drawWithContent.f0(j16, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), (480 & 8) != 0 ? 0.0f : fE2, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                    drawWithContent.f0(j16, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), (480 & 8) != 0 ? 0.0f : fE2, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                } else if (i13 == 3) {
                    float f17 = fIntBitsToFloat3 - f14;
                    g2.k kVarA2 = g2.o.a();
                    float fK = hz.b.k(fE1, CropImageView.DEFAULT_ASPECT_RATIO, Math.min(fIntBitsToFloat2 / 2.0f, fIntBitsToFloat3));
                    kVarA2.g(f14, CropImageView.DEFAULT_ASPECT_RATIO);
                    float f18 = f17 - fK;
                    kVarA2.f(f14, f18);
                    kVarA2.i(f14, f17, f14 + fK, f17);
                    kVarA2.f(f15 - fK, f17);
                    kVarA2.i(f15, f17, f15, f18);
                    kVarA2.f(f15, CropImageView.DEFAULT_ASPECT_RATIO);
                    i2.d.o0(drawWithContent, kVarA2, j16, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(fE2, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                } else {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2.d.y(drawWithContent, j16, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3 - fE2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - fE2)) << 32), (((long) Float.floatToRawIntBits(fE1)) & 4294967295L) | (((long) Float.floatToRawIntBits(fE1)) << 32), new i2.h(fE2, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 224);
                }
                return b0Var;
        }
    }

    public /* synthetic */ k4(Object obj, long j11, int i11) {
        this.f41593a = i11;
        this.f41595c = obj;
        this.f41594b = j11;
    }
}
