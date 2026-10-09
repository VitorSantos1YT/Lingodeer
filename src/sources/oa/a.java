package oa;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Region;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44758c;

    public a(xs.i iVar) {
        this.f44756a = 3;
        this.f44758c = iVar;
        this.f44757b = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44756a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d dVar = (d) this.f44758c;
                c cVar = (c) this.f44757b;
                d.d(fFloatValue, cVar);
                dVar.a(fFloatValue, cVar, false);
                dVar.invalidateSelf();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ws.b bVar = (ws.b) this.f44758c;
                PathMeasure pathMeasure = bVar.f55198b;
                float[] fArr = (float[]) this.f44757b;
                pathMeasure.getPosTan(fFloatValue2, fArr, null);
                ArrayList arrayList = bVar.f55202f;
                arrayList.add(new ws.d(fArr[0], fArr[1]));
                Canvas canvas = bVar.f55197a;
                canvas.save();
                HwViewNew hwViewNew = bVar.f55203g;
                if (bVar.f55200d) {
                    int i11 = bVar.f55201e;
                    ArrayList arrayList2 = hwViewNew.K;
                    if (i11 < arrayList2.size()) {
                        Path path = new Path();
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            ws.d dVar2 = (ws.d) arrayList.get(i12);
                            path.addCircle(dVar2.f55209a, dVar2.f55210b, bVar.f55204h, Path.Direction.CW);
                        }
                        canvas.clipPath((Path) arrayList2.get(bVar.f55201e));
                        canvas.clipPath(path, Region.Op.INTERSECT);
                        for (int i13 = 0; i13 < bVar.f55201e; i13++) {
                            canvas.save();
                            canvas.clipPath((Path) arrayList2.get(i13));
                            canvas.restore();
                        }
                        int color = Color.parseColor("#66FF6666");
                        Paint paint = hwViewNew.f22266f;
                        paint.setStyle(Paint.Style.FILL);
                        paint.setColor(color);
                        canvas.drawPath(hwViewNew.f22267t.b(hwViewNew.L), paint);
                        canvas.restore();
                    }
                }
                hwViewNew.invalidate();
                break;
            case 2:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xs.b bVar2 = (xs.b) this.f44758c;
                PathMeasure pathMeasure2 = bVar2.f56217c;
                float[] fArr2 = (float[]) this.f44757b;
                pathMeasure2.getPosTan(fFloatValue3, fArr2, null);
                ArrayList arrayList3 = bVar2.f56221g;
                arrayList3.add(new xs.d(fArr2[0], fArr2[1]));
                Canvas canvas2 = bVar2.f56215a;
                canvas2.save();
                HwView hwView = bVar2.f56222h;
                if (bVar2.f56219e) {
                    int i14 = bVar2.f56220f;
                    ArrayList arrayList4 = hwView.K;
                    if (i14 < arrayList4.size()) {
                        Path path2 = new Path();
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            xs.d dVar3 = (xs.d) arrayList3.get(i15);
                            path2.addCircle(dVar3.f56228a, dVar3.f56229b, bVar2.f56223i, Path.Direction.CW);
                        }
                        canvas2.clipPath((Path) arrayList4.get(bVar2.f56220f));
                        canvas2.clipPath(path2, Region.Op.INTERSECT);
                        for (int i16 = 0; i16 < bVar2.f56220f; i16++) {
                            canvas2.save();
                            canvas2.clipPath((Path) arrayList4.get(i16));
                            canvas2.restore();
                        }
                        hwView.b(canvas2);
                        canvas2.restore();
                    }
                }
                hwView.invalidate();
                break;
            default:
                Objects.toString(valueAnimator.getAnimatedValue());
                xs.i iVar = (xs.i) this.f44758c;
                iVar.P.getLength();
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PathMeasure pathMeasure3 = iVar.P;
                float[] fArr3 = (float[]) this.f44757b;
                pathMeasure3.getPosTan(fFloatValue4, fArr3, null);
                iVar.S.add(new xs.d(fArr3[0], fArr3[1]));
                Canvas canvas3 = iVar.f56247a;
                canvas3.save();
                iVar.i(canvas3);
                iVar.f56249c.invalidate();
                break;
        }
    }

    public a(xs.b bVar) {
        this.f44756a = 2;
        this.f44758c = bVar;
        this.f44757b = new float[2];
    }

    public a(ws.b bVar) {
        this.f44756a = 1;
        this.f44758c = bVar;
        this.f44757b = new float[2];
    }

    public a(d dVar, c cVar) {
        this.f44756a = 0;
        this.f44758c = dVar;
        this.f44757b = cVar;
    }
}
