package zc;

import android.graphics.Path;
import android.graphics.PointF;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.util.ArrayList;
import java.util.List;
import ob.u;
import yc.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fd.p f59118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f59119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Path f59120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f59121l;
    public ArrayList m;

    public l(List list) {
        super(list);
        this.f59118i = new fd.p();
        this.f59119j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x016f  */
    @Override // zc.d
    public final Object g(ld.a aVar, float f5) {
        fd.p pVar;
        fd.p pVar2;
        int i11;
        int i12;
        fd.p pVar3;
        fd.p pVar4;
        fd.p pVar5 = (fd.p) aVar.f39889b;
        fd.p pVar6 = (fd.p) aVar.f39890c;
        fd.p pVar7 = pVar6 == null ? pVar5 : pVar6;
        fd.p pVar8 = this.f59118i;
        ArrayList arrayList = pVar8.f27194a;
        if (pVar8.f27195b == null) {
            pVar8.f27195b = new PointF();
        }
        boolean z11 = pVar5.f27196c;
        ArrayList arrayList2 = pVar5.f27194a;
        boolean z12 = true;
        pVar8.f27196c = z11 || pVar7.f27196c;
        int size = arrayList2.size();
        ArrayList arrayList3 = pVar7.f27194a;
        if (size != arrayList3.size()) {
            kd.d.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new dd.a());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = pVar5.f27195b;
        PointF pointF2 = pVar7.f27195b;
        pVar8.a(kd.h.f(pointF.x, pointF2.x, f5), kd.h.f(pointF.y, pointF2.y, f5));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            dd.a aVar2 = (dd.a) arrayList2.get(size4);
            dd.a aVar3 = (dd.a) arrayList3.get(size4);
            PointF pointF3 = aVar2.f23354a;
            PointF pointF4 = aVar2.f23355b;
            PointF pointF5 = aVar2.f23356c;
            boolean z13 = z12;
            PointF pointF6 = aVar3.f23354a;
            PointF pointF7 = aVar3.f23355b;
            PointF pointF8 = aVar3.f23356c;
            ((dd.a) arrayList.get(size4)).f23354a.set(kd.h.f(pointF3.x, pointF6.x, f5), kd.h.f(pointF3.y, pointF6.y, f5));
            ((dd.a) arrayList.get(size4)).f23355b.set(kd.h.f(pointF4.x, pointF7.x, f5), kd.h.f(pointF4.y, pointF7.y, f5));
            ((dd.a) arrayList.get(size4)).f23356c.set(kd.h.f(pointF5.x, pointF8.x, f5), kd.h.f(pointF5.y, pointF8.y, f5));
            size4--;
            z12 = z13;
            arrayList2 = arrayList2;
            pVar8 = pVar8;
            arrayList3 = arrayList3;
        }
        fd.p pVar9 = pVar8;
        boolean z14 = z12;
        ArrayList arrayList4 = this.m;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            pVar = pVar9;
            while (true) {
                ArrayList arrayList5 = pVar.f27194a;
                if (size5 < 0) {
                    break;
                }
                s sVar = (s) this.m.get(size5);
                sVar.getClass();
                if (arrayList5.size() <= 2) {
                    i11 = size5;
                } else {
                    float fFloatValue = ((Float) sVar.f57714b.f()).floatValue();
                    if (fFloatValue == CropImageView.DEFAULT_ASPECT_RATIO) {
                        i11 = size5;
                    } else {
                        boolean z15 = pVar.f27196c;
                        int size6 = arrayList5.size() - 1;
                        int i13 = 0;
                        while (size6 >= 0) {
                            dd.a aVar4 = (dd.a) arrayList5.get(size6);
                            dd.a aVar5 = (dd.a) arrayList5.get(s.f(size6 - 1, arrayList5.size()));
                            PointF pointF9 = (size6 != 0 || z15) ? aVar5.f23356c : pVar.f27195b;
                            int i14 = size5;
                            i13 = (((size6 != 0 || z15) ? aVar5.f23355b : pointF9).equals(pointF9) && aVar4.f23354a.equals(pointF9) && !((pVar.f27196c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z14)) ? i13 + 2 : i13 + 1;
                            size6--;
                            size5 = i14;
                        }
                        i11 = size5;
                        fd.p pVar10 = sVar.f57715c;
                        if (pVar10 == null || pVar10.f27194a.size() != i13) {
                            ArrayList arrayList6 = new ArrayList(i13);
                            for (int i15 = 0; i15 < i13; i15++) {
                                arrayList6.add(new dd.a());
                            }
                            i12 = 0;
                            sVar.f57715c = new fd.p(new PointF(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO), false, arrayList6);
                        } else {
                            i12 = 0;
                        }
                        fd.p pVar11 = sVar.f57715c;
                        pVar11.f27196c = z15;
                        PointF pointF10 = pVar.f27195b;
                        pVar11.a(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = pVar11.f27194a;
                        boolean z16 = pVar.f27196c;
                        int i16 = i12;
                        int i17 = i16;
                        while (i16 < arrayList5.size()) {
                            dd.a aVar6 = (dd.a) arrayList5.get(i16);
                            dd.a aVar7 = (dd.a) arrayList5.get(s.f(i16 - 1, arrayList5.size()));
                            dd.a aVar8 = (dd.a) arrayList5.get(s.f(i16 - 2, arrayList5.size()));
                            PointF pointF11 = (i16 != 0 || z16) ? aVar7.f23356c : pVar.f27195b;
                            PointF pointF12 = (i16 != 0 || z16) ? aVar7.f23355b : pointF11;
                            float f11 = fFloatValue;
                            PointF pointF13 = aVar6.f23354a;
                            PointF pointF14 = aVar8.f23356c;
                            boolean z17 = z16;
                            PointF pointF15 = aVar6.f23356c;
                            boolean z18 = (pVar.f27196c || !(i16 == 0 || i16 == arrayList5.size() + (-1))) ? false : z14;
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z18) {
                                float f12 = pointF11.x;
                                float f13 = f12 - pointF14.x;
                                float f14 = pointF11.y;
                                float f15 = f14 - pointF14.y;
                                float f16 = pointF15.x - f12;
                                float f17 = pointF15.y - f14;
                                double d5 = f13;
                                fd.p pVar12 = pVar11;
                                fd.p pVar13 = pVar;
                                float fHypot = (float) Math.hypot(d5, f15);
                                float fHypot2 = (float) Math.hypot(f16, f17);
                                float fMin = Math.min(f11 / fHypot, 0.5f);
                                float fMin2 = Math.min(f11 / fHypot2, 0.5f);
                                float f18 = pointF11.x;
                                float fA = p0.a(pointF14.x, f18, fMin, f18);
                                float f19 = pointF11.y;
                                float fA2 = p0.a(pointF14.y, f19, fMin, f19);
                                float fA3 = p0.a(pointF15.x, f18, fMin2, f18);
                                float fA4 = p0.a(pointF15.y, f19, fMin2, f19);
                                float f21 = fA - ((fA - f18) * 0.5519f);
                                float f22 = fA2 - ((fA2 - f19) * 0.5519f);
                                float f23 = fA3 - ((fA3 - f18) * 0.5519f);
                                float f24 = fA4 - ((fA4 - f19) * 0.5519f);
                                dd.a aVar9 = (dd.a) arrayList7.get(s.f(i17 - 1, arrayList7.size()));
                                dd.a aVar10 = (dd.a) arrayList7.get(i17);
                                pVar4 = pVar13;
                                aVar9.f23355b.set(fA, fA2);
                                aVar9.f23356c.set(fA, fA2);
                                pVar3 = pVar12;
                                if (i16 == 0) {
                                    pVar3.a(fA, fA2);
                                }
                                aVar10.f23354a.set(f21, f22);
                                dd.a aVar11 = (dd.a) arrayList7.get(i17 + 1);
                                aVar10.f23355b.set(f23, f24);
                                aVar10.f23356c.set(fA3, fA4);
                                aVar11.f23354a.set(fA3, fA4);
                                i17 += 2;
                            } else {
                                pVar3 = pVar11;
                                pVar4 = pVar;
                                dd.a aVar12 = (dd.a) arrayList7.get(s.f(i17 - 1, arrayList7.size()));
                                dd.a aVar13 = (dd.a) arrayList7.get(i17);
                                PointF pointF16 = aVar7.f23355b;
                                aVar12.f23355b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = aVar7.f23356c;
                                aVar12.f23356c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = aVar6.f23354a;
                                aVar13.f23354a.set(pointF18.x, pointF18.y);
                                i17++;
                            }
                            i16++;
                            pVar11 = pVar3;
                            pVar5 = pVar5;
                            arrayList5 = arrayList5;
                            fFloatValue = f11;
                            z16 = z17;
                            pVar6 = pVar6;
                            pVar = pVar4;
                        }
                        pVar = pVar11;
                    }
                }
                size5 = i11 - 1;
                pVar5 = pVar5;
                pVar6 = pVar6;
            }
        } else {
            pVar = pVar9;
        }
        fd.p pVar14 = pVar5;
        fd.p pVar15 = pVar6;
        Path path = this.f59119j;
        kd.h.e(pVar, path);
        if (this.f59097e == null) {
            return path;
        }
        if (this.f59120k == null) {
            this.f59120k = new Path();
            this.f59121l = new Path();
        }
        kd.h.e(pVar14, this.f59120k);
        if (pVar15 != null) {
            pVar2 = pVar15;
            kd.h.e(pVar2, this.f59121l);
        } else {
            pVar2 = pVar15;
        }
        u uVar = this.f59097e;
        float f25 = aVar.f39894g;
        float fFloatValue2 = aVar.f39895h.floatValue();
        fd.p pVar16 = pVar2;
        Path path2 = this.f59120k;
        return (Path) uVar.u(f25, fFloatValue2, path2, pVar16 == null ? path2 : this.f59121l, f5, e(), this.f59096d);
    }

    @Override // zc.d
    public final boolean l() {
        ArrayList arrayList = this.m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
